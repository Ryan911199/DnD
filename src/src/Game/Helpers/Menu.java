package Game.Helpers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu<T> {
    private Scanner scan = new Scanner(System.in);
    private YesOrNo Yes = new YesOrNo();

    public int menu(T[] input) {
        int length = input.length;
        int ans = -1;
        for (int x = 0; x < length; x++) {
            System.out.println((x + 1) + ". " + input[x]);
        }
        while (ans <= 0 || ans > length) {
            System.out.println("Please enter a number between 1 and " + length);
            try {
                String temp = scan.nextLine();
                if(temp.equalsIgnoreCase("quit")){
                    Quit();
                }
                ans = Integer.parseInt(temp);
            } catch (NumberFormatException e) {
                System.out.println("You did not enter a number matching the required parameters.");
            }
        }
        return ans;
    }
    private void Quit(){
        System.out.println("Are you sure you want to quit?");
        if (Yes.check()){
            System.out.println("Thanks for playing our game. Feel free to come back and play again");
            System.exit(0);
        }
    }
}
