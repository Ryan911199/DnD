package Game.BattleEngine;

import Characters.Enemys.*;
import Characters.*;

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
        if (occupant instanceof Enemy){
            return " [ E ] ";
        }
        else{
            return " [ P ] ";
        }
        //return "there was a Problem";
    }
}
