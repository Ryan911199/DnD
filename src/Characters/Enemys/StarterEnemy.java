package Characters.Enemys;


import Game.BattleEngine.BattleEvents.BattleEvent;
import Game.BattleEngine.BattleEvents.Miss;

public class StarterEnemy extends Enemy {
    public StarterEnemy(String Name){
        name = Name;
    }

    public String BattleGrid(){
        return "[ E ]";
    }

    @Override
    public String toString() {
        return "I am a the Tutorial Enemy";
    }

    public BattleEvent getAction(){
        return new Miss();
    }
}
