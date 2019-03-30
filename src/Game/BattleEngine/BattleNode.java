package Game.BattleEngine;

import Game.BattleEngine.BattleEvents.BattleEvent;

public class BattleNode {
    private BattleNode last;
    private BattleNode next;
    public BattleEvent event;

    public BattleNode(BattleEvent d){
        event = d;
        next = null;
    }

    public BattleNode getLast() { return last; }

    public void setLast(BattleNode Last) { last = Last; }

    public void setNext(BattleNode n){
        next = n;
    }

    public BattleNode getNext(){
        return next;
    }

}
