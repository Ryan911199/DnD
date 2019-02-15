package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class cleric extends playerCharacter {
    public cleric() {
        hitPointsPerLevel = 0; //TODO implement cleric stats
        magicPointsPerLevel = 0;
    }
    @Override
    public String toString() {
        return "I am a Cleric";
    }
}
