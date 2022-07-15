package com.ruse.world.content;


import com.ruse.model.container.impl.Equipment;
import com.ruse.model.definitions.ItemDefinition;
import com.ruse.world.entity.impl.player.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BestDRItemsInterface {
    private static String[] text = new String[]{"Head", "Body", "Legs", "Weapon", "Shield", "Amulet", "Cape", "Gloves",
            "Boots", "Ring", "Auras", "Pets", "Misc"};
    public static List<Integer> itemsToIgnore = new ArrayList() {
        {
            add(5424); //add custom items ids here

        }
    };

    public static boolean buttonClicked(Player player, int buttonId) {
        if (buttonId >= 109310 && buttonId <= 109314) {
            int index = (buttonId - 109310);
            openInterface(player, index);
            return true;
        } else if (buttonId >= 109316 && buttonId <= 109320) {
            int index = (buttonId - 109316) + 5;
            openInterface(player, index);
            return true;
        } else if (buttonId == 109322) {
            openInterface(player, 14);
            return true;
        } else if (buttonId == 109323) {
            openInterface(player, 15);
            return true;
        } else if (buttonId == 109324) {
            openInterface(player, 17);
            return true;
        }
        return false;
    }

    public static int getSlotForButton(int index){
  int slot = 0;
        switch(index){
            case 0:
                slot = Equipment.HEAD_SLOT;
                break;
            case 1:
                slot = Equipment.BODY_SLOT;
                break;
            case 2:
                slot = Equipment.LEG_SLOT;
                break;
            case 3:
                slot = Equipment.WEAPON_SLOT;
                break;
            case 4:
                slot = Equipment.SHIELD_SLOT;
                break;
            case 5:
                slot = Equipment.AMULET_SLOT;
                break;
            case 6:
                slot = Equipment.CAPE_SLOT;
                break;
            case 7:
                slot = Equipment.HANDS_SLOT;
                break;
            case 8:
                slot = Equipment.FEET_SLOT;
                break;
            case 9:
                slot = Equipment.RING_SLOT;
                break;
            case 10:
                slot = Equipment.AURA_SLOT;
                break;
            case 11: //PETS

                break;
            case 12://misc

                break;
        }


        return slot;
    }
    public static void openInterface(Player player, int bonus) {

        for (int i = 0; i < 5; i++) {
            player.getPacketSender().sendString(109310 + i, (bonus == i ? "@whi@Check " : "Check ") + text[i]);
        }
        for (int i = 5; i < 10; i++) {
            player.getPacketSender().sendString(109311 + i, (bonus == i ? "@whi@Check " : "Check ") + text[i]);
        }
        player.getPacketSender().sendString(109322, (bonus == 14 ? "@whi@Check " : "Check ") + text[10]);
        player.getPacketSender().sendString(109323, (bonus == 15 ? "@whi@Check " : "Check ") + text[11]);
        player.getPacketSender().sendString(109324, (bonus == 17 ? "@whi@Check " : "Check ") + text[12]);

        ArrayList<ItemDefinition> objects = new ArrayList<ItemDefinition>();

        for (ItemDefinition i : ItemDefinition.getDefinitions()) {
            if (i != null) {
                if (!i.isNoted() && i.getDropratechance() > 0 && !itemsToIgnore.contains(i.getId()) && i.getEquipmentSlot() ==
                    getSlotForButton(bonus))
                    objects.add(i);
            }
        }

        Collections.sort(objects, new Comparator<ItemDefinition>() {
            @Override
            public int compare(ItemDefinition p, ItemDefinition p1) {
                if (p.getDropratechance() == p1.getDropratechance()) {
                    return 0;
                } else if (p.getDropratechance() > p1.getDropratechance()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        int interId = 109402;
        int size = (objects.size() >= 100 ? 100 : objects.size());
        for (int i = 0; i < size; i++) {
            player.getPacketSender().sendString(interId++,
                    "" + objects.get(i).getDropratechance());
            player.getPacketSender().sendString(interId++, "" + objects.get(i).getName());
            player.getPacketSender().sendItemOnInterface(interId++, objects.get(i).getId(), 1);

            System.out.println("add(" + objects.get(i).getId() + ");//" + objects.get(i).getName());
            interId++;
        }
        player.getPacketSender().sendInterface(109300);

        player.getPacketSender().setScrollBar(109350, size * 40);

    }

}
