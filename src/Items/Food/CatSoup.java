package Items.Food;

import Items.*;

public class CatSoup extends item implements Consumable{

    public CatSoup()
    {
        value = 25;
        weight = 12;
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
        return 30;
    }
}
