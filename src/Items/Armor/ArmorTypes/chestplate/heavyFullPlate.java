package Items.Armor.ArmorTypes.chestplate;
import Items.Armor.Armor;
public class heavyFullPlate extends chestplate
{
    public heavyFullPlate()
    {
        value = Set.heavyFullPlateValue;
        weight = Set.heavyFullPlateWeight;
        armorBonus = Set.heavyFullPlateArmorBonus;
        dexBonus = Set.heavyFullPlateDexBonus;
    }

    @Override
    public String toString() {
        return "Full Plate";
    }
}
