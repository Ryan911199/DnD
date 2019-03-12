package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class ranger extends playerCharacter {
    public ranger() {
        baseAttackBonus = 1;
        fortSave = 2;
        refSave = 2;
        WillSave = 0;
    }


    @Override
    public String toString() {
        return "I am a Ranger";
    }
}
