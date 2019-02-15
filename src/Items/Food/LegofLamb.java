package Items.Food;

import Items.*;

public class LegofLamb extends item implements Consumable
{

    public LegofLamb()
    {
        value = 35;
        weight = 15;
    }

    @Override
    public String toString() {
        return "Leg of Lamb";
    }

    @Override
    public void consume() {

    }

    @Override
    public int health() {
        return 50;
    }
}
