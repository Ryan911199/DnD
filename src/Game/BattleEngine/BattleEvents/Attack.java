package Game.BattleEngine.BattleEvents;

import Characters.playerCharacter;
import Game.BattleEngine.BattleEvent;

public class Attack extends BattleEvent {
    private int Damage;
    public Attack(playerCharacter owner, playerCharacter target, int damage){
        Owner = owner;
        Target = target;
        Damage = damage;
    }
    @Override
    public void doEvent() {
        System.out.println(Owner.name + " Attacked " + Target.name + " for " + Damage + " damage");
        Target.hitPoints = Target.hitPoints - Damage;

    }
}
