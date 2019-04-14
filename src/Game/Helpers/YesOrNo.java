package Game.Helpers;

import java.util.Scanner;

public class YesOrNo {
    private String  ans;
    private Scanner scan = new Scanner(System.in);

    public boolean check(){
        ans = scan.nextLine();
        while (!ans.equalsIgnoreCase("Yes") && !ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("no") && !ans.equalsIgnoreCase("n")){
            System.out.println("Please Answer Yes or No");
            ans = scan.nextLine();
        }
        if (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")){
            return true;
        }
        else {return false;}
    }
}
