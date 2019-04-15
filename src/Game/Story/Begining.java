package Game.Story;

import Characters.Enemys.Enemy;
import Characters.Enemys.Goblin;
import Characters.Race;
import Characters.playerCharacter;
import Items.Weapons.Arrow;
import Items.Weapons.Bow;
import Items.Weapons.Sword;

import java.util.Scanner;

public class Begining extends StoryNode{
    private Scanner scan = new Scanner(System.in);

    @Override
    public boolean hasEnemy() {
        return true;
    }

    @Override
    public Enemy getEnemy() {
        Enemy enemy = new Goblin("Fred the Goblin");
        enemy.Setup("Fred the Goblin", 13, 13, 13, 13, 13, 13, 13, Race.halfelf);
        return enemy;
    }

    public void Story(playerCharacter Player) {
        System.out.println("You walk in to a room and there is your grandfather laying on the ground");
        System.out.println("He has been killed by (insert something)");
        System.out.println("in his had he is holding a note (E)");
        scan.nextLine();
        System.out.println("You bend down pick up the note and read it");
        Note();
        scan.nextLine();
        System.out.println(Player.name + " Was given a New Bow");
        System.out.println(Player.name + " Was given a 3 Arrows");
        System.out.println(Player.name + " Was given a New Sword" );
        giveItems(Player);
    }

    void giveItems(playerCharacter Player){
        Player.addInventory(new Bow());
        Player.addInventory(new Arrow());
        Player.addInventory(new Arrow());
        Player.addInventory(new Arrow());
        Player.addInventory(new Sword());
    }

    private void Note(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|                             Note                              |");
        System.out.println("|     d                                                         |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                                                               |");
        System.out.println("|                              (E)                              |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
