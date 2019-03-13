package Game.BattleEngine.BattleEvents;

import Characters.playerCharacter;
import Game.BattleEngine.BattleEvent;

public class Heal extends BattleEvent {
    public Heal(playerCharacter owner, playerCharacter target){
        Owner = owner;
        Target = target;
    }
    @Override
    public void doEvent() {
        System.out.println("Heal");
    }
}
