package Game.BattleEngine;

import Characters.playerCharacter;

public abstract class BattleEvent {
    public playerCharacter Owner;
    public playerCharacter Target;
    public int damage;
    public int priority;

    public abstract void doEvent();
}
