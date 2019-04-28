package Game.BattleEngine.BattleEvents;

import Characters.playerCharacter;
import Items.Weapons.*;

import java.util.Scanner;

public class Attack extends BattleEvent {
    private Weapon weapon;
    private Scanner scan = new Scanner(System.in);
    boolean Critical;
    public Attack(playerCharacter owner, playerCharacter target, Weapon userWeapon, boolean critical){
        Owner = owner;
        Target = target;
        weapon = userWeapon;
        Critical = critical;
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

        }
        Attack();
        scan.nextLine();
    }
    private void Attack(){
        System.out.println(Owner.name + " Attacked " + Target.name + " for " + weapon.attack() + " damage (E)");
        Target.hitPoints = Target.hitPoints - (weapon.attack() + Owner.abilityMod(Owner.Strength));
        Target.hitPoints++;
    }
}
