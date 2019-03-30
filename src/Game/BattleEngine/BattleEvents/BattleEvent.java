package Game.BattleEngine.BattleEvents;

import Characters.playerCharacter;

public abstract class BattleEvent {
    public playerCharacter Owner;
    public playerCharacter Target;


    public abstract void doEvent();
}
