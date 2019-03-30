package Items.Armor.ArmorTypes.chestplate;

public class ArcaneChestplate extends chestplate
{
    public ArcaneChestplate()
    {
        value = 5000;
        weight = 15;
        armorBonus = 15;
        dexBonus = 7;
    }
    @Override
    public String toString() {
        return "Arcane Chestplate";
    }
}
