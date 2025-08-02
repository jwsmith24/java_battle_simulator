package dev.jake.unit;

import dev.jake.util.AttackType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Unit {

    protected String name;
    protected int hp;
    protected int attackPower;

    protected int winCount;


    public Unit(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public void takeTurn(Unit target) {

    }

    public void logAttack(Unit target, int damage) {
        System.out.printf("%s attacks %s for %d damage!\n", this.getName(), target.getName(), damage);
    }

    public void takeDamage(AttackType attackType, int damage) {
        this.hp -= damage;
    }

    public void increaseWinCount() {
        winCount++;
    }



    @Override
    public String toString() {
        return String.format("""
                %s
                HP: %d
                AP: %d
                """, this.name.toUpperCase(), this.hp, this.attackPower);
    }


}
