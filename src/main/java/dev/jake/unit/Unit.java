package dev.jake.unit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Unit {

    private String name;
    private int hp;
    private int attackPower;


    public Unit(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public void takeTurn(Unit target) {

    }
}
