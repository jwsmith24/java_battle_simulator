package dev.jake;


import dev.jake.unit.Archer;
import dev.jake.unit.Mage;
import dev.jake.unit.Unit;
import dev.jake.unit.Warrior;

public class Main {
    public static void main(String[] args) {

        Unit mage = new Mage("Pete", 30, 8);
        Unit warrior = new Warrior("Bob", 46, 10);

        Unit round1Winner = Battle.fight(mage, warrior);

        Unit archer = new Archer("Doug", 37, 7);

        Unit round2Winner = Battle.fight(round1Winner, archer);



    }
}