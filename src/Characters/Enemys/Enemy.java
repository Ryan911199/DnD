package Characters.Enemys;

import Characters.playerCharacter;
import Game.BattleEngine.BattleEvents.BattleEvent;
import Game.BattleEngine.BattleGrid;
import Items.Weapons.Weapon;

public abstract class Enemy extends playerCharacter {
    private Weapon Ranged;
    private Weapon Melee;

    public abstract BattleEvent getAction(playerCharacter Target, BattleGrid grid, boolean Attacked);

    public abstract void Equipped();

    public void setHealth(int h) {
        hitPoints = h;
    }

}
