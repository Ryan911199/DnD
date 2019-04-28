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
        System.out.println("You witness a goblin with a knife to the throat of a woman");
        System.out.println();
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
