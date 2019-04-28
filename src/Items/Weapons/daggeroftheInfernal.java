package Items.Weapons;

public class daggeroftheInfernal extends Weapon
{
    public daggeroftheInfernal()
    {
        weight = Set.KnifeoftheInfernalWeight;
        value = Set.KnifeoftheInfernalValue;
        isRanged = false;
    }

    @Override
    public int attack() {
        return Set.KnifeoftheInfernalValue;
        if (enemy.equal(Demogorg))
            return 999999;
    }

    @Override
    public String toString() {
        return null;
    }
}
