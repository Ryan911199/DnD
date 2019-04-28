package Characters.Enemys;

import Characters.playerCharacter;
import Game.BattleEngine.BattleEvents.BattleEvent;
import Game.BattleEngine.BattleGrid;

public abstract class Enemy extends playerCharacter {

    public abstract BattleEvent getAction(playerCharacter Target, BattleGrid grid, boolean Attacked);
}
