package com.ruse.world.content.seasonpass;


import com.ruse.model.Item;
import com.ruse.model.definitions.ItemDefinition;
import com.ruse.util.Misc;
import com.ruse.world.World;
import com.ruse.world.content.dialogue.Dialogue;
import com.ruse.world.content.dialogue.DialogueExpression;
import com.ruse.world.content.dialogue.DialogueManager;
import com.ruse.world.content.dialogue.DialogueType;
import com.ruse.world.content.minigames.impl.YesNoDialogue;
import com.ruse.world.entity.impl.player.Player;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SeasonPass {

	private Player player;
	private int tier;
	private int xp;
	private boolean member;
	public SeasonPass(Player player) {
		this.player = player;
	}
	public static final int[] SEASON_PASS = {
			/*blue card*/ 23275
	};

	public static boolean isPass(final int itemId) {
		for (int passes : SEASON_PASS) {
			if (passes == itemId) {
				return true;
			}
		}
		return false;
	}

	public void usepass(){
		DialogueManager.start(player, new Dialogue() {

			@Override
			public DialogueType type() {
				return DialogueType.OPTION;
			}

			@Override
			public DialogueExpression animation() {
				return null;
			}

			@Override
			public String[] dialogue() {

				return new String[]{"Unlock season pass", "Cancel"};
			}

			@Override
			public void specialAction() {
				player.setDialogueActionId(6668);
			}

		});


	}

	public static int getSpriteByXp(int xp){
		int spriteId = 1690;//blank
		switch(xp){
			case 1:
				spriteId = 1691;
				break;
			case 2:
				spriteId = 1692;
				break;
			case 3:
				spriteId = 1693;
				break;
			case 4:
				spriteId = 1694;
				break;
			case 5:
				spriteId = 1695;
				break;
			case 6:
				spriteId = 1696;
				break;
				case 7:
				spriteId = 1697;
				break;
				case 8:
				spriteId = 1698;
				break;
				case 9:
				spriteId = 1699;
				break;
				case 10:
				spriteId = 1700;
				break;
		}

		return spriteId;
	}

	/**
	 * after adding xp check if we can go to the next tier or not
	 */
	public void checkafteraddingxp(int xpadded) {
if(tier == 50){
	return;
}

		if(getXp() + xpadded > 10){
			this.xp =((getXp()+xpadded) - 10);
			addTier(1);
			giverewardbasedontier();
		} else if(getXp() + xpadded == 10){
			addTier(1);
			this.xp = 0;
			giverewardbasedontier();
		} else {
			this.xp+=xpadded;
		}
	}
public void giverewardbasedontier() {
	String itemName = "";

	if(player.isunlockedseasonpass()) {
	//	player.getInventory().add(PassRewards.memberRewards[getTier()].getId(),		PassRewards.memberRewards[getTier()].getAmount());
		player.getBank(0).add(PassRewards.memberRewards[getTier()].getId(),		PassRewards.memberRewards[getTier()].getAmount());
itemName =  Misc.formatText(ItemDefinition.forId(PassRewards.memberRewards[getTier()].getId()).getName());
	} else {
		itemName =  Misc.formatText(ItemDefinition.forId(PassRewards.defaultRewards[getTier()].getId()).getName());

		player.getBank(0).add(PassRewards.defaultRewards[getTier()].getId(),		PassRewards.defaultRewards[getTier()].getAmount());

	}
    player.sendMessage("Congratulations you have advanced to tier "+getTier()+"!");
	player.sendMessage("The tier reward ("+itemName+") was sent to your bank.");
}

	/**
	 * previous tier rewards added when you use the season pass
	 */
	public void checkforprevioustiers() {
		for(int i = 0; i <= getTier(); i++){
			player.getBank(0).add(PassRewards.memberRewards[i].getId(),PassRewards.memberRewards[i].getAmount());
		}
		player.sendMessage("The previous tier rewards have been added to your bank!");
		openInterface();
}
	/**
	 * checks what items you have unlocked based on whether youre a member or not
	 */
	public void checkwhatyouhaveunlocked () {

		//first reset all sprites
		for (int i = 0; i < 50; i++) {
			player.getPacketSender().sendConfig(1714+i,0);
			player.getPacketSender().sendConfig(1814+i,0);

		}
		if(player.isunlockedseasonpass()){
			for(int i = 0; i < getTier(); i++){
				player.getPacketSender().sendConfig(1814+i,1);
			}
		} else {
			for(int i = 0; i < getTier(); i++){
				player.getPacketSender().sendConfig(1714+i,1);
			}
		}
	}
	public void openInterface() {
		player.getPacketSender().sendString(105007, "XP: " + getXp() + "/10");
		player.getPacketSender().sendString(105008, "" + getTier());
		player.getPacketSender().sendString(105009, "SEASON " + PassRewards.SEASON);
		player.getPacketSender().sendString(105010, "Season Ends: " + PassRewards.theEndDate()+" (in "+PassRewards.differenceindays()+" days)");
checkwhatyouhaveunlocked();
		int index = 0;
		int interfaceId = 105105;
		player.getPacketSender().sendSpriteChange(105990, getSpriteByXp(getXp()));
		for (int i = 0; i < PassRewards.defaultRewards.length; i++) {
			player.getPacketSender().sendItemOnInterface(interfaceId++, PassRewards.defaultRewards[index].getId(),
					PassRewards.defaultRewards[index].getAmount());
			player.getPacketSender().sendItemOnInterface(interfaceId++, PassRewards.memberRewards[index].getId(),
					PassRewards.memberRewards[index].getAmount());
			interfaceId += 4;
			index++;
		}

		player.getPacketSender().sendInterface(105000);

	}
public void reset() {
        setTier(0);
        setXp(0);
		player.setunlockedseasonpass(false);
}
	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}
	public void addTier(int tiertoadd) {
		this.tier+=tiertoadd;
	}
	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}
	public void addXp(int xptoadd) {
		checkafteraddingxp(xptoadd);
	}
}
