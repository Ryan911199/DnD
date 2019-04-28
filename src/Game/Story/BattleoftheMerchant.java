package Game.Story;

import Characters.Enemys.Enemy;
import Characters.Enemys.Goblin;
import Characters.Race;
import Characters.playerCharacter;
import Items.Food.Bread;
import Items.Weapons.Sword;

public class BattleoftheMerchant extends StoryNode {
	public BattleoftheMerchant(StoryList story) {
		super(story);
	}

	@Override
	public void Story(playerCharacter Player) {
		//TODO tell about fighting merchant
		Story.add(new AfterMerchBattle(Story));
	}

	void giveItems(playerCharacter Player) {

	}

	public boolean hasEnemy() {
		return true;
	}

	public boolean mustFight() {
		return true;
	}

	public boolean fightNow() {
		return true;
	}

	public Enemy getEnemy() {
		Enemy enemy = new Goblin(null, new Sword());
		enemy.Inventory.Add(new Bread());
		enemy.Setup("The Merchant", 40, 17,
				15, 13, 18, 13, 13, Race.halfelf);
		return enemy;
	}
}
