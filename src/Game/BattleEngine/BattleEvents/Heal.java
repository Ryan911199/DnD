package Game.BattleEngine.BattleEvents;

import Game.BattleEngine.BattleEvent;

public class Heal extends BattleEvent {
    @Override
    public void doEvent() {
        System.out.println("Heal");
    }
}
