package Game.Story;

import Characters.Enemys.Enemy;
import Characters.playerCharacter;

public class Next extends StoryNode{

    @Override
    public void Story(playerCharacter Player) {

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
