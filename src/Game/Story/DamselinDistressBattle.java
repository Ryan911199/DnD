package Game.Story;

import Characters.Enemys.Enemy;
import Characters.Enemys.Goblin;
import Characters.Race;
import Characters.playerCharacter;
import Game.Graphics.*;
import Items.Armor.ArmorTypes.chestplate.lightLeatherChestplate;
import Items.Food.Bread;
import Items.Weapons.Arrow;
import Items.Weapons.Bow;
import Items.Weapons.Sword;

import java.util.Scanner;

public class DamselinDistressBattle extends StoryNode
{

    @Override
    public void Story(playerCharacter Player) {
        System.out.println("You dash towards the source of the screaming, down into a chasm of granite");
        System.out.println("You stumble down the stairs of rock to find the woman");
        System.out.println("You witness a goblin with a knife to the throat of the screaming woman");
        System.out.println("'help me' she cried. 'Quiet you wench' beckoned the Goblin");
        System.out.println("'You killed my father you scoundrel' the goblin wailed 'and now you shall pay'");
        //initiate frederick the 2nd batttle, a stronger version of Fred
        //if player wins they receive kiss of the damsel which grants the player with a health boost
        System.out.println("'Thank you' cried the Damsel 'Here is a token of my graditude'");
        //insert kiss here
        System.out.println("The damsel plants a kiss on your cheek and continue on her merrily way ");
    }

    @Override
    void giveItems(playerCharacter Player) {

    }

    @Override
    public boolean hasEnemy() {
        return false;
    }

    @Override
    public boolean mustFight() {
        return false;
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
