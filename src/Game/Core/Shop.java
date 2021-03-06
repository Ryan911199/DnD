package Game.Core;

import Game.Helpers.GetnumAns;
import Game.Helpers.Menu;
import Game.Helpers.YesOrNo;
import Items.Armor.ArmorTypes.boots.*;
import Items.Armor.ArmorTypes.chestplate.*;
import Items.Armor.ArmorTypes.gauntlets.lightGauntlets;
import Items.Armor.ArmorTypes.helmet.lightHelmet;
import Items.Armor.ArmorTypes.pants.lightPants;
import Items.Cancel_pac.Cancel;
import Items.Food.*;
import Items.Weapons.*;
import Characters.*;
import Items.item;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop {
    private int gold;
    public item[] items = {new Arrow(), new Ambrosia(), new axe(), new BoneMeal(), new Bow(), new Bread(), new BroadSword(), new CatSoup(), new ElvinBread(), new Knife(), new LegofLamb(), new Sword(), new lightBoots(), new ArcaneChestplate(), new heavyFullPlate(), new lightLeatherChestplate(), new mediumChainmail(), new lightPants(), new lightHelmet(), new lightGauntlets()};
    private Menu menu = new Menu();
    private YesOrNo Yes = new YesOrNo();
    private playerCharacter Player;
    private String plaerBuying = "y";
    private Scanner scan = new Scanner(System.in);
    private String[] Actions = {"Buy", "Sell", "Ask how the shop works", "leave"};
    private Tutorial tutorial = new Tutorial(scan);
    private GetnumAns getNum = new GetnumAns();
    public Shop(playerCharacter player){
        Player = player;
    }

    public void openShop(int x){
        setGold(x);
        System.out.println("Hello and welcome to our shop.");
        System.out.println("what would you like to do today?");
        boolean run = true;
        while (run){
            switch (menu.menu(Actions)) {
                case 1:
                    System.out.println("You have " + gold +" gold remaining");
                    System.out.println("What would you like to buy?");
                    get(menu.shop(items) - 1);
                    break;
                case 2:
                    sell();
                    break;
                case 3:
                    tutorial.theShop();
                    break;
                case 4:
                    run = false;
                    System.out.println("Thank you Please come again");
                    break;
                default:
                    System.out.println("There was a problem most likely in shop to catastrophically mess up");
                    System.exit(1);
                    break;
            }
        }

    }

    private void get(int x){
        System.out.println("How Many would you like to buy");
        int amount = getnum();
        if (gold >= (items[x].value * amount)) {
            for (int d = 0; d < amount; d++){
                if(Player.Inventory.Add(items[x])){
                    Player.gold = Player.gold - items[x].value;
                    gold = gold - items[x].value;
                }else {
                    System.out.println("we can not give you that many " + items[x] + "s" + " were only able to give you " + d );
                    System.out.println("If you would like to buy more things please drop an Item");
                    break;
                }
            }
            System.out.println("You have " + Player.gold + " gold");
        }
        else {System.out.println("You dont have enough gold for this item");}
    }
    private void setGold(int Gold){
        gold = Gold;
    }

    private void sell(){
        System.out.println("when you sell something you get half its value in gold");
        int temp = Player.Inventory.Sell();
        if (temp == -1) {
            System.out.println("Canceled");
            return;
        }
        Player.gold = Player.gold + (temp / 2);
        System.out.println("You have " + Player.gold + " gold");
    }
    private int getnum(){
        int ans = -1;
        while (ans < 0) {
            System.out.println("Please enter a number");
            try {
                ans = getNum.getNum();
            } catch (InputMismatchException e) {
                System.out.println("You did not enter a number matching the required parameters.");
            }
        }
        return ans;
    }
}
