package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class sorcerer extends playerCharacter {
    public sorcerer() {
        baseAttackBonus = 0;
        fortSave = 0;
        refSave = 0;
        WillSave = 2;
    }

    @Override
    public String toString() {
        return "I am a Sorcerer";
    }
}
