package Items.Weapons;

public class BroadSword extends Weapon {
    public BroadSword() {
        weight = 20;
        value = 20;
        isRanged = false;
    }

    @Override
    public int attack() {
        return 45;
    }

    @Override
    public String toString() {
        return "Broad Sword";
    }
}
