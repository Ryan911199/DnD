package Items.Weapons;

public class Sword extends Weapon {
    public Sword() {
        weight = 5;
        value = 10;
    }

    public int attack() {
        return 20;
    }

    @Override
    public String toString() {
        return "Sword";
    }
}
