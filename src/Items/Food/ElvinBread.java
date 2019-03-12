package Items.Food;

import Items.*;

public class ElvinBread extends item implements Consumable
{

    public ElvinBread()
    {
        value = Set.ElvinBreadValue;
        weight = Set.ElvinBreadWeight;
    }

    @Override
    public String toString() {
        return "Elvin Bread";
    }


    @Override
    public void consume() {
        //TODO implement consume
    }

    @Override
    public int health() {
        return Set.ElvinBreadHeal;
    }
}
