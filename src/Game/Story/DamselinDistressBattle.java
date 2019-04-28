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

    public DamselinDistressBattle(StoryList story) {
        super(story);
    }

    @Override
    public void Story(playerCharacter Player) {
        System.out.println("You dash towards the source of the screaming, down into a chasm of granite");
        System.out.println("You stumble down the stairs of rock to find the woman");
        System.out.println("You witness a goblin with a knife to the throat of the screaming woman");
        System.out.println("'help me' she cried. 'Quiet you wench' beckoned the Goblin");
        System.out.println("THe goblin turns to you and says 'You killed my father you scoundrel' the goblin wailed 'and now you shall pay'");
        //initiate frederick the 2nd batttle, a stronger version of Fred
        Story.add(new BattleoftheKeeperoftheInnerCrypt(Story));

    }

    void giveItems(playerCharacter Player) {

    }

    public boolean hasEnemy() {
        return true;
    }

    public boolean mustFight() {
        return true;
    }

    public boolean fightNow() {
        return true;
    }

    public Enemy getEnemy() {
        Enemy enemy = new Goblin(null, new Sword());
        enemy.Inventory.Add(new Bread());
        enemy.Setup("Fred the Goblin's Son", 40, 13,
                13, 13, 2, 13, 13, Race.halfelf);
        return enemy;
    }//TODO make enemy
}
