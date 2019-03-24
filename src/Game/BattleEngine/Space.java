package Game.BattleEngine;

import Characters.Goblin;
import Characters.playerCharacter;

public class Space {
    private playerCharacter occupant;

    public Space(){
        occupant = null;
    }

    public Space(playerCharacter Occupant){
        occupant = Occupant;
    }

    public void setOccupant(playerCharacter Occupant) {
        occupant = Occupant;
    }

    @Override
    public String toString() {
        if (occupant == null){
            return " [   ] ";
        }
        if (occupant.isEnemy){
            return " [ E ] ";
        }
        else if(!occupant.isEnemy){
            return " [ P ] ";
        }
        return "there was a Problem";
    }
}
