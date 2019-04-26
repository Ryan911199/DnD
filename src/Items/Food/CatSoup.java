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
    public int consume() {
        return Set.CatSoupHeal;
    }

    @Override
    public int health() {
        return Set.CatSoupHeal;
    }
}
