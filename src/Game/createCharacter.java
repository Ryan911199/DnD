package Game;

import java.util.Scanner;

public class createCharacter {
    public  createCharacter(){
        System.out.println("Hello and welcome to (insert game name). This is a spin off of Dungeons and dragons focused on combat with AI enemies");
        System.out.println();
        System.out.println("To begin please roll the dice to determine your ability scores" ); //TODO tell player what ability scores do

    }
    // barbarian, bard, cleric, druid, fighter, monk, paladin, ranger, rogue, sorcerer, and wizard.
    public static String menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("barbarian");
        System.out.println("bard");
        System.out.println("cleric");
        System.out.println("druid");
        System.out.println("fighter");
        System.out.println("monk");
        System.out.println("paladin");
        System.out.println("ranger");
        System.out.println("rogue");
        System.out.println("sorcerer");
        System.out.println("wizard");
        String ans = "z";
        while (!ans.equals("a") && !ans.equals("b") && !ans.equals("c") && !ans.equals("d") && !ans.equals("e")) {
            System.out.println("Please enter one letter a-e with out spaces and lowercase");
            ans = scan.nextLine();
        }
        return ans;
    }

}
