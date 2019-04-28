package Game.Story;

import Characters.Enemys.Enemy;
import Characters.playerCharacter;
import Game.Helpers.YesOrNo;
import Items.Weapons.daggeroftheInfernal;


public class AfterMerchBattle extends StoryNode {
	private static YesOrNo Yes = new YesOrNo();

	public AfterMerchBattle(StoryList story) {
		super(story);
	}

	@Override
	public void Story(playerCharacter Player) {
		System.out.println("After defeating the Merchant you take the dagger");
		System.out.println(Player.name + " took The Dagger of the Infernal");
		System.out.println("While walking down the path you hear a screaming of a damsel in distress do you help save her? (Y/N)");
		if (Yes.check()) {
			Story.add(new DamselinDistressBattle(Story));
		} else {
			Story.add(new BattleoftheKeeperoftheInnerCrypt(Story));
		}
	}

	void giveItems(playerCharacter Player) {
		Player.Inventory.Add(new daggeroftheInfernal());
	}

	public boolean hasEnemy() {
		return false;
	}

	public boolean mustFight() {
		return false;
	}

	public boolean fightNow() {
		return false;
	}

	public Enemy getEnemy() {
		return null;
	}
}
