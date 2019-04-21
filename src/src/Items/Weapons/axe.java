package Items.Weapons;

public class axe extends Weapon
{
    public axe()
    {
        weight = Set.AxeWeight;
        value = Set.AxeValue;
        isRanged = false;
    }

    @Override
    public int attack() {
        return Set.AxeAttack;
    }

    @Override
    public String toString() {
        return "Axe";
    }
}
