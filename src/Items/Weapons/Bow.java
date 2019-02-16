package Items.Weapons;

public class Bow extends Weapon {
    public Bow(){
        weight = 20;
        value = 20;
    }

    @Override
    public int attack() {
        return 45;
    }

    @Override
    public String toString() {
        return "Broad Sword";
    }
}
