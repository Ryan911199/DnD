package Game.Story;

import Characters.Enemys.Enemy;
import Characters.playerCharacter;

public class BattleoftheDemogorgon extends StoryNode {
    @Override
    public void Story(playerCharacter Player) {

    }

    void giveItems(playerCharacter Player) {

    }

    public boolean hasEnemy() {
        return true;
    }

    public boolean mustFight() {
        return true;
    }

    public boolean fightNow() {
        return true;
    }

    public Enemy getEnemy() {
        return null;
    }
}
