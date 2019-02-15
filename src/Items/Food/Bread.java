package Items.Food;

import Items.*;

public class Bread extends item implements Consumable{

    public Bread()
    {
        value = 10;
        weight = 5;

    }

    @Override
    public String toString() {
        return "Bread";
    }

    @Override
    public void consume() {
        //TODO implement consume
    }

    @Override
    public int health() {
        return 20;
    }
}
