package Characters;

import Items.item;

public abstract class playerCharacter {
    public String name;
    public int age;
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
    public int gold = 1000000; //TODO give gold



    public void Setup(String Name, int Age, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, Race PlayerRace){
        name = Name;
        age = Age;
        Strength = strength;
        Dexterity = dexterity;
        Constitution = constitution;
        Intelligence = intelligence;
        Wisdom = wisdom;
        Charisma = charisma;
        Race = PlayerRace;
        raceAjustment();
    }

    public void printInventory(){
        int i = 0;
        System.out.println("Inventory");
        while (Inventory[i] != null && i < Inventory.length){
            System.out.print("   " + (i+1) + ". " + Inventory[i] );
            i++;
        }
    }

    public boolean addInventory(item newI){
        for(int x = 0; x < Inventory.length; x++){
            if(Inventory[x] == null){
                Inventory[x] = newI;
                return true;
            }
        }
        System.out.println("Your Inventory is full please drop an item");
        return false;
    }

    public int abilityMod(int score){
        if (score == 2 || score == 3){
            return -4;
        }
        if (score == 4 || score == 5){
            return -3;
        }
        if (score == 6 || score == 7){
            return -2;
        }
        if (score == 8 || score == 9){
            return -1;
        }
        if (score == 10 || score == 11){
            return 0;
        }
        if (score == 12 || score == 13){
            return 1;
        }
        if (score == 14 || score == 15){
            return 2;
        }
        if (score == 16 || score == 17){
            return 3;
        }
        if (score == 18 || score == 19){
            return 4;
        }
        if (score == 20 || score == 21){
            return 5;
        }
        System.out.println("there was a problem in score mod");
        return -100;
    }

    public abstract void raceAjustment();

    public abstract String toString();

}

