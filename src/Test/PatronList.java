package Test;

import java.util.Scanner;

public class PatronList {
	private BankPatron[] patronList = new BankPatron[5];
	public PatronList() {
		patronList[0] = null;
		patronList[1] = null;
		patronList[2] = null;
		patronList[3] = null;
		patronList[4] = null;
	}
	public boolean addPatron() {
		if (patronList[0] == null || patronList[1] == null || patronList[2] == null || patronList[3] == null || patronList[4] == null) {
			Scanner scan = new Scanner(System.in);
			System.out.println("What is the patrons first name?");
			String first = scan.nextLine();
			System.out.println("What is the patrons last name?");
			String last = scan.nextLine();
			System.out.println("What is the salary of the parton?");
			int sal = scan.nextInt();
			System.out.println("How much money does the parton have in cash?");
			double cash = scan.nextDouble();
			int i = 0;
			while (i <= 4) {
				if (patronList[i] == null) {
					patronList[i] = new BankPatron(first, last, sal, cash);
					System.out.println("welcome to the bank " + first + " " + last);
					return true;
				}
				i++;
			}
			return false;
		} else {
			System.out.println("The line at the bank is full");
			return false;
		}
	}
	public BankPatron getPatron(int A) {
		if (A <= 5 && A > 0) {
			A--;
			return patronList[A];
		} else {
			return null;
		}
	}
	public BankPatron getPatron(String Name) {
		int i = 0;
		while (i <= 4) {
			if (patronList[i] != null) {
				if (Name.equals(patronList[i].getPatronFullName())) {
					return patronList[i];
				}
			}
			i++;
		}
		System.out.println("this patron does not exist ");
		return null;
	}
	public void print() {
		boolean run = false;
		System.out.println("Patrons currently at the bank: ");
		int i = 0;
		while (i <= 4) {
			if (patronList[i] != null) {
				patronList[i].patronInfo();
				run = true;
			}
			i++;
		}
		if (!run) {
			System.out.println("None");
		}
	}
	public void removePatron(String Name) {
		int i = 0;
		while (i <= 4) {
			if (patronList[i] != null) {
				if (Name.equals(patronList[i].getPatronFullName())) {
					patronList[i] = null;
					i = 10;
				}
			}
			i++;
		}
	}
}
