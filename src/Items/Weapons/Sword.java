package Items.Weapons;

public class Sword extends Weapon
{
    public int attack()
    {
        return 20;
    }

    @Override
    public String toString() {
        return "Sword";
    }
}
