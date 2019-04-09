package Characters.Enemys;

import Characters.playerCharacter;
import Game.BattleEngine.BattleEvents.BattleEvent;

public abstract class Enemy extends playerCharacter {

    public abstract BattleEvent getAction(playerCharacter Target);
}
