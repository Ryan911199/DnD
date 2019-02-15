package Items.Food;

import Items.*;

public class Ambrosia extends item implements Consumable
{

    public Ambrosia()
    {
        value = 100;
        weight = 5;
    }

    @Override
    public String toString() {
        return "Ambrosia";
    }

    @Override
    public void consume() {

    }

    @Override
    public int health() {
        return 100;
    }
}
