package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class monk extends playerCharacter {
    public monk() {
        baseAttackBonus = 0;
        fortSave = 2;
        refSave = 2;
        WillSave = 2;
    }


    @Override
    public String toString() {
        return "I am a Monk";
    }
}
