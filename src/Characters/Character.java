package Characters;

import Items.item;

public abstract class Character
{
    public String name;
    public int hitPointsPerLevel;
    public int magicPointsPerLevel;
    public int Strength;
    public int Dexterity;
    public int Constitution;
    public int Intelligence;
    public int Wisdom;
    public int Charisma;
    public Race playerRace;
    public item[] Inventory = new item[20];

    public Character()
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
    //public abstract int ultimateAttack();
}

