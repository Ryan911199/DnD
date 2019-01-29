package Game;

import Characters.Classes.*;
import Items.*;

public class Main {
    public static void main(String[] args)
    {
        Dice dice = new Dice();
        Menu menu = new Menu();
        Character Player;
        createCharacter creatPlayer = new createCharacter();
        String[] classes = {"barbarian", "bard", "cleric", "druid", "fighter", "monk", "paladin", "ranger", "rogue", "sorcerer", "wizard"};
        switch (menu.menu(classes)){
            case 1:
                barbarian Player1 = new barbarian(creatPlayer.name, creatPlayer.Strength, creatPlayer.Dexterity, creatPlayer.Constitution, creatPlayer.Intelligence, creatPlayer.Wisdom, creatPlayer.Charisma, creatPlayer.playerRace);
                break;
            case 2:
                bard Player2 = new bard(creatPlayer.name, creatPlayer.Strength, creatPlayer.Dexterity, creatPlayer.Constitution, creatPlayer.Intelligence, creatPlayer.Wisdom, creatPlayer.Charisma, creatPlayer.playerRace);
                break;
            case 3:
                cleric Player3 = new cleric(creatPlayer.name, creatPlayer.Strength, creatPlayer.Dexterity, creatPlayer.Constitution, creatPlayer.Intelligence, creatPlayer.Wisdom, creatPlayer.Charisma, creatPlayer.playerRace);
                break;
            case 4:
                druid Player4 = new druid(creatPlayer.name, creatPlayer.Strength, creatPlayer.Dexterity, creatPlayer.Constitution, creatPlayer.Intelligence, creatPlayer.Wisdom, creatPlayer.Charisma, creatPlayer.playerRace);
                break;
            case 5:
                fighter Player5 = new fighter(creatPlayer.name, creatPlayer.Strength, creatPlayer.Dexterity, creatPlayer.Constitution, creatPlayer.Intelligence, creatPlayer.Wisdom, creatPlayer.Charisma, creatPlayer.playerRace);
                break;
            case 6:
                monk Player6 = new monk(creatPlayer.name, creatPlayer.Strength, creatPlayer.Dexterity, creatPlayer.Constitution, creatPlayer.Intelligence, creatPlayer.Wisdom, creatPlayer.Charisma, creatPlayer.playerRace);
                break;
            case 7:
                paladin Player7 = new paladin(creatPlayer.name, creatPlayer.Strength, creatPlayer.Dexterity, creatPlayer.Constitution, creatPlayer.Intelligence, creatPlayer.Wisdom, creatPlayer.Charisma, creatPlayer.playerRace);
                break;
            case 8:
                ranger Player8 = new ranger(creatPlayer.name, creatPlayer.Strength, creatPlayer.Dexterity, creatPlayer.Constitution, creatPlayer.Intelligence, creatPlayer.Wisdom, creatPlayer.Charisma, creatPlayer.playerRace);
                break;
            case 9:
                rogue Player9 = new rogue(creatPlayer.name, creatPlayer.Strength, creatPlayer.Dexterity, creatPlayer.Constitution, creatPlayer.Intelligence, creatPlayer.Wisdom, creatPlayer.Charisma, creatPlayer.playerRace);
                break;
            case 10:
                sorcerer Player10 = new sorcerer(creatPlayer.name, creatPlayer.Strength, creatPlayer.Dexterity, creatPlayer.Constitution, creatPlayer.Intelligence, creatPlayer.Wisdom, creatPlayer.Charisma, creatPlayer.playerRace);
                break;
            case 11:
                wizard Player11 = new wizard(creatPlayer.name, creatPlayer.Strength, creatPlayer.Dexterity, creatPlayer.Constitution, creatPlayer.Intelligence, creatPlayer.Wisdom, creatPlayer.Charisma, creatPlayer.playerRace);
                break;
            default:
                System.out.println("something went wrong");
                break;
        }
        Player = 
    }

}
