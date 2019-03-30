package Items.Armor.ArmorTypes.chestplate;
import Items.Armor.Armor;
public class heavyFullPlate extends chestplate
{
    public heavyFullPlate()
    {
        value = 1500;
        weight = 50;
        armorBonus = 8;
        dexBonus = 1;
    }

    @Override
    public String toString() {
        return "Full Plate";
    }
}
