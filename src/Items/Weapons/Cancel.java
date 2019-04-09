package Items.Weapons;

public class Cancel extends Weapon {
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public String toString() {
        return "you canceled your action";
    }
}
