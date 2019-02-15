package Items.Weapons;

import Items.Consumable;

public class Arrow extends Weapon implements Consumable {
    public int attack()
    {
       consume();
        return 12;
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
