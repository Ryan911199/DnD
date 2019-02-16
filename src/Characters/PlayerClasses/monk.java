package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class monk extends playerCharacter {
    public monk() {
        hitPointsPerLevel = 0; //TODO implement monk stats
        magicPointsPerLevel = 0;
    }

    @Override
    public void raceAjustment() {

    }

    @Override
    public String toString() {
        return "I am a Monk";
    }
}
