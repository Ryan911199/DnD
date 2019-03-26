package Game.BattleEngine.BattleEvents;

import Game.BattleEngine.BattleEvent;

public class Move extends BattleEvent {
    private Game.BattleEngine.BattleGrid BattleGrid;

    public Move(Game.BattleEngine.BattleGrid battleGrid) {
        super();
        BattleGrid = battleGrid;
    }

    @Override
    public void doEvent() {
        BattleGrid.playerMove();
    }
}
