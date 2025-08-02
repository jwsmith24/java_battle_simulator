package dev.jake.unit;

import dev.jake.util.AttackType;

public class Archer extends Unit {

    public Archer(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

    @Override
    public void takeTurn(Unit target) {

        int damage = this.attackPower;

        super.logAttack(target, damage);

        target.takeDamage(AttackType.RANGED, damage);

    }

    @Override
    public void takeDamage(AttackType attackType, int damage) {

        if ( Math.random() < 0.25) {
            damage = 0;
            System.out.println(this.name + " dodged the attack!");
        }

        super.takeDamage(attackType, damage);
    }


}
