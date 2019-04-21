package Game.BattleEngine.BattleEvents;

import Characters.playerCharacter;

import java.util.Scanner;

public abstract class BattleEvent {
    public playerCharacter Owner;
    public playerCharacter Target;
    protected Scanner scan = new Scanner(System.in);

    public abstract void doEvent();
}
