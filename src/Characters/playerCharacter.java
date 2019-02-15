package Characters;

import Items.item;

public abstract class playerCharacter {
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
    public Race Race;
    public item[] Inventory = new item[20];



    public void Setup(String Name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, Race PlayerRace){
        name = Name;
        Strength = strength;
        Dexterity = dexterity;
        Constitution = constitution;
        Intelligence = intelligence;
        Wisdom = wisdom;
        Charisma = charisma;
        Race = PlayerRace;
    }
    public void printInventory(){
        int i = 0;
        System.out.println("Inventory");
        while (Inventory[i] != null && i < 20){
            System.out.print("   " + (i+1) + ". " + Inventory[i] );
            i++;
        }
    }
    public void addInventory(item newI){
        for(int x = 0; x < Inventory.length; x++){
            if(Inventory[x] == null){
                Inventory[x] = newI;
                return;
            }
        }
        System.out.println("Your Inventory is full please drop an item");
    }
    public abstract String toString();

}

