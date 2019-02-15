package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class druid extends playerCharacter {
    public druid() {
        hitPointsPerLevel = 0; //TODO implement druid stats
        magicPointsPerLevel = 0;
    }
    @Override
    public String toString() {
        return "I am a Druid";
    }
}
