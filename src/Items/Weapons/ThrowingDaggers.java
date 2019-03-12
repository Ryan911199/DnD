package Items.Weapons;

import Items.Consumable;

public class ThrowingDaggers extends Weapon implements Consumable
{
    public ThrowingDaggers()
    {
        value = Set.ThrowingDaggersValue;
        weight = Set.ThrowingDaggersWeight;
        isRanged = true;
    }
    @Override
    public int attack() {
        return Set.ThrowingDaggersAttack;
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
