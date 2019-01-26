package Test;

import java.util.Scanner;

public class Assinment6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ans = "Z";
		PatronList List = new PatronList();
		while (!ans.equals("E")) {
//			ans = menu();
			switch (ans) {
				case "a":
					List.print();
					break;
				case "b":
					List.addPatron();
					break;
				case "c":
					System.out.println("Please type the full name of the patron you would like to remove");
					String rPatron = scan.nextLine();
					if (List.getPatron(rPatron) != null) {
						System.out.println("Patron " + rPatron + " has left the bank");
						List.removePatron(rPatron);
					}
					break;
				case "d":
					System.out.println("what is the full name of the patron?");
					String Fullname = scan.nextLine();
					BankPatron X = List.getPatron(Fullname);
					if (X == null) {
						System.out.println("That patron does not exist");
						break;
					} else {
						patronMenu(X);
					}
					break;
				case "e":
					System.out.println("Thanks for coming");
					System.exit(0);
					break;
				default:
					break;
			}
		}
	}

//	public static String menu() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("type a letter to make a selection");
//		System.out.println("a. List Patrons");
//		System.out.println("b. Add New Patron");
//		System.out.println("c. Remove Patron");
//		System.out.println("d. Patron Specific Actions");
//		System.out.println("e. Quit");
//		String ans = "z";
//		while (!ans.equals("a") && !ans.equals("b") && !ans.equals("c") && !ans.equals("d") && !ans.equals("e")) {
//			System.out.println("Please enter one letter a-e with out spaces and lowercase");
//			ans = scan.nextLine();
//		}
//		return ans;
//	}

	public static void patronMenu(BankPatron A) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("What would you like to do " + A.getPatronFullName());
		System.out.println(" ");
		System.out.println("type a letter to make a selection");
		System.out.println("a. Add New Account");
		System.out.println("b. Close Account");
		System.out.println("c. Get Paid");
		System.out.println("d. Apply Interest to Accounts");
		System.out.println("e. Make Deposit");
		System.out.println("f. Make Withdraw");
		System.out.println("g. Return to Game.Main Menu");
		String ans = "z";
		while (!ans.equals("a") && !ans.equals("b") && !ans.equals("c") && !ans.equals("d") && !ans.equals("e") && !ans.equals("f") && !ans.equals("g")) {
			System.out.println("Please enter one letter a-e with out spaces and lowercase");
			ans = scan.nextLine();
		}
		switch (ans) {
			case "a":
				A.addAccount();
				patronMenu(A);
				break;
			case "b":
				System.out.println("please enter an account to remove (1 Or 2)");
				int i = scan.nextInt();
				A.removeAccount(i);
				patronMenu(A);
				break;
			case "c":
				A.payCheck();
				patronMenu(A);
				break;
			case "d":
				BankAccount A1 = A.getAccount(1);
				BankAccount A2 = A.getAccount(2);
				if (A1 != null) {A1.applyInterest();}
				if (A2 != null) {A2.applyInterest();}
				patronMenu(A);
				break;
			case "e":
				System.out.println("please enter the account (1 or 2)");
				int Y = scan.nextInt();
				System.out.println("please enter the amount you want to deposit");
				double X = scan.nextDouble();
				A.deposit(X, Y);
				patronMenu(A);
				break;
			case "f":
				System.out.println("please enter the amount you want to withdraw");
				double X2 = scan.nextDouble();
				System.out.println("please enter the account (1 or 2)");
				int Y3 = scan.nextInt();
				A.Withdraw(X2, Y3);
				patronMenu(A);
				break;
			case "g":
				break;
			default:
				System.out.println("invalid selection");
				patronMenu(A);
				break;
		}
	}
}
