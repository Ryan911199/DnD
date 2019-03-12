package Items.Weapons;

public class BroadSword extends Weapon {
    public BroadSword() {
        weight = Set.BroadSwordWeight;
        value = Set.BroadSwordValue;
        isRanged = false;
    }

    @Override
    public int attack() {
        return Set.BroadSwordAttack;
    }

    @Override
    public String toString() {
        return "Broad Sword";
    }
}
