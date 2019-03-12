package Game;

import Characters.playerCharacter;
import Game.BattleEngine.BattleEngine;
import Game.Helpers.Menu;

import java.util.Scanner;

public class Game {
    private String[] playerOptions;
    private Menu menu = new Menu();
    private Scanner scan = new Scanner(System.in);
    private Tutorial Start = new Tutorial(scan);
    private BattleEngine BattleEngine;

    public Game(playerCharacter Player) {
        BattleEngine = new BattleEngine(Player);
        playerOptions = new String[]{"Go To Shop", "Go TO Battle", "Run Tutorial", "Quit"};
        while (true){
            playGame(Player);
        }
    }
    private void playGame(playerCharacter Player){
        Shop shop = new Shop(Player);
        System.out.println();
        switch (menu.menu((playerOptions))) {
            case 1:
                shop.openShop(Player.gold);
                Player.printInventory();
                break;
            case 2:
                BattleEngine.Battle();
                break;
            case 3:
                System.out.println("What tutorial would you like to play?");
                scan.nextLine(); //Todo implement tutorial options
                Start.start();
                break;
            case 4:
                System.out.println("Thanks for playing our game. Feel free to come back and play again");
                System.exit(0);
                break;
            default:
                System.out.println("There was a problem most likely in menu to catastrophically mess up");
                System.exit(1);
        }
    }
}
