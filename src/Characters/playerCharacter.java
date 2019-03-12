package Characters;

import Game.BalancingSheet;
import Game.BattleEngine.BattleEvent;
import Game.Helpers.DoAction;
import Game.Inventory;
import Items.Armor.ArmorTypes.helmet.*;
import Items.Armor.ArmorTypes.chestplate.*;
import Items.Armor.ArmorTypes.gauntlets.*;
import Items.Armor.ArmorTypes.pants.*;
import Items.Armor.ArmorTypes.boots.*;
import Items.item;

import javax.swing.*;


public abstract class playerCharacter {
    private BalancingSheet Set = new BalancingSheet();
    private DoAction Action = new DoAction();
    public String name;
    public int age;
    public double hitPoints;
    public int magicPoints;
    public int Strength;
    public int Dexterity;
    public int Constitution;
    public int Intelligence;
    public int Wisdom;
    public int Charisma;
    public Race Race;
    public helmet helmet;
    public chestplate chestplate;
    public gauntlets gauntlets;
    public pants pants;
    public boots boots;
    public int baseAttackBonus;
    public int fortSave;
    public int refSave;
    public int WillSave;
    public Inventory Inventory = new Inventory();
    public int gold = Set.PlayerGold; //TODO give gold
    public boolean isEnemy = false;

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
    }

    public void printInventory(){
        Inventory.print();
    }

    public boolean addInventory(item newI){
        return Inventory.Add(newI);
    }

    public boolean removeItem(item oldI){
        Inventory.remove(oldI);
        return true;
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

    public int getArmorClass(){
        int armorclass = 0;
        if (helmet != null){
            armorclass = armorclass + helmet.armorBonus;
        }
        if (chestplate != null){
            armorclass = armorclass + chestplate.armorBonus;
        }
        if (gauntlets != null){
            armorclass = armorclass + gauntlets.armorBonus;
        }if (pants != null){
            armorclass = armorclass + pants.armorBonus;
        }
        if (boots != null){
            armorclass = armorclass + boots.armorBonus;
        }
        return armorclass;
    }

    public void equipArmor(){
        //TODO implement equip armor
    }

    public abstract String toString();
}

