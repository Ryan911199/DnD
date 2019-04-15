package Game.Core;

import Items.Armor.Armor;
import Items.Consumable;
import Items.Weapons.Arrow;
import Items.Weapons.ThrowingDaggers;
import Items.Weapons.Weapon;
import Items.item;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inventory<T> {
    public int Arrow = 0;
    public int ThrowingDaggers = 0;
    private Scanner scan = new Scanner(System.in);
    private int numOfItems = 0;
    private ArrayList<item> Inventory = new ArrayList<item>();

    public Inventory() {
        Arrow = 0;
        ThrowingDaggers = 0;
    }

    public void print() {
        int y = 3;
        System.out.println("BackPack:");
        System.out.print("1. Arrows (" + Arrow + ") ");
        System.out.print("2. Throwing Daggers (" + ThrowingDaggers + ") ");
        for (int x = 0; x < Inventory.size(); x++) {
            System.out.print((x + 3) + ". " + Inventory.get(x) + " ");

        }
        System.out.println();
    }

    public Boolean Add(item add) {
        if (add instanceof Arrow) {
            Arrow++;
            return true;
        } else if (add instanceof ThrowingDaggers) {
            ThrowingDaggers++;
            return true;
        } else if (numOfItems < 20) {
            Inventory.add(add);
            numOfItems++;
            return true;
        }
        return false;
    }

    public boolean remove(item remove) {
        if (remove instanceof Arrow && Arrow > 0) {
            Arrow--;
            return true;
        } else if (remove instanceof Arrow && Arrow < 0) {
            System.out.println("You do not have any Arrows");
            return false;
        }

        if (remove instanceof ThrowingDaggers && ThrowingDaggers > 0) {
            ThrowingDaggers--;
            return true;
        } else if (remove instanceof ThrowingDaggers && ThrowingDaggers < 0) {
            System.out.println("You do not have any Throwing Daggers");
            return false;
        }
        if (Inventory.contains(remove)) {
            Inventory.remove(remove);
            return true;
        } else {
            System.out.println("You do not have that item");
            return false;
        }
    }

    public item getItem() {
        System.out.println("what item would you like to use?");
        print();
        int ans = getNum();
        if (ans == 1) {
            return new Arrow();
        }
        if (ans == 2) {
            return new ThrowingDaggers();
        }
        return Inventory.get(ans);
    }

    public Weapon getWeapon() {
        while (true) {
            print();
            int ans = getNum();
            if (ans == 1) {
                System.out.println("You cant attack with an arrow please pick a different item");
            }
            else if (ans == 2) {
                if (ThrowingDaggers > 0 ){
                    ThrowingDaggers--;
                    return new ThrowingDaggers();
                }
                else {
                    System.out.println("you dont have any Throwing Daggers");
                }
            }
            else if (Inventory.get(ans - 3) instanceof Weapon) {
                return ((Weapon) Inventory.get(ans - 3));
            }
            else{System.out.println("That item is not a weapon. Please pick a weapon.");}
        }
    }

    public boolean getArrow(){
        if (Arrow > 0){
            Arrow--;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean getThrowingDagger(){
        if (ThrowingDaggers > 0){
            ThrowingDaggers--;
            return true;
        }
        else {
            return false;
        }
    }

    public Consumable getConsumable(){
        System.out.println("what item would you like to use?");
        print();
        int ans = getNum();
        while (true) {
            Consumable temp;
            if (Inventory.get(ans - 3) instanceof Consumable) {
                temp = ((Consumable) Inventory.get(ans - 3));
                Inventory.remove(ans - 3);
                return temp;
            }
            System.out.println("That item is not a consumable. Please pick a consumable.");
            print();
            ans = getNum();
        }
    }

    public Armor getArmor(){
        System.out.println("what Armor would you like to equip?");
        print();
        int ans = getNum();
        while (true) {
            Armor temp;
            if (Inventory.get(ans - 3) instanceof Armor){
                return ((Armor) Inventory.get(ans - 3));
            }
            System.out.println("That item is not Armor. Please pick a piece of Armor.");
            print();
            ans = getNum();
        }
    }

    private int getNum() {
        int ans = scan.nextInt();
        while (ans <= 0 || ans > (Inventory.size() + 2)) {
            System.out.println("Please enter a valid number");
            try {
                ans = scan.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("You did not enter a number matching the required parameters.");
            }

        }
        return ans;
    }
}