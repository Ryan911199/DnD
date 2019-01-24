package Characters;

import Items.item;

public class Warrior extends CharacterClass {

    public Warrior() {
        //TODO implement correct stats for Warrior
        hitPointsPerLevel = 10;
        magicPointsPerLevel = 0;
        stamina = 10;
        dexterity = 2;
        screamLevel = 20;
        sneak = 0;
    }

    //Overwriting
    public void printClass() {
        super.printClass();
        System.out.println("I am a proud Warrior");
    }

    public int attack() {
        return 25;
    }

    public int ultimateAttack() {
        return attack() * 20;
    }
}
