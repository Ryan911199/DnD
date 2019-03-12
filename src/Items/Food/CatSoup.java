package Items.Food;

import Items.*;

public class CatSoup extends item implements Consumable{

    public CatSoup()
    {
        value = Set.CatSoupValue;
        weight = Set.CatSoupWeight;
    }
    @Override
    public String toString() {
        return "Cat Soup";
    }

    @Override
    public void consume() {
        //TODO implement consume
    }

    @Override
    public int health() {
        return Set.CatSoupHeal;
    }
}
