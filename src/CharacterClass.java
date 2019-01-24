
public abstract class CharacterClass
{

    public int hitPointsPerLevel;
    public int magicPointsPerLevel;
    public int stamina;
    public int dexterity;
    public int screamLevel;
    protected int sneak;

    public CharacterClass()
    {

    }
//overwriting
    public void printClass()
    {
        System.out.println("You stand up and declare:");
    }
    public int attack()
    {
        return 5;
    }
    public abstract int ultimateAttack();
}

