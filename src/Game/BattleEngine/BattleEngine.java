package Game.BattleEngine;

import Characters.Blank;
import Characters.Goblin;
import Characters.playerCharacter;
import Game.BattleEngine.BattleEvents.*;
import Game.Helpers.Dice;
import Game.Helpers.Menu;
import Items.Weapons.Weapon;
import Items.item;

public class BattleEngine {
    private BattleNode head;
    Dice Dice = new Dice();
    private String[] BasicActions = {"Attack", "Use Item", "List Inventory"};
    private Menu menu = new Menu();
    playerCharacter Player;
    playerCharacter Enemy;
    BattleGird grid = new BattleGird(Player,Enemy);


    public BattleEngine(playerCharacter player){
        Player = player;
    }

    public void setEnemy(playerCharacter enemy){
        Enemy = enemy;
    }

    public void Battle(playerCharacter enemy){
        setEnemy(enemy);
        if(Dice.rollDice(1,2) == 1){
            addEvent(getPlayerAction());
            addEvent(getEnemyAction());
        }
        else {
            addEvent(getEnemyAction());
            addEvent(getPlayerAction());
        }
        while (head != null){
            head.event.doEvent();
            head = head.getNext();
        }
    }

    public BattleEvent getEnemyAction() {

        return null;
    }

    public BattleEvent getPlayerAction() {
        System.out.println("What would you like to do?");

        switch (menu.menu(BasicActions)) {
            case 1:
                System.out.println("What Weapon would you like to use?");
                Weapon weapon = Player.Inventory.getWeapon();
                if (weapon.isRanged && grid.inLine()){


                }else if(weapon.isRanged && !grid.inLine()){
                    
                }
                int roll = Dice.rollDice(1,20);
                if(roll == 1){
                    System.out.println("You missed because you rolled a 1");
                    return new Miss();
                }
                if(roll == 20){
                    System.out.println("You rolled a 20 there is a chance for a critical hit");
                }

                System.exit(1);
                break;
            case 2:
                Player.Inventory.getItem();
                break;
            case 3:
                Player.Inventory.print();
                break;
            default:
                System.out.println("There was a problem");
                System.exit(1);
        }
        return null;
    }
    private void addEvent(BattleEvent add){
        BattleNode current = head;
        BattleNode Add = new BattleNode(add);
        if(head == null){
            head = Add;
        }else {
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(Add);
            Add.setLast(current);
        }
    }

    private int roll(){}



}
