package Game;


import java.util.Scanner;

public class createCharacter {
    public  createCharacter(){
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        String[] classes = {"barbarian", "bard", "cleric", "druid", "fighter", "monk", "paladin", "ranger", "rogue", "sorcerer", "wizard"};
        String[] races = {"human", "dwarf", "elf", "gnome", "half-lings", "half-elf", "half-orc"};
        System.out.println("Hello and welcome to (insert game name). This is a spin off of Dungeons and dragons focused on combat with basic AI enemies");
        System.out.println();
        System.out.println("To begin please roll the dice to determine your ability scores" );//TODO tell player what ability scores do
        System.out.println();
        int[] abilityScores = abilityRoll(scan);
        System.out.println("now it is time for you to pick you race ");//TODO tell player the benefits of each race
        System.out.println(menu.menu(races));
        System.out.println("great, next lets pick a class type for your character");//TODO tell player the benefits of each class
        System.out.println(menu.menu(classes));
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
        return abilityScores;
    }
    public void reroll(Scanner scan){
        abilityRoll(scan);
        int[] roll = new int[3];
        for (int i = 0; i < 5; i++);
    }

}
