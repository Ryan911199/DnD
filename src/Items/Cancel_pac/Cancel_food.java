package Items.Cancel_pac;

import Items.Consumable;
import Items.item;

public class Cancel_food extends item implements Consumable, Cancel {
    @Override
    public String toString() {
        return "Cancel";
    }

    @Override
    public int consume() {
        return 0;
    }

    @Override
    public int health() {
        return 0;
    }
}
