package Game.BattleEngine;

import Characters.Enemys.*;
import Characters.playerCharacter;
import Game.BattleEngine.BattleEvents.*;
import Game.Helpers.*;
import Items.Weapons.Cancel;
import Items.Weapons.Weapon;

public class BattleEngine {
    private Dice Dice = new Dice();
    private playerCharacter Player;
    private Enemy Enemy;
    private BattleGrid grid;
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
                run(getPlayerAction());
                if (!run(getPlayerAction())) {
                    break;
                }
                if (!run(getEnemyAction())) {
                    break;
                }
                if (!run(getEnemyAction())) {
                    break;
                }
            } else {
                run(getEnemyAction());
                if (!run(getEnemyAction())) {
                    break;
                }
                if (!run(getPlayerAction())) {
                    break;
                }
                if (!run(getPlayerAction())) {
                    break;
                }
            }
        }
        System.out.println("You killed the" + Enemy + " and won the battle. ");
    }

    private BattleEvent getEnemyAction() {
        return Enemy.getAction(Player);
    }

    private BattleEvent getPlayerAction() {
        String[] Actions = {"Wait", "Run", "Move", "Use Item", "List Inventory", "Attack"};
        String[] lessActions = {"Wait", "Move", "Use Item", "List Inventory",};
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
                    return new Wait();
                case 2:
                    return new Run();
                case 3:
                    return new Move(grid);
                case 4:
                    return new UseItem(Player.Inventory.getConsumable());
                case 5:
                    Player.Inventory.print();
                    break;
                case 6:
                    int roll = Dice.rollDice(1, 20);
                    boolean Critical = false;
                    System.out.print("You rolled a " + roll);
                    if (roll == 1) {
                        System.out.print(" there for you aromatically missed");
                        System.out.println();
                        return new Miss(Player, Enemy);
                    } else if (roll == 20) {
                        Critical = true;
                        System.out.print(" so there is a chance for a critical hit");
                        System.out.println();
                    }
                    System.out.println("What Weapon would you like to use?");
                    Weapon weapon = Player.Inventory.getWeapon();
                    if(weapon instanceof Cancel){
                        break;
                    }
                    while (!weapon.isRanged && !grid.canMeelee()) {
                        System.out.println("You picked a Melee weapon and you are not close enough to Melee ");
                        weapon = Player.Inventory.getWeapon();
                        if(weapon instanceof Cancel){
                            break;
                        }
                    }
                    if(weapon instanceof Cancel){
                        break;
                    }
                    hasAttacked = true;
                    System.out.println();
                    if (weapon.isRanged) {
                        roll = roll + Player.Strength + Player.baseAttackBonus;
                    } else {
                        roll = roll + Player.Dexterity + Player.baseAttackBonus;
                    }
                    if (Enemy.getArmorClass() > roll) {
                        System.out.println("You missed because you attacked with a " + roll + " and you enemy's armor class is " + Enemy.getArmorClass());
                        return new Miss(Player, Enemy);
                    } else {
                        return new Attack(Player, Enemy, weapon, Critical);
                    }
                default:
                    System.out.println("There was a problem");
                    System.exit(1);
            }
        }
    }

    private boolean battleIsOver() {
        if (Player.hitPoints <= 0) {
            System.out.println("You died. That is the end of the game.");
            System.exit(0);
        } else if (Enemy.hitPoints <= 0) {
            return true;
        }
        return false;
    }

    private boolean run(BattleEvent event) {
            event.doEvent();
            if (battleIsOver()) {
                return false;
            }

        return true;
    }
}
