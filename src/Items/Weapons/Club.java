package Items.Weapons;

public class Club extends Weapon
{
    public Club()
    {
        weight = 15;
        value = 3;
        isRanged = false;
    }

    @Override
    public int attack() {
        return 10;
    }

    @Override
    public String toString() {
        return "Club";
    }
}
