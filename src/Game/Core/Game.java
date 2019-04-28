package Game.Core;

import Characters.Enemys.*;
import Characters.Enemys.Goblin;
import Characters.Race;
import Characters.*;
import Game.BattleEngine.BattleEngine;
import Game.Core.Shop;
import Game.Core.Tutorial;
import Game.Helpers.Menu;
import Game.Story.End;
import Game.Story.StoryList;
import Game.Story.StoryNode;

import javax.swing.text.html.Option;
import java.util.Scanner;

public class Game {
    private String[] playerOptions;
    private Menu menu = new Menu();
    private Scanner scan = new Scanner(System.in);
    private Tutorial tutorial = new Tutorial(scan);
    private BattleEngine BattleEngine;
    private Enemy Enemy;
    private playerCharacter Player;
    private StoryList Story = new StoryList();
    private String[] Option1;
    private String[] Option2;
    private boolean mustFight = false;
    private TheTavern Tavern;
    private boolean hasGoneToTavern = false;
    private String[] tutorialOptions = new String[]{"Tavern Tutorial", "Beginning Tutorial", "Mechanics Tutorial"};

    public Game(playerCharacter player) {
        Player = player;
        BattleEngine = new BattleEngine(Player);
        Tavern = new TheTavern(Player);
        Option1 = new String[]{"Go To the Tavern", "Run Tutorial", "Equip Armor", "Continue Story", "Go TO Battle"};
        Option2 = new String[]{"Go To the Tavern", "Run Tutorial", "Equip Armor", "Continue Story"};
        playGame();
    }

    private void playGame() {
        getStory();
        while (true) {
            System.out.println();
            if (Enemy == null) {
                playerOptions = Option2;
            } else {
                playerOptions = Option1;
            }
            switch (menu.menu((playerOptions))) {
                case 1:
                    if (!hasGoneToTavern) {
                        tutorial.TavernTutorial();
                        hasGoneToTavern = true;
                    }
                    Tavern.Tavern(BattleEngine);
                    break;
                case 2:
                    System.out.println("What tutorial would you like to play?");
                    switch (menu.menu((tutorialOptions))) {
                        case 1:
                            tutorial.TavernTutorial();
                            break;
                        case 2:
                            tutorial.start();
                            break;
                        case 3:
                            tutorial.Mechanics();
                            break;
                    }
                    break;
                case 3:
                    Player.equipArmor();
                    break;
                case 4:
                    if (!mustFight) {
                        getStory();
                    }else {
                        System.out.println("You must fight " + Enemy.name + " Before you can move on in the story");
                    }
                    break;
                case 5:
                    if (Enemy != null) {
                        BattleEngine.Battle(Enemy);
                        Enemy = null;
                        mustFight = false;
                    } else {
                        System.out.println("There is no one to fight");
                    }
                    break;
                default:
                    System.out.println("There was a problem most likely in menu or \"game\" to catastrophically mess up");
                    System.exit(1);
                    break;
            }
        }

    }

    private void getStory() {
        StoryNode temp = Story.getStory();
        temp.Story(Player);
        if (temp.hasEnemy()) {
            Enemy = temp.getEnemy();
            if(temp.mustFight()){
                if (temp.fightNow()){
                    BattleEngine.Battle(Enemy);
                    if (Enemy.name.equalsIgnoreCase("Fred the Goblin's Son")) {
                        System.out.println("'Thank you' cried the Damsel 'Here is a token of my gratitude'");
                        System.out.println("The damsel plants a kiss on your cheek and continue on her merrily way ");
                    }
                    Enemy = null;
                }else {
                    mustFight = true;
                }
            }
        }
        if (temp instanceof End) {
            System.exit(0);
        }
    }

}
