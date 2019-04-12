package Game.Story;

import Characters.playerCharacter;

public abstract class StoryNode {
    abstract public void Story(playerCharacter Player);
    abstract void giveItems(playerCharacter Player);
}
