package Items.Armor.ArmorTypes.chestplate;
import Items.Armor.Armor;
public class mediumChainmail extends chestplate
{
    public mediumChainmail()
    {
        value = Set.mediumChainmailValue;
        weight = Set.mediumChainmailWeight;
        armorBonus = Set.mediumChainmailArmorBonus;
        dexBonus = Set.mediumChainmailDexBonus;
    }

    @Override
    public String toString() {
        return "Chainmail";
    }
}
