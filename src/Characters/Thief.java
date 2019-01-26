package Characters;

public class Thief extends Character {

    public Thief() {
        //TODO implement correct stats for Thief
        hitPointsPerLevel = 10;
        magicPointsPerLevel = 0;

    }

    public void printClass() {
        super.printClass();
        System.out.println("I am a proud Thief");
    }

    public int ultimateAttack() {
        return -20;
    }
}
