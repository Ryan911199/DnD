package Game.Helpers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu<T> {
    public Scanner scan = new Scanner(System.in);

    public int menu(T[] input) {
        int length = input.length;
        int ans = -1;
        for (int x = 0; x < length; x++) {
            System.out.println((x + 1) + ". " + input[x]);
        }
        while (ans <= 0 || ans > length) {
            System.out.println("Please enter a number between 1 and " + length);

            try {
                ans = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You did not enter a number matching the required parameters.");
            }
            scan.nextLine();
        }
        return ans;
    }
}
