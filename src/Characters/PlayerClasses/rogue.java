package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class rogue extends playerCharacter {
    public rogue() {
        hitPointsPerLevel = 0; //TODO implement rogue stats
        magicPointsPerLevel = 0;
    }
    @Override
    public String toString() {
        return "I am a Rogue";
    }
}