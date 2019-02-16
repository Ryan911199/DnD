package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class fighter extends playerCharacter {
    public fighter() {
        hitPointsPerLevel = 0; //TODO implement fighter stats
        magicPointsPerLevel = 0;
    }

    @Override
    public void raceAjustment() {
            if (Race == Characters.Race.dwarf){
                Constitution = Constitution + 2;
                Charisma = Charisma - 2;
            }
    }

    @Override
    public String toString() {
        return "I am a Fighter";
    }
}
