package Game;

import Characters.*;
import Characters.PlayerClasses.wizard;
import Items.*;
import Items.Food.Bread;

public class Main {
    public static void main(String[] args)
    {
        Dice dice = new Dice();
        Menu menu = new Menu();
        playerCharacter Player;
        createCharacter createPlayer = new createCharacter();
        //Player = createPlayer.newPlayer();
        Player = new wizard();// for testing
        Player.Setup("name", 13,13, 13, 13, 13, 13, 13, Race.halfelf); //for testing
        System.out.println(Player.name +"  " + Player.Strength + "  " + Player.Race + "  " + Player);
        Shop shop = new Shop(Player);
        shop.openShop(Player.gold);
        Player.printInventory();
    }

}
