package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class bard extends playerCharacter {
    public bard() {
        baseAttackBonus = 0;
        fortSave = 0;
        refSave = 2;
        WillSave = 2;
    }

    @Override
    public String toString() {
        return "I am a Bard";
    }
}
