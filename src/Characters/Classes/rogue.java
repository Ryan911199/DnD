package Characters.Classes;

import Characters.playerCharacter;
import Characters.Race;

public class rogue extends playerCharacter {
    public rogue(String Name,int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, Race PlayerRace){
        name = Name;
        hitPointsPerLevel = 0; //TODO implement rogue stats
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
