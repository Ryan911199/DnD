package Game.Story;

import Characters.Enemys.Enemy;
import Characters.playerCharacter;
import Game.Helpers.YesOrNo;
import java.util.Scanner;

public class Merchant extends StoryNode {

    private static YesOrNo Yes = new YesOrNo();
    private Scanner scan = new Scanner(System.in);

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
            System.out.println("the merchant say the dagger is not for sale");//TODO add Demogorgon knife
            System.out.println("Would you like to try and forcefully take the knife?");
            if (Yes.check()) {
                Story.add(new BattleoftheMerchant(Story));
            } else {
                System.out.println("You say thank you to the merchant and continue on down the path");
                System.out.println("While walking down the path you hear a screaming of a damsel in distress do you help save her? (Y/N)");
                if (Yes.check()) {
                    Story.add(new DamselinDistressBattle(Story));
                } else {
                    Story.add(new BattleoftheKeeperoftheInnerCrypt(Story));
                }
            }
        } else {
            System.out.println("You say thank you to the merchant and continue on down the path");
            System.out.println("While walking down the path you hear a screaming of a damsel in distress do you help save her? (Y/N)");
            if (Yes.check()) {
                Story.add(new DamselinDistressBattle(Story));
            } else {
                Story.add(new BattleoftheKeeperoftheInnerCrypt(Story));
            }
        }
    }

    void giveItems(playerCharacter Player) {

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
