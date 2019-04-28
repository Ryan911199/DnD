package Game.BattleEngine.BattleEvents;

import Characters.playerCharacter;

public class Heal extends BattleEvent {
	private int Heal;

	public Heal(playerCharacter owner, int heal) {
        Owner = owner;
		Heal = heal;
    }
    @Override
    public void doEvent() {
		System.out.println(Owner.name + " healed themselves for " + Heal + " hitpoints (E)");
        scan.nextLine();
    }
}
