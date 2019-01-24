package Characters;

import Items.item;

public class Thief extends CharacterClass {

    public Thief() {
        //TODO implement correct stats for Thief
        hitPointsPerLevel = 10;
        magicPointsPerLevel = 0;
        stamina = 10;
        dexterity = 2;
        screamLevel = 20;
        sneak = 0;
    }

    public void printClass() {
        super.printClass();
        System.out.println("I am a proud Thief");
    }

    public int ultimateAttack() {
        return -20;
    }
}
