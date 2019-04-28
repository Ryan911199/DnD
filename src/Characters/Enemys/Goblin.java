package Characters.Enemys;


import Characters.playerCharacter;
import Game.BattleEngine.BattleEvents.*;
import Game.BattleEngine.BattleGrid;
import Game.Helpers.Dice;
import Items.Consumable;
import Items.Weapons.Arrow;
import Items.Weapons.Weapon;

public class Goblin extends Enemy {
    private Dice dice = new Dice();
    private Weapon Ranged;
    private Weapon Melee;
    public Goblin(Weapon ranged, Weapon melee){
        Ranged = ranged;
        Melee = melee;
        for (int x = 0; x < 100; x++){
            this.Inventory.Add(new Arrow());
        }
    }

    public String BattleGrid(){
        return "[ E ]";
    }

    @Override
    public String toString() {
        return "I am a Goblin";
    }

    public BattleEvent getAction(playerCharacter Player, BattleGrid grid, boolean attacked) {
        Weapon weapon = Ranged;
        if (hitPoints < 25 && this.Inventory.getItemEnemyCheck()){
            return new UseItem((Consumable) this.Inventory.getItemEnemy(), this);
        }
        if (!attacked) {
            if (Ranged == null) {
                if (!grid.canMeelee()) {
                    return new Move(grid, this);
                }
                weapon = Melee;
            }
            int roll = dice.rollDice(1, 20);
            boolean Critical = false;
            //System.out.print("You rolled a " + roll);
            if (roll == 1) {
                return new Miss(this, Player);
            } else if (roll == 20) {
                Critical = true;
            }

            if (weapon.isRanged) {
                roll = roll + this.abilityMod(this.Strength) + this.baseAttackBonus;
            } else {
                roll = roll + this.abilityMod(this.Dexterity) + this.baseAttackBonus;
            }
            if (Player.getArmorClass() > roll) {
                return new Miss(this, Player);
            } else {
                return new Attack(this, Player, weapon, Critical);
            }
        }
        if (this.Inventory.getItemEnemyCheck()) {
            return new UseItem((Consumable) this.Inventory.getItemEnemy(), this);
        } else {
            return new Wait(this.name + "chose to wait this turn");
        }
    }

}
