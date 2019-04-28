package Characters.Enemys;

import Characters.playerCharacter;
import Game.BattleEngine.BattleEvents.*;
import Game.BattleEngine.BattleGrid;
import Game.Helpers.Dice;
import Items.Armor.ArmorTypes.boots.lightBoots;
import Items.Armor.ArmorTypes.chestplate.ArcaneChestplate;
import Items.Armor.ArmorTypes.gauntlets.lightGauntlets;
import Items.Armor.ArmorTypes.helmet.lightHelmet;
import Items.Armor.ArmorTypes.pants.lightPants;
import Items.Consumable;

public class Demogorgon extends Enemy {

	private Dice dice = new Dice();

	public Demogorgon() {
		hitPoints = 10000;
		helmet = new lightHelmet();
		boots = new lightBoots();
		gauntlets = new lightGauntlets();
		chestplate = new ArcaneChestplate();
		pants = new lightPants();
	}

	public String BattleGrid() {
		return "[ E ]";
	}

	@Override
	public String toString() {
		return "I am the Demogorgon";
	}

	public BattleEvent getAction(playerCharacter Player, BattleGrid grid, boolean attacked) {
		if (hitPoints < 50 && this.Inventory.getItemEnemyCheck()) {
			return new UseItem((Consumable) this.Inventory.getItemEnemy(), this);
		} else if (hitPoints < 50) {
			return new Heal(this, 50);
		}
		if (!attacked) {
			return new Magic(dice.rollDice(1, 5));
		}
		return new Heal(this, 50);
	}

	public void Equipped() {
		System.out.println("The Demogorgon does not have a weapon it uses magic");
		System.out.println("but it is wearing ");
		String temp = "";
		temp = temp + " " + helmet;
		temp = temp + " " + chestplate;
		temp = temp + " " + gauntlets;
		temp = temp + " " + pants;
		temp = temp + " " + boots;
		System.out.print(temp);
		System.out.println("        (E)");
	}
}
