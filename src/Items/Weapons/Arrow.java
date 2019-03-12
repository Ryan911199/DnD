package Items.Weapons;

import Items.Consumable;

public class Arrow extends Weapon implements Consumable {

    public int numberOfArrows = 1;

    public  Arrow(){
        value = Set.ArrowValue;
        weight = Set.ArrowWeight;
        isRanged = true;
    }

    public int attack()
    {
       consume();
        return Set.ArrowAttack;
    }

    public void consume() {
        //TODO implement consume
    }

    @Override
    public int health() {
        return 0;
    }

    @Override
    public String toString() {
        return "Arrow";
    }
}
