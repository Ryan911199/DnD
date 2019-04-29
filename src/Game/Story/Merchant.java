package Game.Story;

import Characters.Enemys.Enemy;
import Characters.Enemys.Goblin;
import Characters.Race;
import Characters.playerCharacter;
import Game.Helpers.YesOrNo;
import Items.Food.Bread;
import Items.Weapons.Sword;

import java.util.Scanner;

public class Merchant extends StoryNode {

    private static YesOrNo Yes = new YesOrNo();
    private Scanner scan = new Scanner(System.in);
    private boolean hasEnemy = false;
    private boolean mustFight = false;
    private boolean fightNow = false;

    public Merchant(StoryList story) {
        super(story);
    }

    @Override
    public void Story(playerCharacter Player) {
        System.out.println("After defeating Fred the Goblin you get much needed rest to continue your adventure");
        System.out.println("Along the path towards the northern region you pass a merchant");
        System.out.println("You stop and look and what he has to offer and you notice the prices are outrageous");
        System.out.println("but you also spot a unique looking dagger tucked away in the back of his shop");
        System.out.println("Do you ask if it is for sale? (Y/N)");
        if (Yes.check()) {
            System.out.println("the merchant says the dagger is not for sale");
            System.out.println("Would you like to try and forcefully take the knife? (Y/N)");
            if (Yes.check()) {
                hasEnemy = true;
                mustFight = true;
                fightNow = true;
                Story.add(new DamselinDistressBattle(Story));
            } else {
                System.out.println("You say thank you to the merchant and continue on down the path");
                Story.add(new DamselinDistressBattle(Story));
            }
        } else {
            System.out.println("You say thank you to the merchant and continue on down the path");
            Story.add(new DamselinDistressBattle(Story));
        }
    }

    void giveItems(playerCharacter Player) {

    }

    public boolean hasEnemy() {
        return hasEnemy;
    }

    public boolean mustFight() {
        return mustFight;
    }

    public boolean fightNow() {
        return fightNow;
    }

    public Enemy getEnemy() {
        Enemy enemy = new Goblin(null, new Sword());
        enemy.Inventory.Add(new Bread());
        enemy.Setup("The Merchant", 40, 17,
                15, 13, 18, 13, 13, Race.halfelf);
        enemy.setHealth(5);
        return enemy;
    }
}
