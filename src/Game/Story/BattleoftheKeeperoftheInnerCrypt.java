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

    @Override
    public void Story(playerCharacter Player) {
        System.out.println("You approach the cave that is home the Demogorgon");
        System.out.println("Skeletons and remains of other adventurers are next to your every step as you venture down");
        System.out.println("yeet");
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
