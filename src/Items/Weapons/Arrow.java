package Items.Weapons;

import Items.Consumable;

public class Arrow extends Weapon implements Consumable {

<<<<<<< HEAD
    public int numberOfArrows = 1;

    public  Arrow(){
        value = Set.ArrowValue;
        weight = Set.ArrowWeight;
=======
    public Arrow(){
        value = 0;
        weight = 0;
>>>>>>> 0b54a3a8c402e6916a5eb77b7d67e37424e8ff2e
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
