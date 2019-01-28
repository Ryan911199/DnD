package Characters;

import Items.item;

public class Character {
    public String name;
    public int hitPointsPerLevel;
    public int hitPoints;
    public int magicPointsPerLevel;
    public int magicPoints;
    public int Strength;
    public int Dexterity;
    public int Constitution;
    public int Intelligence;
    public int Wisdom;
    public int Charisma;
    public Race playerRace;
    public item[] Inventory = new item[20];

    public Character(String Name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, Race race) {

        name = Name;
        //hitPointsPerLevel;
        //hitPoints; //TODO fill in correct numbers for Barbarian
        //magicPointsPerLevel;
        //magicPoints;
        Strength = strength;
        Dexterity = dexterity;
        Constitution = constitution;
        Intelligence = intelligence;
        Wisdom = wisdom;
        Charisma = charisma;
        playerRace = race;
    }


    //overwriting
    public void printClass() {
        System.out.println("You stand up and declare:");
    }

    public int attack() {
        return 5;
    }

}

