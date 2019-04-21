package Game.Story;

import java.util.ArrayList;

public class StoryList {
    private ArrayList<StoryNode> Story = new ArrayList<StoryNode>();
    private int current = 0;
    public StoryList(){
        Story.add(new Begining());

        Story.add(new End());
    }
    public StoryNode getStory(){
        if (Story.get(0) != null){
            StoryNode temp = Story.get(0);
            Story.remove(0);
            return temp;
        }
        return null;
    }
}
