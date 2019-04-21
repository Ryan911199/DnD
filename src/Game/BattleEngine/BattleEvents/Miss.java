package Game.BattleEngine.BattleEvents;

import Characters.playerCharacter;

public class Miss extends BattleEvent {
    public Miss(playerCharacter owner, playerCharacter target) {
        Owner = owner;
        Target = target;
    }

    @Override
    public void doEvent() {
        System.out.println(Owner.name + " tried to attack " + Target.name + " but missed");
        scan.nextLine();
    }
}
