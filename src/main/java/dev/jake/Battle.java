package dev.jake;

import dev.jake.unit.Unit;

public class Battle {

    public static Unit fight(Unit unit1, Unit unit2) {
        System.out.printf("Battle starts between\n\n%s\n\nAND\n\n%s\n", unit1, unit2);

        Unit attacker = unit1;
        Unit defender = unit2;


        while (unit1.getHp() > 0 && unit2.getHp() > 0) {


            attacker.takeTurn(defender);

            System.out.println("\nDefender status: \n" + defender);


            // swap roles
            Unit temp = attacker;
            attacker = defender;
            defender = temp;

        }

        Unit winner = unit1.getHp() > 0 ? unit1 : unit2;
        winner.increaseWinCount();



        System.out.println(winner.getName() + " wins!");
        System.out.printf("Total wins: %d\n", winner.getWinCount());

        return winner;


    }



}
