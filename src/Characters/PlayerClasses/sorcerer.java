package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class sorcerer extends playerCharacter {
    public sorcerer() {
        hitPointsPerLevel = 0; //TODO implement sorcerer stats
        magicPointsPerLevel = 0;
    }

    @Override
    public void raceAjustment() {

    }

    @Override
    public String toString() {
        return "I am a Sorcerer";
    }
}
