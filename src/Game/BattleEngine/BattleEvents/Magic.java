package Game.BattleEngine.BattleEvents;

public class Magic extends BattleEvent {
	private int spell;

	public Magic(int Spell) {
		spell = Spell;
	}

	@Override
	public void doEvent() {
		switch (spell) {
			case 1:
				//Add spell
				break;
			case 2:
				//Add spell
				break;
			case 3:
				//Add spell
				break;
			case 4:
				//Add spell
				break;
			case 5:
				//Add spell
				break;
		}
	}
}
