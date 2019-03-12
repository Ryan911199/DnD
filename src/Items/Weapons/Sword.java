package Items.Weapons;

public class Sword extends Weapon
{
    public Sword() {
        weight = 10;
        value = 10;
        isRanged = false;
    }

    public int attack() {
        return 20;
    }

    @Override
    public String toString() {
        return "Sword";
    }
}
