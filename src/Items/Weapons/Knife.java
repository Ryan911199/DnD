package Items.Weapons;

public class Knife extends Weapon
{
    public Knife()
    {
        weight = Set.KnifeWeight;
        value = Set.KnifeValue;
        isRanged = false;
    }

    @Override
    public int attack() {
        return Set.KnifeAttack;
    }

    @Override
    public String toString() {
        return "Knife";
    }
}
