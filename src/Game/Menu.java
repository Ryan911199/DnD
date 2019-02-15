package Game;

import java.util.Scanner;

public class Menu <T>{
    public int menu(T[] input) {
        Scanner scan = new Scanner(System.in);
        int length = input.length;
        int ans = -1;
        for (int x = 0; x < length; x++) {
            System.out.println((x + 1) + ". " + input[x]);
        }
        while (ans <= 0 || ans > length)  {
            System.out.println("Please enter a number between 1 and " + length);
            ans = scan.nextInt();
            scan.nextLine();
        }
        return ans;
    }
}
