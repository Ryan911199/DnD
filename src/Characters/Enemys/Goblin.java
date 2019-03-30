package Characters.Enemys;


import Game.BattleEngine.BattleEvents.BattleEvent;
import Game.BattleEngine.BattleEvents.Miss;

public class Goblin extends Enemy {
    public Goblin(String Name){
        name = Name;
    }

    public String BattleGrid(){
        return "[ E ]";
    }

    @Override
    public String toString() {
        return "I am a Goblin";
    }

    public BattleEvent getAction(){
        return new Miss();
    }
}
