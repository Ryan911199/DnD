package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class paladin extends playerCharacter {
    public paladin() {
        hitPointsPerLevel = 0; //TODO implement paladin stats
        magicPointsPerLevel = 0;
    }
    @Override
    public String toString() {
        return "I am a Paladin";
    }
}
