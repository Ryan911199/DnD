package Game.BattleEngine.BattleEvents;

import Characters.Enemys.Enemy;
import Characters.playerCharacter;
import Game.BattleEngine.BattleGrid;

public class Move extends BattleEvent {
    private Game.BattleEngine.BattleGrid BattleGrid;

    public Move(BattleGrid battleGrid, playerCharacter Owner) {
        super();
        BattleGrid = battleGrid;
    }

    @Override
    public void doEvent() {
        if (Owner instanceof Enemy){
            BattleGrid.enemyMove();
        }
        BattleGrid.playerMove();
    }
}
