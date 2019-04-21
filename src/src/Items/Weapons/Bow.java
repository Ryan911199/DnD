package Items.Weapons;

public class Bow extends Weapon {
    public Bow(){
        weight = Set.BowWeight;
        value = Set.BowValue;
        isRanged = true;
    }

    @Override
    public int attack() {
        return Set.BowAttack;
    }

    @Override
    public String toString() {
        return "Bow";
    }
}
