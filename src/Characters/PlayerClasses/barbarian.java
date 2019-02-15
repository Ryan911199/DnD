package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class barbarian extends playerCharacter {
    public barbarian() {
        hitPointsPerLevel = 0; //TODO implement barbarian stats
        magicPointsPerLevel = 0;
    }

    @Override
    public String toString() {
        return "I am a Barbarian";
    }
}
