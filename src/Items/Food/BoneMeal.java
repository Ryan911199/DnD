package Items.Food;

import Items.*;

public class BoneMeal extends item implements Consumable
{

    public BoneMeal()
    {
        value = Set.BoneMealValue;
        weight = Set.BoneMealWeight;
    }

    @Override
    public String toString(){
        return "Bone Meal";
    }


    @Override
    public int consume() {
        return Set.BoneMealHeal;
    }

    @Override
    public int health() {
        return Set.BoneMealHeal;
    }
}
