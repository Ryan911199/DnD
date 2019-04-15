package Items.Armor.ArmorTypes.gauntlets;

public class lightGauntlets extends gauntlets
{
    public lightGauntlets()
    {
        value = Set.lightGauntletsValue;
        weight = Set.lightGauntletsWeight;
        armorBonus = Set.lightGauntletsArmorBonus;
        dexBonus = Set.lightGauntletsDexBonus;
    }
    @Override
    public String toString() {
        return "light gauntlets";
    }
}
