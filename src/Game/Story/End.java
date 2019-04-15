package Game.Story;

import Characters.playerCharacter;

public class End extends StoryNode{
    @Override
    public void Story(playerCharacter Player) {
        System.out.println("Thanks for playing our game have a good day");
    }

    @Override
    void giveItems(playerCharacter Player) {

    }
}
