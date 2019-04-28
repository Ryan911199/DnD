package Game.Core;

import Characters.Enemys.Enemy;
import Characters.Enemys.Goblin;
import Characters.playerCharacter;
import Game.BattleEngine.BattleEngine;
import Game.Helpers.*;
import Items.Armor.Armor;
import Items.Armor.ArmorTypes.boots.*;
import Items.Armor.ArmorTypes.chestplate.*;
import Items.Armor.ArmorTypes.gauntlets.*;
import Items.Armor.ArmorTypes.helmet.*;
import Items.Armor.ArmorTypes.pants.*;
import Items.Food.*;
import Items.Weapons.*;
import Items.item;

import java.util.*;

public class TheTavern {
	private Shop shop;
	private Dice dice = new Dice();
	private Menu menu = new Menu();
	private String[] tutorialOptions = new String[]{"Beginning Tutorial", "Tavern Tutorial", "Mechanics Tutorial"};
	private Scanner scan = new Scanner(System.in);
	private Tutorial tutorial = new Tutorial(scan);
	private String[] Options = new String[]{"Go To Shop", "Run Tutorial", "Get In A Fight", "Buy A Drink"};
	private playerCharacter Player;
	private String[] Names = new String[]{"Tim", "Chuck", "Alfred", "Dominican"};
	private Weapon[] Meelee = {new axe(), new BroadSword(), new Knife(), new Sword()};
	private Weapon[] Ranged = {new Bow(), null, null, null};
	private item[] items = {new Ambrosia(), new BoneMeal(), new Bread(), new CatSoup(), new ElvinBread(), new LegofLamb(), null, null, null};
	private Armor[] Armor = {new lightBoots(), null, new ArcaneChestplate(), new heavyFullPlate(), new lightLeatherChestplate(),
			new lightLeatherChestplate(), null, null, null, new lightLeatherChestplate(), null, new lightLeatherChestplate(), new mediumChainmail(),
			new mediumChainmail(), null, new lightPants(), new lightHelmet(), new lightGauntlets(), null, null, null, null, null, null};


	public TheTavern(playerCharacter player) {
		Player = player;
		shop = new Shop(Player);
	}

	public void Tavern(BattleEngine Engine) {
		switch (menu.menu((Options))) {
			case 1:
				shop.openShop(Player.gold);
				Player.Inventory.print();
				break;
			case 2:
				System.out.println("What tutorial would you like to play?");
				switch (menu.menu((tutorialOptions))) {
					case 1:
						tutorial.start();
						break;
					case 2:
						tutorial.TavernTutorial();
						break;
					case 3:
						tutorial.Mechanics();
						break;
				}
				break;
			case 3:
				Weapon temp1 = Meelee[dice.rollDice(1, 4)];
				Weapon temp2 = Ranged[dice.rollDice(1, 4)];
				Enemy Enemy = new Goblin(temp2, temp1);
				for (int x = 0; x < 4; x++) {
					item temp = items[dice.rollDice(1, 9)];
					if (temp != null) {
						Enemy.Inventory.Add(temp);
					}
				}
				for (int y = 0; y < 4; y++) {
					Armor tempa = Armor[dice.rollDice(1, 20)];
					if (tempa != null) {
						if (tempa instanceof boots) {
							Enemy.boots = (boots) tempa;
						}
						if (tempa instanceof pants) {
							Enemy.pants = (pants) tempa;
						}
						if (tempa instanceof gauntlets) {
							Enemy.gauntlets = (gauntlets) tempa;
						}
						if (tempa instanceof chestplate) {
							Enemy.chestplate = (chestplate) tempa;
						}
						if (tempa instanceof helmet) {
							Enemy.helmet = (helmet) tempa;
						}
					}
				}
				Engine.Battle(Enemy);
				int gold = dice.rollDice(3, 50);
				if (dice.rollDice(1, 100) == 69) {
					gold = 1000;
				}
				System.out.println("Great Job, You check the pockets of " + Enemy.name);
				System.out.println(Player.name + " Was given " + gold);
				Player.gold = Player.gold + gold;

				break;
			case 4:
				//TODO implement get a drink
		}
	}
}
