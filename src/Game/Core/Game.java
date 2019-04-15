package Game.Core;

import Characters.Enemys.*;
import Characters.Enemys.Goblin;
import Characters.Race;
import Characters.*;
import Game.BattleEngine.BattleEngine;
import Game.Core.Shop;
import Game.Core.Tutorial;
import Game.Helpers.Menu;
import Game.Story.End;
import Game.Story.StoryList;
import Game.Story.StoryNode;

import java.util.Scanner;

public class Game {
    private String[] playerOptions;
    private Shop shop;
    private Menu menu = new Menu();
    private Scanner scan = new Scanner(System.in);
    private Tutorial Start = new Tutorial(scan);
    private BattleEngine BattleEngine;
    private Enemy Enemy;
    private playerCharacter Player;
    private StoryList Story = new StoryList();

    public Game(playerCharacter player) {
        Player = player;
        BattleEngine = new BattleEngine(Player);
        playerOptions = new String[]{"Go To Shop", "Go TO Battle", "Run Tutorial", " Equip Armor", "Quit"};
        shop = new Shop(Player);
        playGame();
    }
    private void playGame(){
        while (true){
            StoryNode temp = Story.getStory();
            temp.Story(Player);
            if (temp instanceof End){
                System.exit(0);
            }


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
                case 5:
                    Player.equipArmor();
                default:
                    System.out.println("There was a problem most likely in menu or \"game\" to catastrophically mess up");
                    System.exit(1);
            }
        }
    }

    private void setEnemy(Enemy enemy){
        Enemy = enemy;
    }
}
