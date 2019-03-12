package Game.BattleEngine.BattleEvents;

import Game.BattleEngine.BattleEvent;

public class Miss extends BattleEvent {
    @Override
    public void doEvent() {
        System.out.println("Miss");
    }
}
