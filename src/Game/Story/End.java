package Game.Story;

import Characters.Enemys.Enemy;
import Characters.playerCharacter;

public class End extends StoryNode{
    public End(StoryList story) {
        super(story);
    }

    @Override
    public void Story(playerCharacter Player) {
        System.out.println("That is amazing. You beat the Demogorgon");
        System.out.println("Thanks for playing our game. Fell free to come back and play again.");
        System.out.println("Have a good day");
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
