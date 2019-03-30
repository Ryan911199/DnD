package Game.BattleEngine;

import Characters.Enemys.*;
import Characters.playerCharacter;
import Game.BattleEngine.BattleEvents.*;
import Game.Helpers.*;
import Items.Weapons.Weapon;

public class BattleEngine {
    private Dice Dice = new Dice();
    private playerCharacter Player;
    private Enemy Enemy;
    private BattleGrid grid;
    private BattleNode head;
    private Menu menu = new Menu();
    private boolean hasAttacked = false;

    public BattleEngine(playerCharacter player) {
        Player = player;
        grid = new BattleGrid(Player);
    }

    public void setEnemy(Enemy enemy) {
        Enemy = enemy;
    }

    public void Battle(Enemy enemy) {
        setEnemy(enemy);
        grid.Setup(Enemy);
        hasAttacked = false;
        int order = Dice.rollDice(1, 2);
        while (!battleIsOver()) {
            hasAttacked = false;
            if (order == 1) {
                addEvent(getPlayerAction());
                if (run()) {
                    addEvent(getPlayerAction());
                } else {
                    break;
                }
                if (run()) {
                    addEvent(getEnemyAction());
                } else {
                    break;
                }
                if (run()) {
                    addEvent(getEnemyAction());
                } else {
                    break;
                }
            } else {
                addEvent(getEnemyAction());
                if (run()) {
                    addEvent(getEnemyAction());
                } else {
                    break;
                }
                if (run()) {
                    addEvent(getPlayerAction());
                } else {
                    break;
                }
                if (run()) {
                    addEvent(getPlayerAction());
                } else {
                    break;
                }
            }
        }
    }

    public BattleEvent getEnemyAction() {
        return Enemy.getAction();
    }

    public BattleEvent getPlayerAction() {
        String[] Actions = {"Move", "Use Item", "List Inventory", "Attack"};
        String[] lessActions = {"Move", "Use Item", "List Inventory"};
        System.out.println("Battle Grid");
        grid.printGrid();
        System.out.println("What would you like to do?");

        String[] temp = Actions;
        if (hasAttacked) {
            temp = lessActions;
        }
        while (true) {
            switch (menu.menu(temp)) {
                case 1:
                    return new Move(grid);
                case 2:
                    return new UseItem(Player.Inventory.getConsumable());
                case 3:
                    Player.Inventory.print();
                    break;
                case 4:
                    System.out.println("What Weapon would you like to use?");
                    Weapon weapon = Player.Inventory.getWeapon();
                    while (!weapon.isRanged && !grid.canMeelee()) {
                        weapon = Player.Inventory.getWeapon();
                    }
                    hasAttacked = true;
                    int roll = Dice.rollDice(1, 20);
                    if (roll == 1) {
                        System.out.println("You missed because you rolled a 1");
                        return new Miss();
                    } else if (roll == 20) {
                        System.out.println("You rolled a 20 there is a chance for a critical hit");
                    } else if (roll > 1 && roll < 20) {
                        if (weapon.isRanged) {
                            roll = roll + Player.Strength + Player.baseAttackBonus;
                        } else {
                            roll = roll + Player.Dexterity + Player.baseAttackBonus;
                        }
                        if (Enemy.getArmorClass() > roll) {
                            System.out.println("You missed because you attacked with a " + roll + " and you enemy's armor class is " + Enemy.getArmorClass());
                            return new Miss();
                        } else {
                            if (!weapon.isRanged) {
                                return new Attack(Player, Enemy, weapon);
                            } else {
                                return new Attack(Player, Enemy, weapon);
                            }
                        }
                    }
                default:
                    System.out.println("There was a problem");
                    System.exit(1);
            }
        }
    }

    private void addEvent(BattleEvent add) {
        BattleNode current = head;
        BattleNode Add = new BattleNode(add);
        if (head == null) {
            head = Add;
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(Add);
            Add.setLast(current);
        }
    }

    private boolean battleIsOver() {
        if (Player.hitPoints <= 0) {
            System.out.println("You died. That is the end of the game.");
            System.exit(0);
        } else if (Enemy.hitPoints <= 0) {
            System.out.println("You killed the" + Enemy + " and won the battle. ");
            return true;
        }
        return false;
    }

    private boolean run() {
        while (head != null) {
            head.event.doEvent();
            head = head.getNext();
            if (battleIsOver()) {
                return false;
            }
        }
        return true;
    }
}
