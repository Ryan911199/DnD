package Game;

import Items.Weapons.Arrow;
import Items.Weapons.ThrowingDaggers;
import Items.Weapons.Weapon;
import Items.item;

import java.util.ArrayList;
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

    public void remove(item remove) {
        if (remove instanceof Arrow && Arrow > 0) {
            Arrow--;
            return;
        } else if (remove instanceof Arrow && Arrow < 0) {
            System.out.println("You do not have any Arrows");
            return;
        }

        if (remove instanceof ThrowingDaggers && ThrowingDaggers > 0) {
            ThrowingDaggers--;
            return;
        } else if (remove instanceof ThrowingDaggers && ThrowingDaggers < 0) {
            System.out.println("You do not have any Throwing Daggers");
            return;
        }
        if (Inventory.contains(remove)) {
            Inventory.remove(remove);
        } else {
            System.out.println("You do not have that item");
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
        Weapon temp;
        print();
        int ans = getNum();
        while (true) {
            if (ans == 1) {
                Arrow--;
                return new Arrow();
            }
            if (ans == 2) {
                return new ThrowingDaggers();
            }
            if (Inventory.get(ans - 3) instanceof Weapon) {
                temp = ((Weapon) Inventory.get(ans - 3));
                //Inventory.remove(ans - 3);
                return temp;
            }
            System.out.println("That item is not a weapon. Please pick a weapon.");
            print();
            ans = getNum();
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

    private int getNum() {
        int ans = scan.nextInt();
        while (ans <= 0 || ans > (Inventory.size() + 2)) {
            System.out.println("Please enter a valid number");
            ans = scan.nextInt();

        }
        return ans;
    }

}
