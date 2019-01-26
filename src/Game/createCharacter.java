package Game;


public class createCharacter {
    public  createCharacter(){
        Menu menu = new Menu();
        String[] classes = {"barbarian", "bard", "cleric", "druid", "fighter", "monk", "paladin", "ranger", "rogue", "sorcerer", "wizard"};
        String[] races = {"human", "dwarf", "elf", "gnome", "half-lings", "half-elf", "half-orc"};
        System.out.println("Hello and welcome to (insert game name). This is a spin off of Dungeons and dragons focused on combat with basic AI enemies");
        System.out.println();
        System.out.println("To begin please roll the dice to determine your ability scores" ); //TODO tell player what ability scores do
        System.out.println(menu.menu(classes));
    }

    public int[] abilityRoll(){
        Dice die = new Dice();
        int[] roll = new int[3];
        for (int i = 0; i < 5; i++)
    }


}
