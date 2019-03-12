package Game.BattleEngine.BattleEvents;

import Game.BattleEngine.BattleEvent;

public class Attack extends BattleEvent {
    @Override
    public void doEvent() {
        System.out.println("Attack");
    }
}
