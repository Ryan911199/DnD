package Game.Helpers;

import java.util.Scanner;

public class GetnumAns {
    private Scanner scan = new Scanner(System.in);
    private YesOrNo Yes = new YesOrNo();
    private int ans;

    public int getNum() {
        try {
            String temp = scan.nextLine();
            if (temp.equalsIgnoreCase("quit")) {
                Quit();
            }
            ans = Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            System.out.println("You did not enter a number matching the required parameters.");
        }
        return ans;
    }

    private void Quit() {
        System.out.println("Are you sure you want to quit?");
        if (Yes.check()) {
            System.out.println("Thanks for playing our game. Feel free to come back and play again");
            System.exit(0);
        }
    }
}
