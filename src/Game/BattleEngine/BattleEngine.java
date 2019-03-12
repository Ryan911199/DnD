package Game.BattleEngine;

import Characters.playerCharacter;
import Game.BattleEngine.BattleEvents.Attack;
import Game.Helpers.Dice;
import Game.Helpers.Menu;

public class BattleEngine {
    private BattleNode head;
    Dice Dice = new Dice();
    private String[] BasicActions = {"Attack", "Use Item", "List Inventory"};
    private Menu menu = new Menu();
    playerCharacter Player;
    playerCharacter Enemy;

    public BattleEngine(playerCharacter player){
        Player = player;
    }

    public void Battle(playerCharacter Enemy){
        if(Dice.rollDice(1,2) == 1){
            addEvent(getPlayerAction(Player));
            addEvent(getEnemyAction(Enemy));
        }
        else {
            addEvent(getEnemyAction(Enemy));
            addEvent(getPlayerAction(Player));
        }
        while (head != null){
            head.event.doEvent();
            head = head.getNext();
        }
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

    public BattleEvent getEnemyAction(playerCharacter Character) {

        return null;
    }

    public BattleEvent getPlayerAction(playerCharacter Player) {
        System.out.println("What would you like to do?");

        switch (menu.menu(BasicActions)) {
            case 1:
                int roll = Dice.rollDice(1,20);
                if(roll == 1){
                    System.out.println("You missed because you rolled a 1");
                    return new Attack();
                }
                if(roll == 20){
                    System.out.println("You rolled a 20 there is a chance for a critical hit");
                }
                System.out.println(Player.Inventory.getWeapon());
                System.exit(1);
                break;
            case 2:
                //TODO implement battle
                break;
            case 3:
                Player.Inventory.getItem();
                break;
            case 4:
                Player.Inventory.print();
                break;
            default:
                System.out.println("There was a problem");
                System.exit(1);
        }
        return null;
    }
}
