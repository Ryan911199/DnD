package Game.Core;

import Items.Armor.Armor;
import Items.Cancel;
import Items.Cancel_Armor;
import Items.Consumable;
import Items.Weapons.Arrow;
import Items.Weapons.Cancel_Weapon;
import Items.Weapons.ThrowingDaggers;
import Items.Weapons.Weapon;
import Items.item;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inventory<T> {
    private int Arrow;
    private Scanner scan = new Scanner(System.in);
    private int numOfItems = 0;
    private ArrayList<item> Inventory = new ArrayList<item>();
    private ArrayList<Armor> ArmorInventory  = new ArrayList<>();
    private ArrayList<Weapon> WeaponInventory = new ArrayList<Weapon>();
    private ArrayList<Consumable> ConsumableInventory = new ArrayList<Consumable>();

    public Inventory() {
        Arrow = 0;
        Inventory.add(new Cancel());
        WeaponInventory.add(new Cancel_Weapon());
        item Cancel = new Cancel();
        ArmorInventory.add((Armor) Cancel);
    }

    public void print() {
        System.out.println("BackPack:");
        System.out.print("Arrows (" + Arrow + ") ");
        for (int x = 0; x < Inventory.size(); x++) {
            System.out.print((x + 1) + ". " + Inventory.get(x) + " ");
        }
        System.out.println();
    }

    public Boolean Add(item add) {
        item Cancel = new Cancel();
        if (add instanceof Arrow) {
            Arrow++;
            return true;
        }
        else if (numOfItems < 20) {
            if (add instanceof Armor) {
                ArmorInventory.remove(ArmorInventory.size()-1);
                ArmorInventory.add((Armor) add);
                ArmorInventory.add((Armor) Cancel);
            }
            if (add instanceof Weapon) {
                WeaponInventory.remove(WeaponInventory.size()-1);
                WeaponInventory.add((Weapon) add);
                WeaponInventory.add(new Cancel_Weapon());
            }
            Inventory.remove(Inventory.size()-1);
            Inventory.add(add);
            Inventory.add(new Cancel());
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
        else if (ans-2 == Inventory.size()){
            System.out.println("Canceled");
            return null;
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

            else if (ans-2 == Inventory.size()){
                System.out.println("Canceled");
                return null;
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


    public Consumable getConsumable(){
        System.out.println("what item would you like to use?");
        print();
        int ans = getNum();
        while (true) {
            Consumable temp;
            if (ans< 3){
                System.out.println("That item is not a consumable. Please pick a consumable.");
                print();
                ans = getNum();
            } else if (ans-2 == Inventory.size()){
                System.out.println("Canceled");
                return null;
            }
            else if (Inventory.get(ans - 3) instanceof Consumable) {
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
            if (ans < 3){
                System.out.println("That item is not Armor. Please pick a piece of Armor.");
                print();
                ans = getNum();
            }
            else if (ans-2 == Inventory.size()){
                System.out.println("Canceled");
                return null;
            }
            else if (Inventory.get(ans - 3) instanceof Armor){
                return ((Armor) Inventory.get(ans - 3));
            }
            else {
                System.out.println("That item is not Armor. Please pick a piece of Armor.");
                print();
                ans = getNum();
            }
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
