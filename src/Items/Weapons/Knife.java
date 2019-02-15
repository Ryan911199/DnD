package Items.Weapons;

public class Knife extends Weapon
{
    @Override
    public int attack() {
        return 10;
    }

    @Override
    public String toString() {
        return "Knife";
    }
}
