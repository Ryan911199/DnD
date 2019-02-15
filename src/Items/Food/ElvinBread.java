package Items.Food;

import Items.*;

public class ElvinBread extends item implements Consumable
{

    public ElvinBread()
    {
        value = 90;
        weight = 4;
    }

    @Override
    public String toString() {
        return "Elvin Bread";
    }


    @Override
    public void consume() {

    }

    @Override
    public int health() {
        return 65;
    }
}
