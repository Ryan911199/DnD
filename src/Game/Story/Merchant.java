package Game.Story;

import Characters.Enemys.Enemy;
import Characters.playerCharacter;

public class Merchant extends StoryNode {
    @Override
    public void Story(playerCharacter Player) {
        System.out.println("After defeating Fred the Goblin you get much needed rest to continue your adventure");
        System.out.println("Your hear a screaming of a damsel in distress do you help save her? (Y/N)");
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
