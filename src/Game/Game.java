package Game;

import Characters.playerCharacter;

import java.util.Scanner;

public class Game {
    private String[] playerOptions = {"Go To Shop", "Go TO Battle", "Run Tutorial", "Quit"};
    private Menu menu = new Menu();
    private Scanner scan = new Scanner(System.in);
    private Tutorial Start = new Tutorial(scan);

    public Game(playerCharacter Player){

        Shop shop = new Shop(Player);
        switch (menu.menu((playerOptions))) {
            case 1:
                shop.openShop(Player.gold);
                Player.printInventory();
                break;
            case 2:
                //TODO implement battle
                break;
            case 3:
                System.out.println("What tutorial would you like to play?");
                scan.nextLine(); //Todo implement tutorial options
                Start.start();
                break;
            case 4:
                System.out.println("Thanks for playing our game. Fell free to come back and play again");
                System.exit(0);
                break;
            default:
                System.out.println("There was a problem most likely in menu to catastrophically mess up");
                System.exit(1);
        }
    }
}
