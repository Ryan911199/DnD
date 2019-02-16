package Game;

import java.util.Scanner;

public class Tutorial {
    Scanner scan;
    private YesOrNo Yes = new YesOrNo();
    private Menu menu = new Menu();
    String[] YesOrNa = {"Yes", "No"};

    public Tutorial(Scanner Scan){
        scan = Scan;
    }

    public void start(){
        System.out.println("Great so this is your first time Playing (insert game name here)");
        System.out.println("This game is a spin off of Dungeons and dragons focused on combat with basic AI enemies");
        System.out.println("In the game we will be asking you a lot of yes or no questions ");
        System.out.println("all you have to do is type yes or no (capitalisation does not matter) and hit enter even a sample Y or N will work");
        System.out.println();
        System.out.println("does that make sense?");
        while (!Yes.check()){
            System.out.println("It is pretty simple for right now please just type yes");
        }
        System.out.println("Great, sometimes we will just type out some of what we are trying to tell you then wait for you to hit Enter to tell you more");
        System.out.println("We do this so we dont overwhelm you with a wall of text. If that make sense please hit Enter");
        scan.nextLine();
        System.out.println();
        System.out.println("Good, we also will ask you to pick something form a list. To do this just type the number that corresponds to the selection you would like to make");
        System.out.println("Would you like us to explain that again?");
        while (menu.menu(YesOrNa) == 1){
            System.out.println("Sometimes we will ask you to pick something form a list. To do this just type the number that corresponds to the selection you would like to make");
            System.out.println("Would you like us to explain that again?");
        }
    }
}
