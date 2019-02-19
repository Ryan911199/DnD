package Test;

import java.util.Scanner;

public class LiList {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        CSEList<Integer> list = new CSEList<Integer>();

        list.add(7);
        list.add(3);
        list.add(7);
        list.add(32);
        list.add(37);

        Integer test = new Integer(6);
        test.intValue();

        System.out.println(list);
        list.remove(new Integer(7));
        System.out.println(list);

        scan.close();
    }
}
