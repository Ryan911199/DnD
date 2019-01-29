package Game;

import Characters.*;
import Items.*;

public class Main {
    public static void main(String[] args)
    {
        Dice dice = new Dice();
        Menu menu = new Menu();
        playerCharacter Player;
        createCharacter createPlayer = new createCharacter();
        Player = createPlayer.newPlayer();
    }

}
