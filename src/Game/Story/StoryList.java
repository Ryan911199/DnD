package Game.Story;

import java.util.ArrayList;

public class StoryList {
    private ArrayList<StoryNode> Story = new ArrayList<StoryNode>();
    private int current = 0;
    public StoryList(){
		Story.add(new Begining(this));
		Story.add(new Trail(this));
		Story.add(new Merchant(this));
		//Story.add(new DamselinDistressBattle(this));
		//Story.add(new BattleoftheKeeperoftheInnerCrypt(this));
		//Story.add(new BattleoftheDemogorgon(this));
		//Story.add(new End());
    }
    public StoryNode getStory(){
        if (Story.get(0) != null){
            StoryNode temp = Story.get(0);
            Story.remove(0);
            return temp;
        }
        return null;
    }

    public void add(StoryNode A) {
        Story.add(A);
    }
}
