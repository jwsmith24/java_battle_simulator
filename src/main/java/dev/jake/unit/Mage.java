package dev.jake.unit;

import dev.jake.util.AttackType;

public class Mage extends Unit{

    public Mage(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

    @Override
    public void takeTurn(Unit target) {

        int damage = this.getAttackPower(); // base damage

        if (target instanceof Warrior) {
            // add bonus damage
            damage += 2;

        }

        super.logAttack(target, damage);

        target.takeDamage(AttackType.MAGIC, damage);
    }

}
