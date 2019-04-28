package Game.Story;

import Characters.Enemys.Enemy;
import Characters.Enemys.Goblin;
import Characters.Race;
import Characters.playerCharacter;
import Game.Graphics.*;
import Game.Helpers.YesOrNo;
import Items.Armor.ArmorTypes.chestplate.lightLeatherChestplate;
import Items.Food.Bread;
import Items.Weapons.Arrow;
import Items.Weapons.Bow;
import Items.Weapons.Sword;

import java.util.Scanner;


public class BattleoftheKeeperoftheInnerCrypt extends StoryNode
{
    private Scanner scan = new Scanner(System.in);

    public BattleoftheKeeperoftheInnerCrypt(StoryList story) {
        super(story);
    }

    @Override
    public void Story(playerCharacter Player) {
        System.out.println("You approach the cave that is home the Demogorgon");
        System.out.println("Skeletons and remains of other adventurers are next to your every step as you venture down");
        System.out.println(" ---.----.__..----.----| _|_||___||___||___||___||___||___||_|_ |\n" +
                "    |        |    |    | -.-..---..---..---..---..---..---..-.- |--.-\n" +
                " ---'--.-----'----'--.-|  | ||   ||   ||   ||   ||   ||   || |  | `|\n" +
                "       |:           (| |  | ||   ||   ||   ||   ||   ||   || |  |--'-\n" +
                "       |:.           | | _|_||___||___||___||___||___||___||_|_ |\n" +
                " ------'----.-.,----.'-| -.-..---..---..---..---..---..---..-.- |-.--\n" +
                "        ,/) |       |  |  | ||   ||   ||   ||   ||   ||   || |  | |`\n" +
                " ----.---8--'--.----'--|  | ||   ||   ||   ||   ||   ||   || |  | |\n" +
                "     |   8     |:      | _|_||___||___||___||___||___||___||_|_ |-'--\n" +
                "     | ,)//    |:.     | -.-..---..---..---..---..---..---..-.- |:.\n" +
                " ----'-`=;'--.-'-.----.|  | ||   ||   ||   ||   ||   ||   || |  |--.-\n" +
                "       //   /_ _( \\    |  | ||   ||   ||   ||   ||   ||   || |  | /|\n" +
                " ---.-//----)/\\,'_/----| _|_||___||___||___||___||___||___||_|_ | `|\n" +
                "    |/|     `;=.(      | -.-..---..---..---..---..---..---..-.- |--'-\n" +
                " (  |`.`.   |`,-/      |,-'-||---||---||---||---||---||---||-'-.|\n" +
                " -`-'-.`.`-.';'=`.-..--'-.--------.-------------.--.-------.----'--.-\n" +
                " -.-----'--;`.}{,`.||----,-'--------.------'---.--------,'--.,-------\n" +
                "  |:     ,'/.`..'_(/(    |:         |          |             \\\n" +
                "  |:.  ,',' |`--`.('))   |:.        |          |             |:\n" +
                " -'--,' <.._|__,. >`,----'----------'--------.,'-------------'----SSt\n" +
                "            `'");
        System.out.println("the only thing to light your path are the blood of other  past warriors illuminated by arrant fire cast by  fallen wizards. (E)");
        scan.nextLine();
        System.out.println("You finally arrive an the Doors of Death, the mythical lair of the Demogorgon");
        System.out.println("The crypt is guarded by the fabled Keeper of the Inner Crypt.");
        System.out.println("An undead warrior who's sole purpose is to be the physical barrier from the inner crypt to the outside world");
        System.out.println("You lift up your sword and ready yourself for the attack. (E)");
        scan.nextLine();
        //keeper battle
        Story.add(new BattleoftheDemogorgon(Story));
    }

    @Override
    void giveItems(playerCharacter Player) {

    }

    @Override
    public boolean hasEnemy() {
        return true;
    }

    @Override
    public boolean mustFight() {
        return true;
    }

    @Override
    public boolean fightNow() {
        return false;
    }

    @Override
    public Enemy getEnemy() {
        return null;
    }
}
