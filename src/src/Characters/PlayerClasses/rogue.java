package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class rogue extends playerCharacter {
    public rogue() {
        baseAttackBonus = 0;
        fortSave = 0;
        refSave = 2;
        WillSave = 0;
    }


    @Override
    public String toString() {
        return "I am a Rogue";
    }
}
