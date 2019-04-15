package Game.Core;

import Characters.PlayerClasses.*;
import Characters.*;
import Game.Helpers.Menu;
import Game.Helpers.YesOrNo;

import java.util.Scanner;

public class Main {
    private static YesOrNo Yes = new YesOrNo();
    private static Scanner scan = new Scanner(System.in);
    private static Tutorial Start = new Tutorial(scan);
    Menu Menu = new Menu();

    public static void main(String[] args) {
        createCharacter createPlayer = new createCharacter();
        playerCharacter Player;
        //intro();
        // for testing
        Player = new wizard();
        Player.Setup("Ryland", 13, 13, 13, 13, 13, 13, 13, Race.halfelf);
        // for testing
        //Player = createPlayer.newPlayer();
//        System.out.println("Great " + Player.name + " you made a character would you like to play the combat tutorial?");
//        if (Yes.check()) {
//            Start.Combat(Player);
//        }
        Game game = new Game(Player);

    }

    public static void intro() {
        System.out.println("Hello and welcome to (insert game name). ");
        System.out.println("would you like to play the tutorial? (please type yes or no)");
        if (Yes.check()) {
            Start.start();
        }
    }


}
