package Game;

import Characters.*;
import Characters.PlayerClasses.wizard;
import Items.*;
import Items.Food.Bread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Dice dice = new Dice();
        Menu menu = new Menu();
        YesOrNo Yes = new YesOrNo();
        Scanner scan = new Scanner(System.in);
        playerCharacter Player;
        System.out.println("Hello and welcome to (insert game name). ");
        System.out.println("would you like to play the tutorial? (please type yes or no)");
        if(Yes.check()){
            Tutorial Start = new Tutorial(scan);
            Start.start();
        }

        createCharacter createPlayer = new createCharacter();
        Player = createPlayer.newPlayer();


        //Testing

        //Player = new wizard();// for testing
        //Player.Setup("name", 13,13, 13, 13, 13, 13, 13, Race.halfelf); //for testing
        System.out.println(Player.name +"  " + Player.Strength + "  " + Player.Race + "  " + Player);
        Shop shop = new Shop(Player);
        shop.openShop(Player.gold);
        Player.printInventory();
    }

}
