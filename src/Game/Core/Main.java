package Game.Core;

import Characters.PlayerClasses.*;
import Characters.*;
import Game.BattleEngine.BattleEngine;
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
        intro();
		System.out.println("Okay, next would you like to create a character? (Y/N)");
		if (Yes.check()) {
			Player = createPlayer.newPlayer();
		} else {
			Player = new wizard();
			Player.Setup("Tom", 13, 13, 13, 13, 13, 13, 13, Race.halfelf);
		}

        //System.out.println("Great " + Player.name + " you made a character would you like to play the combat tutorial?");
//        if (Yes.check()) {
//            Start.Combat(Player);
//        }
		System.out.println("Would you like to play the story? (Y/N)");
		if (Yes.check()) {
			Game game = new Game(Player);
		} else {
			System.out.println("Would you just like to go to the Tavern? (Y/N)");
			if (Yes.check()) {
				TheTavern Tavern = new TheTavern(Player);
				Tavern.Tavern(new BattleEngine(Player));
				System.exit(0);
			}
		}
		System.exit(0);

    }

    public static void intro() {
        System.out.println("Hello and welcome to (insert game name). ");
        System.out.println("would you like to play the tutorial? (please type yes or no)");
        if (Yes.check()) {
            Start.start();
        }
    }


}
