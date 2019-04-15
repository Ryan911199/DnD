package Items.Armor.ArmorTypes.helmet;

public class lightHelmet extends helmet
{
    public lightHelmet()
    {
        value = Set.lightHelmetValue;
        weight = Set.lightHelmetWeight;
        armorBonus = Set.lightHelmetArmorBonus;
        dexBonus = Set.lightHelmetDexBonus;
    }
    @Override
    public String toString() {
        return "light helmet";
    }
}
