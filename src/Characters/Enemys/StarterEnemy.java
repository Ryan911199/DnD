package Characters.Enemys;


import Characters.playerCharacter;
import Game.BattleEngine.BattleEvents.BattleEvent;
import Game.BattleEngine.BattleEvents.Miss;
import Game.BattleEngine.BattleGrid;

public class StarterEnemy extends Enemy {
    public StarterEnemy(String Name){
        name = Name;
        //hitPoints = 10;
    }

    public String BattleGrid(){
        return "[ E ]";
    }

    @Override
    public String toString() {
        return "I am a the Tutorial Enemy";
    }

    @Override
    public BattleEvent getAction(playerCharacter Target, BattleGrid grid) {
        return null;
    }
}
