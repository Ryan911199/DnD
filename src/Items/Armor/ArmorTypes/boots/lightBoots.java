package Items.Armor.ArmorTypes.boots;
import Items.Armor.*;
public class lightBoots extends boots
{
    public lightBoots()
    {
        value = Set.lightBootsValue;
        weight = Set.lightBootsWeight;
        armorBonus = Set.lightBootsArmorBonus;
        dexBonus = Set.lightBootsDexBonus;
    }

    @Override
    public String toString() {
        return "light boots";
    }
}
