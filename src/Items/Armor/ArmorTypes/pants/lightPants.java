package Items.Armor.ArmorTypes.pants;

public class lightPants extends pants
{
    public lightPants()
    {
        value = Set.lightPantsValue;
        weight = Set.lightPantsWeight;
        armorBonus = Set.lightPantsArmorBonus;
        dexBonus = Set.lightPantsDexBonus;
    }
    @Override
    public String toString() {
        return "light pants";
    }
}
