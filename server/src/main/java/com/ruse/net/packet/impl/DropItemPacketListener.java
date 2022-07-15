package com.ruse.net.packet.impl;

import com.ruse.model.*;
import com.ruse.model.Locations.Location;
import com.ruse.model.definitions.ItemDefinition;
import com.ruse.net.packet.Packet;
import com.ruse.net.packet.PacketListener;
import com.ruse.world.content.PlayerLogs;
import com.ruse.world.content.Sounds;
import com.ruse.world.content.Sounds.Sound;
import com.ruse.world.content.skill.impl.old_dungeoneering.ItemBinding;
import com.ruse.world.entity.impl.GroundItemManager;
import com.ruse.world.entity.impl.player.Player;

/**
 * This packet listener is called when a player drops an item they have placed
 * in their inventory.
 * 
 * @author relex lawl
 */

public class DropItemPacketListener implements PacketListener {

	@Override
	public void handleMessage(Player player, Packet packet) {
		int id = packet.readUnsignedShortA();
		int interfaceIndex = packet.readUnsignedShort();
		int itemSlot = packet.readUnsignedShortA();
		if (player.getConstitution() <= 0 || player.getInterfaceId() > 0)
			return;
		if (itemSlot < 0 || itemSlot > player.getInventory().capacity())
			return;
		if (player.getConstitution() <= 0 || player.isTeleporting())
			return;
		if (player.isPlayerLocked())
			return;
		Item item = player.getInventory().getItems()[itemSlot];
		if (item == null)
			return;
		if (item.getId() != id) {
			return;
		}
		if (!player.getControllerManager().canDropItem(item)) {
			return;
		}

		player.getPacketSender().sendInterfaceRemoval();
		player.getCombatBuilder().cooldown(false);
		if (player.getLocation() != null && player.getLocation() == Location.GENERAL) {
			player.getPacketSender().sendMessage("You cannot drop items here");
			return;
		}
		switch (item.getId()) {
			case 6769:
			case 10942:
			case 10934:
			case 10935:
			case 10943:
			case 10946:
				player.getPacketSender().sendMessage("@red@You can not drop bonds, you can only trade via player owned shops!");
				return;
		}
		if (item.getId() != -1 && item.getAmount() >= 1) {
			if (item.tradeable() && !ItemBinding.isBoundItem(item.getId())) {
				player.getInventory().setItem(itemSlot, new Item(-1, 0)).refreshItems();
				if (item.getId() == 4045) {
					player.dealDamage(new Hit((player.getConstitution() - 1) == 0 ? 1 : player.getConstitution() - 1,
							Hitmask.CRITICAL, CombatIcon.BLUE_SHIELD));
					player.performGraphic(new Graphic(1750));
					player.getPacketSender().sendMessage("The potion explodes in your face as you drop it!");
				}
				else {
					boolean goGlobal = player.getPosition().getZ() >= 0 && player.getPosition().getZ() < 4 ? true : false;
					GroundItemManager.spawnGroundItem(player, new GroundItem(item, player.getPosition().copy(),
							player.getUsername(), player.getHostAddress(), false, 80,
							goGlobal
							, 80));
					PlayerLogs.log(player.getUsername(),
							"Player dropping item: " + (ItemDefinition.forId(item.getId()) != null
									&& ItemDefinition.forId(item.getId()).getName() != null
											? ItemDefinition.forId(item.getId()).getName()
											: item.getId())
									+ ", amount: " + item.getAmount());
				}

				PlayerLogs.logDroppedItem(player.getUsername(), "Player dropped item: " + item.getDefinition().getName()
						+ ", id: " + item.getId() + ", amount: " + item.getAmount());

				Sounds.sendSound(player, Sound.DROP_ITEM);
			} else
				destroyItemInterface(player, item);
		}
	}

	public static void destroyItemInterface(Player player, Item item) {// Destroy item created by Remco
		player.setUntradeableDropItem(item);
		String[][] info = { // The info the dialogue gives
				{ "Are you sure you want to discard this item?", "14174" }, { "Yes.", "14175" }, { "No.", "14176" },
				{ "", "14177" }, { "This item will vanish once it hits the floor.", "14182" },
				{ "You cannot get it back if discarded.", "14183" }, { item.getDefinition().getName(), "14184" } };
		player.getPacketSender().sendItemOnInterface(14171, item.getId(), 0, item.getAmount());
		for (int i = 0; i < info.length; i++)
			player.getPacketSender().sendString(Integer.parseInt(info[i][1]), info[i][0]);
		player.getPacketSender().sendChatboxInterface(14170);
	}
}
