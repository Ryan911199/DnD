package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class bard extends playerCharacter {
    public bard() {
        hitPointsPerLevel = 0; //TODO implement bard stats
        magicPointsPerLevel = 0;
    }

    @Override
    public String toString() {
        return "I am a Bard";
    }
}
