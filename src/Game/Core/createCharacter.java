package Game.Core;

import Characters.*;
import Characters.PlayerClasses.*;
import Game.Helpers.Dice;
import Game.Helpers.GetnumAns;
import Game.Helpers.Menu;
import Game.Helpers.YesOrNo;

import java.util.Scanner;


public class createCharacter {
	public String name;
	private int Strength;
	private int Dexterity;
	private int Constitution;
	private int Intelligence;
	private int Wisdom;
	private int Charisma;
	private Race playerRace;
	private int age;
	private YesOrNo Yes = new YesOrNo();
	private GetnumAns getNum = new GetnumAns();

	public createCharacter() {
		name = "Tom";
		Strength = -1;
		Dexterity = -1;
		Constitution = -1;
		Intelligence = -1;
		Wisdom = -1;
		Charisma = -1;
		playerRace = Race.notchosen;
	}

	public playerCharacter newPlayer() {
		Scanner scan = new Scanner(System.in);
		Menu menu = new Menu();
		playerCharacter player;
		String ans = "n";
		String[] classes = {"barbarian", "bard", "cleric", "druid", "fighter", "monk", "paladin", "ranger", "rogue", "sorcerer", "wizard"};
		String[] races = {"human", "dwarf", "elf", "gnome", "half-lings", "half-elf", "half-orc"};
		playerCharacter[] PlayerPick = {new barbarian(), new bard(), new cleric(), new druid(),
				new fighter(), new monk(), new paladin(), new ranger(), new rogue(), new sorcerer(), new wizard()};

		System.out.println();
		System.out.println("Lets us create a character");
		System.out.println("The first thing we need to do is roll ability scores and assign them to an ability");
		System.out.println("Ability scores affect how the game is played. Take for example Strength, this is one of the 6 ability scores.");
		System.out.println("If you are attacking someone with a Melee weapon then your strength score impacts how much damage you do. (E)");
		scan.nextLine();
		System.out.println("If you have a high Strength modifier and you get a successful hit then you will deal more damage to your opponent.");
		System.out.println("However if say you are using a bow and have low Dexterity " +
				"(dexterity impacts Armor and Ranged weapon attacks) the damage you deal could be reduced. (E)");
		scan.nextLine();
		System.out.println(" now that you hvae a basic understanding of how ability scores work please roll the dice to determine your ability scores");
		System.out.println("Hit Enter to roll the dice (E)");
		scan.nextLine();
		abilityRoll(scan);
		System.out.println("now it is time for you to pick you race ");
		System.out.println("Each race has a their strengths and weaknesses");
		System.out.println("for example if you pick dwarf ");
		switch (menu.menu(races)) { //TODO add race benefits to abilities
			case 1:
				playerRace = Race.human;
				break;
			case 2:
				playerRace = Race.dwarf;
				Constitution = Constitution + 2;
				Charisma = Charisma - 2;
				break;
			case 3:
				playerRace = Race.elf;
				Dexterity = Dexterity + 2;
				Constitution = Constitution - 2;
				break;
			case 4:
				playerRace = Race.gnome;
				break;
			case 5:
				playerRace = Race.halflings;
				break;
			case 6:
				playerRace = Race.halfelf;
				break;
			case 7:
				playerRace = Race.halforc;
				break;
		}
		System.out.println("great, next lets pick a class type for your character");//TODO tell player the benefits of each class
		player = PlayerPick[((menu.menu(classes)) - 1)];
		System.out.println("Now it is time to pick a name. what would you like to be called?");
		name = scan.nextLine();
		System.out.println("How old are you?");
		age = getNum.getNum();
		raceAjustments();
		player.Setup(name, age, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, playerRace);
		return player;
	}

	public void abilityRoll(Scanner scan) {
		Dice die = new Dice();
		int[] abilityScores = new int[6];

		for (int i = 0; i < 6; i++) {
			abilityScores[i] = (die.rollDice(4, 6) - 3);
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(abilityScores[i] + ", ");
		}
		System.out.println();
		System.out.println("do you want to reroll all of the dice?"); //TODO tell them why they might want to reroll
		if (Yes.check()) {
			reroll(scan);
			return;
		}
		placeAbilityScores(scan, abilityScores);
	}

	public void reroll(Scanner scan) {
		abilityRoll(scan);
	}

	public void placeAbilityScores(Scanner scan, int[] scores) {
		System.out.println("it is now time to pick where you want your scores to be applied");
		System.out.println("here are all of the categories they can be applied to");
		System.out.println("Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma (E)"); //TODO tell them what the categories do
		scan.nextLine();
		System.out.println();
		System.out.println("what number would you like to assign to Strength ");
		options(scores);
		System.out.println("please choose a number");
		Strength = inArray(scores, scan);
		System.out.println("what number would you like to assign to Dexterity ");
		options(scores);
		Dexterity = inArray(scores, scan);
		System.out.println("what number would you like to assign to Constitution ");
		options(scores);
		Constitution = inArray(scores, scan);
		System.out.println("what number would you like to assign to Intelligence ");
		options(scores);
		Intelligence = inArray(scores, scan);
		System.out.println("what number would you like to assign to Wisdom ");
		options(scores);
		Wisdom = inArray(scores, scan);
		System.out.println("what number would you like to assign to Charisma ");
		options(scores);
		Charisma = inArray(scores, scan);
		//strength,  dexterity,  constitution,  intelligence,  wisdom,  charisma
	}

	public void options(int[] op) {
		for (int i = 0; i < 6; i++) {
			if (op[i] != 0) {
				System.out.print(op[i] + ", ");
			}
		}
		System.out.println();
	}

	public int inArray(int[] arr, Scanner scan) {
		int ans = getNum.getNum();
		while (true) {
			for (int i = 0; i < 6; i++) {
				if (arr[i] == ans) {
					arr[i] = 0;
					System.out.println("the number was assigned");
					return ans;
				}
			}
			System.out.println("This number is not in the array please try again");
			System.out.println("here are your options");
			options(arr);
			System.out.println("please choose a number");
			ans = scan.nextInt();
			scan.nextLine();
		}
	}

	private void raceAjustments() {
		if (playerRace == Characters.Race.halforc) {
			Intelligence = Intelligence - 2;
			Strength = Strength + 2;
			Charisma = Charisma - 2;
		}
		if (playerRace == Characters.Race.gnome) {
			Constitution = Constitution + 2;
			Strength = Strength - 2;
		}
		if (playerRace == Characters.Race.dwarf) {
			Constitution = Constitution + 2;
			Charisma = Charisma - 2;
		}
		if (playerRace == Characters.Race.halflings) {
			Dexterity = Dexterity + 2;
			Strength = Strength - 2;
		}
		if (playerRace == Characters.Race.elf) {
			Dexterity = Dexterity + 2;
			Constitution = Constitution - 2;
		}
	}

}
