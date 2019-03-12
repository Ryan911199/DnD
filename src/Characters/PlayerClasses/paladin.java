package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class paladin extends playerCharacter {
    public paladin() {
        baseAttackBonus = 1;
        fortSave = 2;
        refSave = 0;
        WillSave = 0;
    }


    @Override
    public String toString() {
        return "I am a Paladin";
    }
}
