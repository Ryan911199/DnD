package Characters.Classes;

import Characters.playerCharacter;
import Characters.Race;

public class ranger extends playerCharacter {
    public ranger(String Name,int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, Race PlayerRace){
        name = Name;
        hitPointsPerLevel = 0; //TODO implement ranger stats
        magicPointsPerLevel = 0;
        Strength = strength;
        Dexterity = dexterity;
        Constitution = constitution;
        Intelligence = intelligence;
        Wisdom = wisdom;
        Charisma = charisma;
        playerRace = PlayerRace;
    }
}
