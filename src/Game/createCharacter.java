package Game;
import Characters.Character;
import Characters.Race;
import java.util.Scanner;

public class createCharacter {
    public  createCharacter(){

    }
    public Character newPlayer() {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        Race playerPick;
        String[] classes = {"barbarian", "bard", "cleric", "druid", "fighter", "monk", "paladin", "ranger", "rogue", "sorcerer", "wizard"};
        String[] races = {"human", "dwarf", "elf", "gnome", "half-lings", "half-elf", "half-orc"};
        System.out.println("Hello and welcome to (insert game name). This is a spin off of Dungeons and dragons focused on combat with basic AI enemies");
        System.out.println();
        System.out.println("To begin please roll the dice to determine your ability scores" );//TODO tell player what ability scores do
        System.out.println();
        int[] abilityScores = abilityRoll(scan);
        System.out.println("now it is time for you to pick you race ");//TODO tell player the benefits of each race
        switch (menu.menu(races)){
            case 1:
                playerPick = Race.human;
                break;
            case 2:
                playerPick = Race.dwarf;
                break;
            case 3:
                playerPick = Race.elf;
                break;
            case 4:
                playerPick = Race.gnome;
                break;
            case 5:
                playerPick = Race.halflings;
                break;
            case 6:
                playerPick = Race.halfelf;
                break;
            case 7:
                playerPick = Race.halforc;
                break;
        }
        System.out.println("great, next lets pick a class type for your character");//TODO tell player the benefits of each class
        switch (menu.menu(classes)){
            case 1:

        }
        return new Character("tom", abilityScores[1], abilityScores[1], abilityScores[1], abilityScores[1], abilityScores[1], abilityScores[1], Race.elf);
    }

    public int[] abilityRoll(Scanner scan){
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
        abilityScores = placeAbilityScores(scan, abilityScores);
        return abilityScores;
    }
    public void reroll(Scanner scan){
        abilityRoll(scan);
    }

    public int[] placeAbilityScores(Scanner scan, int[] scores){
        int[] scores2 = new int[6];
        for (int i = 0; i < 6; i++){
            scores2[i] = scores[i];
        }
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
        return scores;
    }


}
