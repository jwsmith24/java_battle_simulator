package dev.jake.unit;

import dev.jake.util.AttackType;

public class Warrior extends Unit {

    public Warrior(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

    @Override
    public void takeTurn(Unit target) {

        int damage = this.getAttackPower();

        super.logAttack(target, damage);

        target.takeDamage(AttackType.MELEE, damage);
    }

    @Override
    public void takeDamage(AttackType attackType, int damage) {
        if (attackType == AttackType.RANGED) {
            int reducedDamage = damage - damage / 4;
            // avoid negative damage
            super.takeDamage(attackType, Math.max(reducedDamage, 0));

        } else {
            super.takeDamage(attackType, damage);
        }
    }
}
