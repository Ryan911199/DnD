package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class wizard extends playerCharacter {
    public wizard() {
        hitPointsPerLevel = 0; //TODO implement wizard stats
        magicPointsPerLevel = 0;
    }

    @Override
    public void raceAjustment() {
        if (Race == Characters.Race.elf){
            Dexterity = Dexterity + 2;
            Constitution = Constitution - 2;
        }

    }

    @Override
    public String toString() {
        return "I am a Wizard";
    }
}
