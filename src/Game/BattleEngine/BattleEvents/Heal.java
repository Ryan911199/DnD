package Game.BattleEngine.BattleEvents;

import Characters.playerCharacter;

public class Heal extends BattleEvent {
    public Heal(playerCharacter owner, playerCharacter target){
        Owner = owner;
        Target = target;
    }
    @Override
    public void doEvent() {
        System.out.println("Heal");
        scan.nextLine();
    }
}
