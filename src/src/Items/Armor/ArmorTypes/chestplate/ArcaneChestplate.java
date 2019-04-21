package Items.Armor.ArmorTypes.chestplate;

public class ArcaneChestplate extends chestplate
{
    public ArcaneChestplate()
    {
        value = Set.ArcaneChestplateValue;
        weight = Set.ArcaneChestplateWeight;
        armorBonus = Set.ArcaneChestplateArmorBonus;
        dexBonus = Set.ArcaneChestplateDexBonus;
    }
    @Override
    public String toString() {
        return "Arcane Chestplate";
    }
}
