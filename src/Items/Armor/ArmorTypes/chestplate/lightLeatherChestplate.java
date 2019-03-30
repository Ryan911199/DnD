package Items.Armor.ArmorTypes.chestplate;
import Items.Armor.Armor;
public class lightLeatherChestplate extends chestplate
{
    public lightLeatherChestplate()
    {
        value = Set.lightLeatherChestplateValue;
        weight = 15;
        armorBonus = 2;
        dexBonus = 6;
    }

    @Override
    public String toString() {
        return "Leather Chestplate";
    }
}
