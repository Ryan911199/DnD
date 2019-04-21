package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class cleric extends playerCharacter {
    public cleric() {
        baseAttackBonus = 0;
        fortSave = 2;
        refSave = 0;
        WillSave = 2;
    }


    @Override
    public String toString() {
        return "I am a Cleric";
    }
}
