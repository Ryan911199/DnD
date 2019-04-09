package Game.BattleEngine.BattleEvents;

import Characters.playerCharacter;
import Items.Weapons.*;

public class Attack extends BattleEvent {
    private Weapon weapon;
    public Attack(playerCharacter owner, playerCharacter target, Weapon useerWeapon){
        Owner = owner;
        Target = target;
        weapon = useerWeapon;
    }
    @Override
    public void doEvent() {
        if (weapon.isRanged){
            if (weapon instanceof Bow){
                if(Owner.Inventory.getArrow()){
                    Attack();
                    return;
                }else {
                    System.out.println("You do not have any Arrows. That means you missed.");
                }
            }
            if (weapon instanceof ThrowingDaggers){
                if(Owner.Inventory.getThrowingDagger()){
                    Attack();
                    return;
                }else {
                    System.out.println("You do not have any Throwing Daggers. That means you missed.");
                }
            }
        }
        Attack();
    }
    private void Attack(){
        System.out.println(Owner.name + " Attacked " + Target.name + " for " + weapon.attack() + " damage");
        Target.hitPoints = Target.hitPoints - weapon.attack();
    }
}
