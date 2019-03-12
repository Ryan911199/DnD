package Items.Weapons;

import Items.Consumable;

public class ThrowingDaggers extends Weapon implements Consumable
{
    public ThrowingDaggers()
    {
        value = 0;
        weight = 0;
        isRanged = true;
    }
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public String toString() {
        return "Throwing Daggers";
    }

    @Override
    public void consume() {
        //TODO implement consume
    }

    @Override
    public int health() {
        return 0;
    }
}
