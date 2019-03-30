package Items.Food;

import Items.*;

public class LegofLamb extends item implements Consumable
{

    public LegofLamb()
    {
        value = Set.LegofLambValue;
        weight = Set.LegofLambWeight;
    }

    @Override
    public String toString() {
        return "Leg of Lamb";
    }

    @Override
    public int consume() {
        return Set.LegofLambHeal;
    }

    @Override
    public int health() {
        return Set.LegofLambHeal;
    }
}
