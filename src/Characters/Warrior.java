package Characters;

public class Warrior extends Character {

    public Warrior() {
        //TODO implement correct stats for Warrior
        hitPointsPerLevel = 10;
        magicPointsPerLevel = 0;

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
