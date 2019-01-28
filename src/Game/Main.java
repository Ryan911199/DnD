package Game;

import Characters.Character;
import Items.*;

public class Main {
    public static void main(String[] args)
    {
        Dice dice = new Dice();
        createCharacter creatPlayer = new createCharacter();
        Character Player = creatPlayer.newPlayer();
    }
}
