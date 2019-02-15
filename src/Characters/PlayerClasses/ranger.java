package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class ranger extends playerCharacter {
    public ranger() {
        hitPointsPerLevel = 0; //TODO implement ranger stats
        magicPointsPerLevel = 0;
    }
    @Override
    public String toString() {
        return "I am a Ranger";
    }
}
