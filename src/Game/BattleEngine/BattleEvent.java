package Game.BattleEngine;

public abstract class BattleEvent {
    //public Actor Owner;
    //public Actor Target;
    public int damage;
    public int priority;

    public abstract void doEvent();
}
