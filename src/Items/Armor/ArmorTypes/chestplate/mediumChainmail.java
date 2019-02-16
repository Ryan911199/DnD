package Items.Armor.ArmorTypes.chestplate;
import Items.Armor.Armor;
public class mediumChainmail extends chestplate
{
    mediumChainmail()
    {
        value = 150;
        weight = 40;
        armorBonus = 5;
        dexBonus = 2;
    }

    @Override
    public String toString() {
        return "Chainmail";
    }
}
