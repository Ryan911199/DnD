package Items.Weapons;

import Items.Consumable;

public class Arrow extends Weapon {

    public Arrow(){
        value = Set.ArrowValue;
        weight = Set.ArrowWeight;
        isRanged = true;
    }

    public int attack()
    {
        return Set.ArrowAttack;
    }

    @Override
    public String toString() {
        return "Arrow";
    }
}
