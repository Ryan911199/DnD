package Items.Food;

import Items.*;

public class Ambrosia extends item implements Consumable
{
    public Ambrosia()
    {
        value = Set.AmbrosiaValue;
        weight = Set.AmbrosiaWeight;
    }

    @Override
    public String toString() {
        return "Ambrosia";
    }

    @Override
    public void consume() {
        //TODO implement consume
    }

    @Override
    public int health() {
        return Set.AmbrosiaHeal;
    }
}
