package Game.Story;

import Characters.Enemys.Enemy;
import Characters.Enemys.Goblin;
import Characters.Race;
import Characters.playerCharacter;
import Game.Graphics.*;
import Game.Helpers.YesOrNo;
import Items.Armor.ArmorTypes.chestplate.lightLeatherChestplate;
import Items.Food.Bread;
import Items.Weapons.Arrow;
import Items.Weapons.Bow;
import Items.Weapons.Sword;

import java.util.Scanner;

public class Trail extends StoryNode
{
    private static YesOrNo Yes = new YesOrNo();
    private Scanner scan = new Scanner(System.in);

    public Trail(StoryList story) {
        super(story);
    }

    //private StoryList StoryList;
//    public Trail(StoryList list){
//        StoryList = list;
//    }
    @Override
    public void Story(playerCharacter Player) {
        System.out.println("You realize you must travel to the Demogorgon lair in the northern region of Anokara");
        System.out.println("So you pack up all your belongings and begin your trek for the long road ahead (E)");
        scan.nextLine();
        System.out.println("As you are setting up camp after a long days travel along the Plains of Stelphi");
        System.out.println("You hear a rustling in the bushes");
        System.out.println("Do you go check in out? (Y/N)");
        if (Yes.check())
        {
            System.out.println("As you approach the bushes a goblin leaps out and is ready to attack you");
        } else {
            System.out.println("You choose to not check the ominous and strange rumbling of the bushes so you sleep for the night");
            System.out.println("but you never wake up since a goblin was hiding in the bushes to assassinate you");
            System.out.println("and to steal of of your belongings");
            System.out.println("You lose!!!!!!!!!!!!!");
            System.exit(0);
        }
    }

    @Override
    void giveItems(playerCharacter Player) {

    }

    @Override
    public boolean hasEnemy() {
        return true;
    }

    @Override
    public boolean mustFight() {
        return true;
    }

    @Override
    public boolean fightNow() {
        return true;
    }

    @Override
    public Enemy getEnemy() {
        Enemy enemy = new Goblin(null, new Sword());
        enemy.Inventory.Add(new Bread());
        enemy.Setup("Fred the Goblin", 40, 13,
                13, 13, 2, 13, 13, Race.halfelf);
        return enemy;
    }
}
