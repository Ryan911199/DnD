package Items.Food;

import Items.*;

public class Bread extends item implements Consumable{

    public Bread()
    {
        value = Set.BreadValue;
        weight = Set.BreadWeight;

    }

    @Override
    public String toString() {
        return "Bread";
    }

    @Override
    public int consume() {
        return Set.BreadHeal;
    }

    @Override
    public int health() {
        return Set.BreadHeal;
    }
}
