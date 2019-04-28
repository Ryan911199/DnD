package Game.BattleEngine.BattleEvents;

import Characters.playerCharacter;

public class Miss extends BattleEvent {
    private String reason = null;
    public Miss(playerCharacter owner, playerCharacter target) {
        Owner = owner;
        Target = target;
    }

    public Miss(playerCharacter owner, playerCharacter target, String Reason) {
        Owner = owner;
        Target = target;
        reason = Reason;
    }

    @Override
    public void doEvent() {
        if (reason != null) {
            System.out.println(reason);
            scan.nextLine();
        } else {
            System.out.println(Owner.name + " tried to attack " + Target.name + " but missed (E)");
            scan.nextLine();
        }
    }
}
