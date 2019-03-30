package Game;

import Characters.Enemys.*;
import Characters.Enemys.Goblin;
import Characters.Race;
import Characters.*;
import Game.BattleEngine.BattleEngine;
import Game.BattleEngine.BattleGrid;
import Game.Helpers.Menu;

import java.util.Scanner;

public class Game {
    private String[] playerOptions;
    private Menu menu = new Menu();
    private Scanner scan = new Scanner(System.in);
    private Tutorial Start = new Tutorial(scan);
    private BattleEngine BattleEngine;
    private Enemy Enemy;
    private playerCharacter Player;

    public Game(playerCharacter player) {
        Player = player;
        BattleEngine = new BattleEngine(Player);
        playerOptions = new String[]{"Go To Shop", "Go TO Battle", "Run Tutorial", "Quit"};
        //Testing
        Enemy = new Goblin("Fred the Goblin");
        Enemy.Setup("Fred the Goblin", 13, 13, 13, 13, 13, 13, 13, Race.halfelf);
        //Testing
        while (true){
            playGame();
        }
    }
    private void playGame(){
        Shop shop = new Shop(Player);
        System.out.println();
        switch (menu.menu((playerOptions))) {
            case 1:
                shop.openShop(Player.gold);
                Player.printInventory();
                break;
            case 2:
                BattleEngine.Battle(Enemy);
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
