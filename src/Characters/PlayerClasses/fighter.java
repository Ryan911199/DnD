package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class fighter extends playerCharacter {
    public fighter() {
        baseAttackBonus = 1;
        fortSave = 2;
        refSave = 0;
        WillSave = 0;
    }

    @Override
    public String toString() {
        return "I am a Fighter";
    }
}
