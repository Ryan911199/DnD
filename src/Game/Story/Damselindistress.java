package Game.Story;

import Characters.Enemys.Enemy;
import Characters.playerCharacter;

public class Damselindistress extends StoryNode {
    @Override
    public void Story(playerCharacter Player) {

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
