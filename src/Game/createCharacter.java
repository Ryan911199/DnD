package Game;
import Characters.*;
import Characters.Classes.*;

import java.util.Scanner;


public class createCharacter {
    public String name;
    public int Strength;
    public int Dexterity;
    public int Constitution;
    public int Intelligence;
    public int Wisdom;
    public int Charisma;
    public Race playerRace;

    public  createCharacter(){
        name = "NA";
        Strength = -1;
        Dexterity = -1;
        Constitution = -1;
        Intelligence = -1;
        Wisdom = -1;
        Charisma = -1;
        playerRace = Race.notchosen;
    }

    public playerCharacter newPlayer() {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        String[] classes = {"barbarian", "bard", "cleric", "druid", "fighter", "monk", "paladin", "ranger", "rogue", "sorcerer", "wizard"};
        String[] races = {"human", "dwarf", "elf", "gnome", "half-lings", "half-elf", "half-orc"};
        System.out.println("Hello and welcome to (insert game name). This is a spin off of Dungeons and dragons focused on combat with basic AI enemies");
        System.out.println();
        System.out.println("To begin please roll the dice to determine your ability scores" );//TODO tell player what ability scores do
        System.out.println();
        abilityRoll(scan);
        System.out.println("now it is time for you to pick you race ");//TODO tell player the benefits of each race
        switch (menu.menu(races)){ //TODO add race benefits to abilities
            case 1:
                playerRace = Race.human;
                break;
            case 2:
                playerRace = Race.dwarf;
                break;
            case 3:
                playerRace = Race.elf;
                break;
            case 4:
                playerRace = Race.gnome;
                break;
            case 5:
                playerRace = Race.halflings;
                break;
            case 6:
                playerRace = Race.halfelf;
                break;
            case 7:
                playerRace = Race.halforc;
                break;
        }
        System.out.println("great, next lets pick a class type for your character");//TODO tell player the benefits of each class
        switch (menu.menu(classes)){
            case 1:
                return new barbarian(name, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
            case 2:
                return new bard(name, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
            case 3:
                return new cleric(name, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
            case 4:
                return new druid(name, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
            case 5:
                return new fighter(name, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
            case 6:
                return new monk(name, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
            case 7:
                return new paladin(name, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
            case 8:
                return new ranger(name, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
            case 9:
                return new rogue(name, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
            case 10:
                return new sorcerer(name, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
            case 11:
                return new wizard(name, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
            default:
                System.out.println("something went wrong");
                return null;
        }
    }

    public void abilityRoll(Scanner scan){
        Dice die = new Dice();
        int[] abilityScores = new int[6];
        String ans;

        for (int i = 0; i < 6; i++){
            abilityScores[i] = die.rollDice(3, 6);
        }
        for (int i = 0; i < 6; i++){
            System.out.print(abilityScores[i] +", ");
        }
        System.out.println("do you want to re roll all of the dice?");
        ans = scan.nextLine();
        if (ans.equals("Y") || ans.equals("y") || ans.equals("Yes") || ans.equals("yes")){
            reroll(scan);
        }
        placeAbilityScores(scan, abilityScores);
    }
    public void reroll(Scanner scan){
        abilityRoll(scan);
    }

    public void placeAbilityScores(Scanner scan, int[] scores){
        int[] scores2 = new int[6];
        System.arraycopy(scores, 0, scores2, 0, 6);

        System.out.println("it is now time to pick where you want your scores to be applied");
        System.out.println("here are all of the scores to chose from.");
        System.out.println();
        for (int i = 0; i < 6; i++){
            System.out.print(scores2[i] +", ");
        }
        System.out.println();
        System.out.println("and here are all of the categories they can be applied to");
        System.out.println();
        System.out.println("Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma");
        System.out.println();
        System.out.println("what number would you like to assign to Strength ");
        for (int i = 0; i < 6; i++){
            System.out.print((i + 1) + ". " + scores2[i] +", ");
        }
        //strength,  dexterity,  constitution,  intelligence,  wisdom,  charisma
    }


}
