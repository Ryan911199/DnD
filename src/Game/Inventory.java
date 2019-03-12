package Game;

import Game.Helpers.Menu;
import Items.Weapons.*;
import Items.item;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private Scanner scan = new Scanner(System.in);
    private Menu menu = new Menu();
    private int numOfItems = 0;
    public int Arrow = 0;
    public int ThrowingDaggers = 0;
    public int numberOfWepons = 0;

    private ArrayList<item> Inventory = new ArrayList<item>();
    private ArrayList<Weapon> Weapons = new ArrayList<Weapon>();

    public Inventory(){
        Arrow = 0;
        ThrowingDaggers = 0;
    }

    public void print(){
        int y = 3;
        System.out.println("BackPack:");
        System.out.print("1. Arrows (" + Arrow + ") ");
        System.out.print("2. Throwing Daggers (" + ThrowingDaggers + ") ");
        for (int x = 0; x < Inventory.size(); x++){
            System.out.print((x + y) + ". " + Inventory.get(x) + " ");
            y++;
            System.out.print((x + y) + ". " + Weapons.get(x) + " ");
            y++;
        }
    }

    public void printWeapons(){
        System.out.println("Weapons:");
        System.out.print("1. Arrows (" + Arrow + ") ");
        System.out.print("2. Throwing Daggers (" + ThrowingDaggers + ") ");
        for (int x = 0; x < Inventory.size(); x++){
            System.out.print((x + 3) + ". " + Weapons.get(x) + " ");
        }
    }

    public String[] printWepons(){
        String[] out = new String[numberOfWepons];
        return null;
    }

    public Boolean Add(item add){
        if(add instanceof Arrow){
            Arrow++;
            return true;
        }
        else if(add instanceof ThrowingDaggers){
            ThrowingDaggers++;
            return true;
        }
        else if (add instanceof Weapon && numOfItems < 20){
            Weapons.add(add);
            numOfItems++;
            return true;
        }
        else if (numOfItems < 20){
            Inventory.add(add);
            numOfItems++;
            return true;
        }

        return false;
    }

    public void remove(item remove){
        if(remove instanceof Arrow && Arrow > 0){
            Arrow--;
            return;
        }else if(remove instanceof Arrow && Arrow < 0){
            System.out.println("You do not have any Arrows");
            return;
        }

        if(remove instanceof ThrowingDaggers && ThrowingDaggers > 0){
            ThrowingDaggers--;
            return;
        }else if(remove instanceof ThrowingDaggers && ThrowingDaggers < 0){
            System.out.println("You do not have any Throwing Daggers");
            return;
        }
        if(Inventory.contains(remove)){
            Inventory.remove(remove);
        }else {
            System.out.println("You do not have that item");
        }
    }

    public item getItem(){
        System.out.println("what item would you like to use?");
        print();
        int ans = scan.nextInt();
        while (ans <= 0 || ans > (Inventory.size()+ 2)){
            System.out.println("Please enter a valid number");
            ans = scan.nextInt();
        }
        if(ans == 1){
            return new Arrow();
        }
        if(ans == 2){
            return new ThrowingDaggers();
        }
        return Inventory.get(ans);
    }

    public Weapon getWeapon(){
        System.out.println("what item would you like to use?");
        print();
        int ans = scan.nextInt();
        while (ans <= 0 || ans > (Inventory.size()+ 2)){
            System.out.println("Please enter a valid number");
            ans = scan.nextInt();
        }
        if(ans == 1){
            return new Arrow();
        }
        if(ans == 2){
            return new ThrowingDaggers();
        }
        return Weapons.get(ans);

    }
}
