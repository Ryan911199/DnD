package Game.Story;

import Characters.Enemys.Enemy;
import Characters.Enemys.Goblin;
import Characters.Race;
import Characters.playerCharacter;
import Game.Graphics.*;
import Items.Armor.ArmorTypes.chestplate.lightLeatherChestplate;
import Items.Food.Bread;
import Items.Weapons.Arrow;
import Items.Weapons.Bow;
import Items.Weapons.Sword;

import java.util.Scanner;

public class Begining extends StoryNode{
    private Scanner scan = new Scanner(System.in);

	public Begining(StoryList story) {
		super(story);
	}

    @Override
    public Enemy getEnemy() {
        return null;
    }

    public void Story(playerCharacter Player) {
        System.out.println("You walk in to a room and there is your grandfather laying on the ground");
        System.out.println("He has been killed by the Demogorgon");
        System.out.println("in his had he is holding a note written in his own blood (E)");
        scan.nextLine();
        System.out.println("You bend down pick up the note and read it");
        Note();
        scan.nextLine();
        //System.out.println(Player.name + " Was given a New Bow");
        //System.out.println(Player.name + " Was given a 3 Arrows");
        System.out.println(Player.name + " Was given a New Sword" );
        System.out.println(Player.name + " Was given a New Leather Chestplate" );
        System.out.println(Player.name + " Was given a loaf of Bread");
        System.out.println(Player.name + " Was given a 100 Gold");
        giveItems(Player);
    }

    void giveItems(playerCharacter Player){
        Player.Inventory.Add(new Sword());
        Player.Inventory.Add(new lightLeatherChestplate());
        Player.Inventory.Add(new Bread());
        Player.gold = 100;
    }

    private void Note(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|                             Note                              |");
        System.out.println("|                If your reading this                           |");
        System.out.println("|                                                               |");
        System.out.println("|                     I am most likely dead                     |");
        System.out.println("|                                                               |");
        System.out.println("|                There are many people, monsters and            |");
        System.out.println("|              other things that would want me dead             |");
        System.out.println("|                                                               |");
        System.out.println("|             So I leave with you, your inheritance             |");
        System.out.println("|                                                               |");
        System.out.println("|            And all I ask is that you avenge me                |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                              (E)                              |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public boolean hasEnemy() {
        return false;
    }

    public boolean mustFight() {
        return false;
    }

    public boolean fightNow() {
        return false;
    }
}
