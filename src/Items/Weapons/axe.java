package Items.Weapons;

public class axe extends Weapon
{
    public axe()
    {
        weight = 15;
        value = 15;
        isRanged = false;
    }

    @Override
    public int attack() {
        return 30;
    }

    @Override
    public String toString() {
        return "Axe";
    }
}
