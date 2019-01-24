package Items.Weapons;

import Items.Consumable;

public class Arrow extends Weapon implements Consumable
{
    public int attack()
    {
       consume();
        return 12;
    }

    public void consume()
    {
        System.out.println("I am consumed");
    }

    public void dispose()
    {
        System.out.println("Disposing");
    }
}
