package Characters.Classes;

import Characters.Character;
import Characters.Race;
import Items.item;

public class druid extends Character {
    public druid(String Name,int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, Race PlayerRace){
        name = Name;
        hitPointsPerLevel = 0; //TODO implement druid stats
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
