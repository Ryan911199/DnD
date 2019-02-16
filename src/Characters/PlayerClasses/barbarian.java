package Characters.PlayerClasses;

import Characters.playerCharacter;
import Characters.Race;

public class barbarian extends playerCharacter {
    public barbarian() {
        hitPointsPerLevel = 0; //TODO implement barbarian stats
        magicPointsPerLevel = 0;
    }

    @Override
    public void raceAjustment() {
        if (Race == Characters.Race.halforc){
            Intelligence = Intelligence - 2;
            Strength = Strength + 2;
            Charisma = Charisma - 2;
        }
    }

    @Override
    public String toString() {
        return "I am a Barbarian";
    }
}
