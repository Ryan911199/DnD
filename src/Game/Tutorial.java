package Game;

import Characters.Enemys.Goblin;
import Characters.Enemys.StarterEnemy;
import Characters.Race;
import Characters.playerCharacter;
import Game.BattleEngine.BattleEngine;
import Game.Helpers.Menu;
import Game.Helpers.YesOrNo;

import java.util.Scanner;

public class Tutorial {
    private Scanner scan;
    private YesOrNo Yes = new YesOrNo();
    private Menu menu = new Menu();
    private String[] YesOrNa = {"Yes", "No"};

    public Tutorial(Scanner Scan){
        scan = Scan;
    }

    public void start(){
        System.out.println("Great so this is your first time Playing (insert game name here)");
        System.out.println("This game is a spin off of Dungeons and dragons focused on combat with basic AI enemies");
        System.out.println("In the game we will be asking you a lot of yes or no questions ");
        System.out.println("all you have to do is type yes or no and hit enter even a sample Y or N will work (capitalization does not matter) ");
        System.out.println();
        System.out.println("does that make sense?");
        while (!Yes.check()){
            System.out.println("It is pretty simple, for right now please just type yes");
        }
        System.out.println("Great, sometimes we will just type out some of what we are trying to tell you then wait for you to hit Enter to tell you more");
        System.out.println("This is represented by the (E) symbol at the end of a line");
        System.out.println("We do this so we don't overwhelm you with a wall of text. If that make sense please hit Enter (E)");
        scan.nextLine();
        System.out.println("Good, we also will ask you to pick something from a list. To do this just type the number that corresponds to the selection you would like to make");
        System.out.println("Would you like us to explain that again?");
        while (menu.menu(YesOrNa) == 1){
            System.out.println("Sometimes we will ask you to pick something form a list. To do this just type the number that corresponds to the selection you would like to make");
            System.out.println("Would you like us to explain that again?");
        }
        System.out.println("Now lets talk about some of the game mechanics ");
        Mechanics();
    }
    public void Mechanics(){
        System.out.println("the first thing you will do after this tutorial is create a character");
        System.out.println("this character can be any of the 7 major DnD races");
        System.out.println("human, dwarf, elf, gnome, half-lings, half-elf, half-orc (E)");
        scan.nextLine();
        System.out.println("after that you will pick one of the 11 classes ");
        System.out.println("barbarian, bard, cleric, druid, fighter, monk, paladin, ranger, rogue, sorcerer, wizard (E)");
        scan.nextLine();
        System.out.println("Each Race has their own strengths and weaknesses. For example, if you pick a Dwarf then you get a + 2 Constitution modifier and a -2 Charisma modifier");
        //System.out.println("(dont worry we will tell you each Races Special class when the time comes)");
        System.out.println("Constitution and Charisma are both abilities.(E)");
        scan.nextLine();
        System.out.println("There are six ability categories");
        System.out.println("Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma,");
        System.out.println("Each category has an affect on how your player plays");

    }
    public void theShop(){
        System.out.println("Welcome to the Shop, here you can buy items like armor, weapons, potions and food");
        System.out.println("Everything here costs gold. To buy something just select the number corresponding to the item. If you have the money and room to hold the item then it will be added to your inventory");
    }
    public void Combat(playerCharacter Player){
        BattleEngine BattleEngine = new BattleEngine(Player);
        StarterEnemy weakgob = new StarterEnemy("Weak Fred");
        weakgob.Setup("Weak Fred", 13, 13, 13, 13, 13, 13, 13, Race.halfelf);
        System.out.println("Welcome " + Player.name+ " to the combat tutorial. In this we will walk you through how to fight Fred The Weak. (Fred is a goblin");
        BattleEngine.Battle(weakgob);
    }
}
