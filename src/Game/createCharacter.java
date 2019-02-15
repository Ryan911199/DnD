package Game;

import Characters.*;
import Characters.PlayerClasses.*;

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
    public int age;

    public createCharacter() {
        name = "Tom";
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
        playerCharacter player;
        String ans = "n";
        String[] classes = {"barbarian", "bard", "cleric", "druid", "fighter", "monk", "paladin", "ranger", "rogue", "sorcerer", "wizard"};
        String[] races = {"human", "dwarf", "elf", "gnome", "half-lings", "half-elf", "half-orc"};
        playerCharacter[] PlayerPick = {new barbarian(), new bard(), new cleric(), new druid(),
                new fighter(), new monk(), new paladin(), new ranger(), new rogue(), new sorcerer(), new wizard()};
        System.out.println("Hello and welcome to (insert game name). This is a spin off of Dungeons and dragons focused on combat with basic AI enemies");
        System.out.println();
        System.out.println("To begin please roll the dice to determine your ability scores");//TODO tell player what ability scores do
        System.out.println();
        abilityRoll(scan);
        System.out.println("now it is time for you to pick you race ");//TODO tell player the benefits of each race
        switch (menu.menu(races)) { //TODO add race benefits to abilities
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
        player = PlayerPick[((menu.menu(classes)) - 1)];
        System.out.println("Now it is time to pick a name. what would you like to be called?");
        name = scan.nextLine();
        System.out.println("How old are you?");
        age = scan.nextInt();
        scan.nextLine();
        player.Setup(name, age, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
        return player;

    }

    public void abilityRoll(Scanner scan) {
        Dice die = new Dice();
        int[] abilityScores = new int[6];
        String ans;

        for (int i = 0; i < 6; i++) {
            abilityScores[i] = die.rollDice(3, 6);
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(abilityScores[i] + ", ");
        }
        System.out.println();
        System.out.println("do you want to re roll all of the dice?");
        ans = scan.nextLine();
        if (ans.equals("Y") || ans.equals("y") || ans.equals("Yes") || ans.equals("yes")) {
            reroll(scan);
        }
        placeAbilityScores(scan, abilityScores);
    }

    public void reroll(Scanner scan) {
        abilityRoll(scan);
    }

    public void placeAbilityScores(Scanner scan, int[] scores) {
        int[] scores2 = new int[6];
        int ans;
        //System.arraycopy(scores, 0, scores2, 0, 6);

        System.out.println("it is now time to pick where you want your scores to be applied");
        System.out.println("here are all of the scores to choose from.");
        System.out.println();
        options(scores);
        System.out.println();
        System.out.println("and here are all of the categories they can be applied to");
        System.out.println();
        System.out.println("Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma");
        System.out.println();
        System.out.println("what number would you like to assign to Strength ");
        options(scores);
        System.out.println("please choose a number");
        Strength = inArray(scores, scan);
        System.out.println("what number would you like to assign to Dexterity ");
        options(scores);
        Dexterity = inArray(scores, scan);
        System.out.println("what number would you like to assign to Constitution ");
        options(scores);
        Constitution = inArray(scores, scan);
        System.out.println("what number would you like to assign to Intelligence ");
        options(scores);
        Intelligence = inArray(scores, scan);
        System.out.println("what number would you like to assign to Wisdom ");
        options(scores);
        Wisdom = inArray(scores, scan);
        System.out.println("what number would you like to assign to Charisma ");
        options(scores);
        Charisma = inArray(scores, scan);
        //strength,  dexterity,  constitution,  intelligence,  wisdom,  charisma
    }
    public void options(int[] op){
        for (int i = 0; i < 6; i++) {
            if(op[i] != 0 ) {
                System.out.print((i + 1) + ". " + op[i] + "   ");
            }
        }
    }
    public int inArray(int[] arr, Scanner scan){
        int ans = scan.nextInt();
        scan.nextLine();
        while(true) {
            for (int i = 0; i < 6; i++) {
                if (arr[i] == ans) {
                    arr[i] = 0;
                    System.out.println("the number was assigned");
                    System.out.println();
                    return ans;
                }
            }
            System.out.println("This number is not in the array please try again");
            System.out.println("here are your options");
            options(arr);
            System.out.println("please choose a number");
            ans = scan.nextInt();
            scan.nextLine();
        }
    }


}
