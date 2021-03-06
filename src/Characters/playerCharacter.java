package Characters;

import Game.Core.BalancingSheet;
import Game.Core.Inventory;
import Game.Graphics.*;
import Game.Helpers.Dice;
import Game.Helpers.YesOrNo;
import Items.Armor.Armor;
import Items.Armor.ArmorTypes.boots.*;
import Items.Armor.ArmorTypes.chestplate.*;
import Items.Armor.ArmorTypes.gauntlets.*;
import Items.Armor.ArmorTypes.helmet.*;
import Items.Armor.ArmorTypes.pants.*;
import Items.*;


public abstract class playerCharacter {
    public String name;
    public int age;
    public int hitPoints = 100;
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
    protected int fortSave;
    protected int refSave;
    protected int WillSave;
    public Inventory Inventory = new Inventory();
    private BalancingSheet Set = new BalancingSheet();
    private YesOrNo yes = new YesOrNo();
    private Dice dice = new Dice();
    public int gold = Set.PlayerGold;

    public void Setup(String Name, int Age, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, Race PlayerRace) {
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

    public int abilityMod(int score) {
        if (score == 2 || score == 3) {
            return -4;
        }
        if (score == 4 || score == 5) {
            return -3;
        }
        if (score == 6 || score == 7) {
            return -2;
        }
        if (score == 8 || score == 9) {
            return -1;
        }
        if (score == 10 || score == 11) {
            return 0;
        }
        if (score == 12 || score == 13) {
            return 1;
        }
        if (score == 14 || score == 15) {
            return 2;
        }
        if (score == 16 || score == 17) {
            return 3;
        }
        if (score == 18 || score == 19) {
            return 4;
        }
        if (score == 20 || score == 21) {
            return 5;
        }
        System.out.println("there was a problem in score mod");
        return -100;
    }

    public int getArmorClass() {
        int armorclass = 0;
        if (helmet != null) {
            armorclass = armorclass + helmet.armorBonus;
        }
        if (chestplate != null) {
            armorclass = armorclass + chestplate.armorBonus;
        }
        if (gauntlets != null) {
            armorclass = armorclass + gauntlets.armorBonus;
        }
        if (pants != null) {
            armorclass = armorclass + pants.armorBonus;
        }
        if (boots != null) {
            armorclass = armorclass + boots.armorBonus;
        }
        armorclass = armorclass + abilityMod(Dexterity);
        if (armorclass < 0) {
            armorclass = 0;
        }
        return armorclass;
    }

    public void equipArmor() {
        System.out.println("What would you like to equip?");
        Armor temp = Inventory.getArmor();
        Armor C;
        if (temp instanceof boots){
            C = boots;
            if (equipArmorHelper(C, temp)){
                boots = ((boots) temp);
                System.out.println(boots + " was equipped");
            }
            else {
                System.out.println("nothing was equipped");
            }
        }
        else if (temp instanceof chestplate){
            C = chestplate;
            if (equipArmorHelper(C, temp)){
                chestplate = ((chestplate) temp);
                System.out.println(chestplate + " was equipped");
				if (C instanceof ArcaneChestplate) {
					new arcaneArmorArt();
				}
            }
            else {
                System.out.println("nothing was equipped");
            }
        }
        else if (temp instanceof gauntlets){
            C = gauntlets;
            if (equipArmorHelper(C, temp)){
                gauntlets = ((gauntlets) temp);
                System.out.println(gauntlets + " was equipped");
            }
            else {
                System.out.println("nothing was equipped");
            }
        }
        else if (temp instanceof helmet){
            C = helmet;
            if (equipArmorHelper(C, temp)){
                helmet = ((helmet) temp);
                System.out.println(helmet + " was equipped");
				new helmetArt();
            }
            else {
                System.out.println("nothing was equipped");
            }
        }
        else if (temp instanceof pants){
            C = pants;
            if (equipArmorHelper(C, temp)){
                pants = ((pants) temp);
                System.out.println(pants + " was equipped");
            }
            else {
                System.out.println("nothing was equipped");
            }
        }
        else {
            System.out.println("Cancled, your armor bonus is still " + getArmorClass());
        }
        System.out.println("Your armor bonus is now " + getArmorClass());
    }

    private boolean equipArmorHelper(Armor Current, Armor temp){
        if (Current == null){
            return true;
        }
        else {
            System.out.println("You currently have " + Current + " equipped which has an armor bonus of " + Current.armorBonus);
            System.out.println("Would you like to equip " + temp + " instead? (" + temp + " has armor bonus of " +temp.armorBonus + ")");
            if (yes.check()){
                return true;
            }
            return false;
        }
    }

    public abstract String toString();

    public int getFortSave() {
        return dice.rollDice(1,20) + fortSave + Constitution;
    }

    public int getRefSave() {
        return dice.rollDice(1,20) + refSave + Dexterity;
    }

    public int getWillSave() {
        return dice.rollDice(1,20) + WillSave + Wisdom;
    }
}

