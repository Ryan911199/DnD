package Game.BattleEngine;

import Characters.playerCharacter;
import Game.Helpers.DoAction;

import java.util.ArrayList;

public class BattleEngine {
    private BattleNode head;
    private ArrayList<playerCharacter> compatants = new ArrayList<playerCharacter>();
    private DoAction Action = new DoAction();
    playerCharacter Player;

    public BattleEngine(playerCharacter player){
        Player = player;
        compatants.add(Player);
    }

    public void Battle(){
        getActions();
        while (head != null){
            head.event.doEvent();
            head = head.getNext();
        }
    }
    public void getActions(){
        //ArrayList<playerCharacter> Battleorder = new ArrayList<playerCharacter>();
        ArrayList<playerCharacter> Battleorder = compatants;
        for(int x = 0; x < Battleorder.size(); x++){
            addEvent(Action.getAction(Battleorder.get(x)));
        }
    }
    public void addEvent(BattleEvent add){
        BattleNode current = head;
        BattleNode Add = new BattleNode(add);
        if(head == null){
            head = Add;
        }else {
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(Add);
            Add.setLast(current);
        }
    }
}
