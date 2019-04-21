package Game.Story;

import Characters.Enemys.Enemy;
import Characters.playerCharacter;

public class End extends StoryNode{
    @Override
    public void Story(playerCharacter Player) {
        System.out.println("Thanks for playing our game have a good day");
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
