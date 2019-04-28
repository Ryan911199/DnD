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
    @Override
    public void Story(playerCharacter Player) {
        System.out.println("You realize you must travel to the Demogorgon lair in the northern region of Anokara");
        System.out.println("So you pack up all your belongings and begin your trek for the long road ahead (E)");
        scan.nextLine();
        System.out.println("As you are setting up camp after a long days travel along the Plains of Stelphi");
        System.out.println("You hear a rustling in the bushes");
        System.out.println("Do you go check in out?");
        if (Yes.check())
        {
            System.out.println("As you approach the bushes a goblin leaps out and is ready to attack you");
            //que fight with frederick the goblin
            System.out.println("After defeating Fred the Goblin you get much needed rest to continue your adventure (E)");
            scan.nextLine();
        }
        else
        {
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
        return false;
    }

    @Override
    public boolean mustFight() {
        return false;
    }

    @Override
    public boolean fightNow() {
        return false;
    }

    @Override
    public Enemy getEnemy() {
        return null;
    }
}
