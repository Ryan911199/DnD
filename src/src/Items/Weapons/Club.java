package Items.Weapons;

public class Club extends Weapon
{
    public Club()
    {
        weight = Set.ClubWeight;
        value = Set.ClubValue;
        isRanged = false;
    }

    @Override
    public int attack() {
        return Set.ClubAttack;
    }

    @Override
    public String toString() {
        return "Club";
    }
}
