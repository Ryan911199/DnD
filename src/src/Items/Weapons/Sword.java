package Items.Weapons;

public class Sword extends Weapon
{
    public Sword() {
        weight = Set.SwordWeight;
        value = Set.SwordValue;
        isRanged = false;
    }

    public int attack() {
        return Set.SwordAttack;
    }

    @Override
    public String toString() {
        return "Sword";
    }
}
