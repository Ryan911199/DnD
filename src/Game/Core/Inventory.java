package Game.Core;

import Items.Armor.*;
import Items.Cancel_pac.*;
import Items.Weapons.*;
import Items.Consumable;
import Items.item;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inventory {
    private int Arrow;
    private Scanner scan = new Scanner(System.in);
    private int numOfItems = 0;
    private ArrayList<item> Inventory = new ArrayList<item>();
    private ArrayList<Armor> ArmorInventory  = new ArrayList<>();
    private ArrayList<Weapon> WeaponInventory = new ArrayList<Weapon>();
    private ArrayList<Consumable> ConsumableInventory = new ArrayList<Consumable>();

    public Inventory() {
        Arrow = 0;
        Inventory.add(new Cancel_item());
        WeaponInventory.add(new Cancel_Weapon());
        ArmorInventory.add(new Cancel_Armor());
        ConsumableInventory.add(new Cancel_food());
    }

    public void print() {
        System.out.println("BackPack:");
        System.out.print("Arrows (" + Arrow + ") ");
        for (int x = 0; x < Inventory.size()-1; x++) {
            System.out.print((x + 1) + "." + Inventory.get(x) + " (" + Inventory.get(x).value + "gold)  ");
        }
        System.out.println();
    }

    public Boolean Add(item add) {
        if (add instanceof Arrow) {
            Arrow++;
            return true;
        }
        else if (numOfItems < 20) {
            if (add instanceof Armor) {
                ArmorInventory.remove(ArmorInventory.size()-1);
                ArmorInventory.add((Armor) add);
                ArmorInventory.add(new Cancel_Armor());
            }
            if (add instanceof Weapon) {
                WeaponInventory.remove(WeaponInventory.size()-1);
                WeaponInventory.add((Weapon) add);
                WeaponInventory.add(new Cancel_Weapon());
            }
            if (add instanceof Consumable) {
                ConsumableInventory.remove(ConsumableInventory.size()-1);
                ConsumableInventory.add((Consumable) add);
                ConsumableInventory.add(new Cancel_food());
            }
            Inventory.remove(Inventory.size()-1);
            Inventory.add(add);
            Inventory.add(new Cancel_item());
            numOfItems++;
            return true;
        }
        return false;
    }

    public int Sell() {
        System.out.println("What would you like to sell?");
        print();
        int ans = getNum(Inventory.size());
        if(Inventory.get(ans) instanceof Cancel){
            return -1;
        }
        int temp = Inventory.get(ans).value;
        Inventory.remove(ans);
        return temp;
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

    public Weapon getWeapon() {
            System.out.println("Weapons:");
            System.out.print("Arrows (" + Arrow + ") ");
            for (int x = 0; x < WeaponInventory.size(); x++) {
                System.out.print((x + 1) + "." + WeaponInventory.get(x) + " ");
            }
            System.out.println();
            int ans = getNum(WeaponInventory.size());
            return (WeaponInventory.get(ans));
    }
    public Consumable getConsumable(){
            System.out.println("Items:");
            for (int x = 0; x < ConsumableInventory.size(); x++) {
                System.out.print((x + 1) + "." + ConsumableInventory.get(x) + " ");
            }
            System.out.println();
            int ans = getNum(ConsumableInventory.size());
            return (ConsumableInventory.get(ans));
    }
    public Armor getArmor(){
            System.out.println("Armor:");
            for (int x = 0; x < ArmorInventory.size(); x++) {
                System.out.print((x + 1) + "." + ArmorInventory.get(x) + " ");
            }
            System.out.println();
            int ans = getNum(ArmorInventory.size());
            return (ArmorInventory.get(ans));
    }
    private int getNum(int length) {
        int ans = -1;
        while (ans < 0 || ans > length - 1){
            try {
                System.out.println("Please enter a number between 1 and " + length);
                ans = scan.nextInt();
                ans = ans - 1;
            } catch (InputMismatchException e) {
                System.out.println("You did not enter a number matching the required parameters.");
            }
            scan.nextLine();
        }
        return ans;
    }

    //this is only for the Enemy
    public item getItemEnemy(){
        if (Inventory.size() > 1){
            return Inventory.get(0);
        }
        return null;
    }
    public boolean getItemEnemyCheck(){
        if (Inventory.size() > 1){
            return true;
        }
        return false;
    }
}
