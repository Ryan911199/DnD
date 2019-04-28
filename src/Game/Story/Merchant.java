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

public class Merchant extends StoryNode {

    private static YesOrNo Yes = new YesOrNo();
    private Scanner scan = new Scanner(System.in);

    @Override
    public void Story(playerCharacter Player) {
        System.out.println("After defeating Fred the Goblin you get much needed rest to continue your adventure");
        System.out.println("Your hear a screaming of a damsel in distress do you help save her? (Y/N)");
        System.out.println("You continue along the path towards the northern region and you pass a merchant");
        System.out.println("You stop and look and what he has to offer and you notice the prices are outrageous");
        System.out.println("but you also spot a unique looking dagger tucked away in the back of his shop");
        System.out.println("Do you ask if it is for sale? (Y/N)");
        if (Yes.check())
        {
            //initiate battle for the daygar
        }
        else
        {
            //go to the battle fo the keeper of the crypt
        }

    }

    void giveItems(playerCharacter Player) {
        //give the razor of the infernal (demogorgon slayer))
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

    public Enemy getEnemy() {
        return null;
    }
}
