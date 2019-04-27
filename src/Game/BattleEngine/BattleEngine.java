package Game.BattleEngine;

import Characters.Enemys.*;
import Characters.playerCharacter;
import Game.BattleEngine.BattleEvents.*;
import Game.Helpers.*;
import Items.Cancel_pac.Cancel_Weapon;
import Items.Weapons.Weapon;
import java.util.Scanner;

public class
BattleEngine {
    private Dice Dice = new Dice();
    private playerCharacter Player;
    private Enemy Enemy;
    private BattleGrid grid;
    private Menu menu = new Menu();
    private boolean hasAttacked = false;
    private Scanner scan = new Scanner(System.in);

    public BattleEngine(playerCharacter player) {
        Player = player;
        grid = new BattleGrid(Player);
    }

    private void setEnemy(Enemy enemy) {
        Enemy = enemy;
    }

    public void Battle(Enemy enemy) {
        setEnemy(enemy);
        grid.Setup(Enemy);
        hasAttacked = false;
        System.out.println("You are entering a battle with " + Enemy.name);
        System.out.println(Enemy.name + " has " + Enemy.hitPoints + " health and an armor class of " + Enemy.getArmorClass());

        int order = Dice.rollDice(1, 2);
        while (!battleIsOver()) {
            hasAttacked = false;
            if (order == 1) {
                if (!run(getPlayerAction())) {
                    break;
                }
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
                if (!run(getEnemyAction())) {
                    break;
                }
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
        if (battleIsOver()) {
            System.out.println("You killed " + Enemy.name + " and won the battle. ");
        }
        else {
            System.out.println("You lost 75% of your gold");
            System.out.println(Player.gold);
            Player.gold = (Player.gold / 4);
            System.out.println(Player.gold);
        }
    }
    private BattleEvent getEnemyAction() {
        return Enemy.getAction(Player, grid);
    }

    private BattleEvent getPlayerAction() {
        String[] Actions = {"Wait (a give up turn)", "Run From Battle ", "Move", "Use Item", "List Inventory", "Print Battle Stats", "Attack"};
        String[] lessActions = {"Wait (a give up turn)", "Run From Battle ", "Move", "Use Item", "List Inventory", "Print Battle Stats"};
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
                    return new Move(grid, Player);
                case 4:
                    return new UseItem(Player.Inventory.getConsumable(), Player);
                case 5:
                    Player.Inventory.print();
                    break;
                case 6:
                    printStats();
                    break;
                case 7:
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
                    System.out.println(" What Weapon would you like to use?");
                    Weapon weapon = Player.Inventory.getWeapon();
                    if(weapon instanceof Cancel_Weapon){
                        break;
                    }
                    while (!weapon.isRanged && !grid.canMeelee()) {
                        System.out.println("You picked a Melee weapon and you are not close enough to Melee ");
                        weapon = Player.Inventory.getWeapon();
                        if(weapon instanceof Cancel_Weapon){
                            break;
                        }
                    }
                    if(weapon instanceof Cancel_Weapon){
                        break;
                    }
                    hasAttacked = true;
                    System.out.println();
                    if (weapon.isRanged) {
                        roll = roll + Player.abilityMod(Player.Strength) + Player.baseAttackBonus;
                    } else {
                        roll = roll + Player.abilityMod(Player.Dexterity) + Player.baseAttackBonus;
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

    //h
    private boolean run(BattleEvent event) {
            event.doEvent();
            if (event instanceof Attack || event instanceof Heal || event instanceof UseItem){
                printStats();
            }
            if (event instanceof Run){
                return false;
            }
            if (battleIsOver()) {
                return false;
            }
        return true;
    }

    private void printStats(){
        double temp1 = Player.hitPoints;
        double temp2 = Enemy.hitPoints;
        if (temp1 < 0){
            temp1 = 0;
        }
        if (temp2 < 0){
            temp2 = 0;
        }
        System.out.println(Player.name + " has an armor class of " + Player.getArmorClass()+ " and " +temp1 + " health remaining ");
        System.out.println(Enemy.name + " has an armor class of " + Enemy.getArmorClass()+ " and " + temp2 + " health remaining (E)");
        scan.nextLine();
    }
}
