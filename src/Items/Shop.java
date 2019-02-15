package Items;

import Game.Menu;
import Items.Food.*;
import Items.Weapons.*;
import Characters.*;

import java.util.Scanner;

public class Shop {
    private int gold;
    public item[] items = {new Arrow(), new Ambrosia(), new BoneMeal(), new Bread(), new CatSoup(), new ElvinBread(), new LegofLamb(), new Sword()};
    private Menu menu = new Menu();
    private playerCharacter Player;
    private String plaerBuying = "y";
    private Scanner scan = new Scanner(System.in);

    public Shop(playerCharacter player){
        Player = player;
    }

    public void openShop(int x){
        setGold(x);
        while (plaerBuying.equalsIgnoreCase("Y") || plaerBuying.equalsIgnoreCase("Yes")){
            System.out.println("what would you like to buy today");
            get(menu.menu(items) - 1);
            System.out.println("Do you want to buy something else?");
            System.out.println("You have " + gold +" gold remaining");
            plaerBuying = scan.nextLine();
        }
        System.out.println("Thank you Please come again");
    }

    private void get(int x){
        if(gold > items[x].value) {
            if(Player.addInventory(items[x])){
                Player.gold = Player.gold - items[x].value;
                gold = gold - items[x].value;
            }
        }
        else {System.out.println("You dont have enough gold for this item");}
    }
    private void setGold(int Gold){
        gold = Gold;
    }
}
