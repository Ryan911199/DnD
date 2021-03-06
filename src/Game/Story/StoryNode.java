package Game.Story;

import Characters.Enemys.Enemy;
import Characters.playerCharacter;

public abstract class StoryNode {
	protected StoryList Story;

	public StoryNode(StoryList story) {
		Story = story;
	}
    abstract public void Story(playerCharacter Player);
    abstract void giveItems(playerCharacter Player);
    abstract public boolean hasEnemy();
    abstract public boolean mustFight();
    abstract public boolean fightNow();
    abstract public Enemy getEnemy();
}
