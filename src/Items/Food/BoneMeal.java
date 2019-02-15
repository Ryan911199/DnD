package Items.Food;

import Items.*;

public class BoneMeal extends item implements Consumable
{

    public BoneMeal()
    {
        value = 7;
        weight = 3;
    }

    @Override
    public String toString(){
        return "Bone Meal";
    }


    @Override
    public void consume() {

    }

    @Override
    public int health() {
        return 15;
    }
}
