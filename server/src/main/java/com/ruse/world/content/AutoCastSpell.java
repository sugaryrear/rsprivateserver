package com.ruse.world.content;

import com.ruse.model.container.impl.Equipment;
import com.ruse.world.content.combat.magic.CombatSpells;
import com.ruse.world.entity.impl.player.Player;

public enum AutoCastSpell {

    STARTER(16995, CombatSpells.BEGINNER),
    FESTIVE(14924, CombatSpells.BEGINNER),
    ARTS(22092, CombatSpells.BEGINNER),
    GANO(8809, CombatSpells.BEGINNER),
    MOONLIGHT(18629, CombatSpells.MEDIUM),
    VINDICTA(17600, CombatSpells.MEDIUM),
    RUTHLESS(23145, CombatSpells.MEDIUM),
    MAGIC(23026,CombatSpells.MEDIUM)
    ;

    private int itemId;
    private CombatSpells spell;

    AutoCastSpell(int itemId, CombatSpells spell) {
        this.itemId = itemId;
        this.spell = spell;
    }

    public static CombatSpells getAutoCastSpell(Player player) {
        if (player.getEquipment().get(Equipment.WEAPON_SLOT).getId() == 18629) {
            return CombatSpells.MEDIUM;
        }
        for (AutoCastSpell d : AutoCastSpell.values()) {
            if (player.getEquipment().get(Equipment.WEAPON_SLOT).getId() == d.getItemId()) {
                return d.getSpell();
            }
        }
        return null;
    }


    public static AutoCastSpell getAutoCast(Player player) {
        for (AutoCastSpell d : AutoCastSpell.values()) {
            if (player.getEquipment().get(Equipment.WEAPON_SLOT).getId() == d.getItemId()) {
                return d;
            }
        }
        return null;
    }

    public int getItemId() {
        return itemId;
    }

    public CombatSpells getSpell() {
        return spell;
    }

}
