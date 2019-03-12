package Items.Weapons;

public class Knife extends Weapon
{
    public Knife()
    {
        weight = 5;
        value = 5;
        isRanged = false;
    }

    @Override
    public int attack() {
        return 10;
    }

    @Override
    public String toString() {
        return "Knife";
    }
}
