package Items.Weapons;

public class BroadSword extends Weapon
{
    public BroadSword()
    {
        weight = 20;
        value = 20;
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
