package Game.BattleEngine.BattleEvents;

import Characters.playerCharacter;
import Game.BattleEngine.BattleEvent;

public class Attack extends BattleEvent {
    public Attack(playerCharacter owner, playerCharacter target){
        Owner = owner;
        Target = target;
    }
    @Override
    public void doEvent() {
        System.out.println("Attack");
    }
}
