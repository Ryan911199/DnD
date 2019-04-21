package Items.Cancel_pac;

import Items.Weapons.Weapon;

public class Cancel_Weapon extends Weapon implements Cancel{
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cancel";
    }
}
