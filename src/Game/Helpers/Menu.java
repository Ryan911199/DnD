package Game.Helpers;

import Game.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu <T>{
    public Scanner scan = new Scanner(System.in);
    public int menu(T[] input) {
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
//    public int menu(ArrayList input) {
//        int length = input.size();
//        int ans = -1;
//        for (int x = 0; x < length; x++) {
//            System.out.println((x + 3) + ". " + input.get(x));
//        }
//        while (ans <= 0 || ans > length)  {
//            System.out.println("Please enter a number between 3 and " + length);
//            ans = scan.nextInt();
//            scan.nextLine();
//        }
//        return ans;
//    }
}
