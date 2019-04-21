package Items.Armor.ArmorTypes.chestplate;
import Items.Armor.Armor;
public class lightLeatherChestplate extends chestplate
{
    public lightLeatherChestplate()
    {
        value = Set.lightLeatherChestplateValue;
        weight = Set.lightLeatherChestplateWeight;
        armorBonus = Set.lightLeatherChestplateArmorBonus;
        dexBonus = Set.lightLeatherChestplateDexBonus;
    }

    @Override
    public String toString() {
        return "Leather Chestplate";
    }
}
