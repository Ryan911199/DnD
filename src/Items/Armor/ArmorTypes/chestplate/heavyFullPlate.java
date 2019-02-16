package Items.Armor.ArmorTypes.chestplate;
import Items.Armor.Armor;
public class heavyFullPlate extends chestplate
{
    public heavyFullPlate()
    {
        value = 10;
        weight = 15;
        armorBonus = 2;
        dexBonus = 6;
    }

    @Override
    public String toString() {
        return "Full Plate";
    }
}
