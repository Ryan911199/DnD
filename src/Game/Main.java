package Game;

import Characters.PlayerClasses.*;
import Characters.*;

import java.util.Scanner;

public class Main {
    private static YesOrNo Yes = new YesOrNo();
    private static Scanner scan = new Scanner(System.in);
    private static Tutorial Start = new Tutorial(scan);

    public static void main(String[] args) {
        createCharacter createPlayer = new createCharacter();
        playerCharacter Player;
        intro();
        //Player = createPlayer.newPlayer();
        // for testing
        Player = new wizard();
        Player.Setup("name", 13, 13, 13, 13, 13, 13, 13, Race.halfelf);
        // for testing
        System.out.println("Great " + Player.name + " you made a character would you like to play the combat tutorial?");
        if (Yes.check()) {
            Start.Combat();
        }
        Game game = new Game(Player);

        //System.out.println(Player.name +"  " + Player.Strength + "  " + Player.Race + "  " + Player);
    }

    public static void intro() {
        System.out.println("Hello and welcome to (insert game name). ");
        System.out.println("would you like to play the tutorial? (please type yes or no)");
        if (Yes.check()) {
            Start.start();
        }
    }
}
