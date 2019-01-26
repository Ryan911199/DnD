package Test;

import java.util.Scanner;

public class BankPatron {
	private String FirstName;
	private String LastName;
	private int Salary;
	private double CashonHand;
	private BankAccount Acc1;
	private BankAccount Acc2;
	public BankPatron() {
		FirstName = "";
		LastName = "";
		Salary = 0;
		CashonHand = 0.0;
		Acc1 = null;
		Acc2 = null;
	}
	public BankPatron(String first, String last, int income, double cash) {
		FirstName = first;
		LastName = last;
		Salary = income;
		CashonHand = cash;
		Acc1 = null;
		Acc2 = null;
	}
	public String getPatronFullName() {
		return FirstName + " " + LastName;
	}
	public int getSalary() {
		return Salary;
	}
	public double getCash() {
		return CashonHand;
	}
	public void payCheck() {
		double Sal = getSalary();
		double check = Sal / 24;
		CashonHand = CashonHand + check;
	}
	public BankAccount getAccount(int A) {
		if (A == 1 && Acc1 != null) {
			return Acc1;
		} else if (A == 2 && Acc2 != null) {
			return Acc2;
		} else {
			return null;
		}
	}
	public boolean deposit(double A, int B) {
		BankAccount C;
		if (B == 1 && Acc1 != null) {
			C = Acc1;
		} else if (B == 2 && Acc2 != null) {
			C = Acc2;
		} else {
			System.out.println("Please enter a valid account");
			return false;
		}
		if (A > 0) {
			if (A <= CashonHand) {
				C.deposit(A);
				CashonHand -= A;
				System.out.println("Deposit successful");
				return true;
			} else {
				System.out.println("Please enter an amount less than or equal to the amount of money you have on had");
				return false;
			}
		} else {
			System.out.println("Please enter a positive number");
			return false;
		}
	}
	public boolean Withdraw(double A, int B) {
		BankAccount C;
		if (B == 1 && Acc1 != null) {
			C = Acc1;
		} else if (B == 2 && Acc2 != null) {
			C = Acc2;
		} else {
			System.out.println("Please enter a valid account");
			return false;
		}
		if (A > 0) {
			if (C.withdraw(A)) {
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("Please enter a positive number");
			return false;
		}
	}
	public boolean addAccount() {
		if (Acc1 == null || Acc2 == null) {
			AccountType A = null;
			Scanner scan = new Scanner(System.in);
			System.out.println("What account type would you like?");
			System.out.println("a. Checking");
			System.out.println("b. Savings");
			System.out.println("c. CD");
			System.out.println("d. MoneyMarket");
			System.out.println("e. IRA");
			String type = scan.nextLine();
			switch (type) {
				case "a":
					A = AccountType.Checking;
					break;
				case "b":
					A = AccountType.Savings;
					break;
				case "c":
					A = AccountType.CD;
					break;
				case "d":
					A = AccountType.MoneyMarket;
					break;
				case "e":
					A = AccountType.IRA;
					break;
				default:
					System.out.println("Please enter a lower case letter a-e");
					return false;
			}
			System.out.println("Please input the interest rate");
			int rate = scan.nextInt();
			scan.nextLine();
			if (Acc1 == null) {
				Acc1 = new BankAccount(FirstName, LastName, rate, A);
				System.out.println("Account successfully added!");
				return true;
			} else if (Acc2 == null) {
				Acc2 = new BankAccount(FirstName, LastName, rate, A);
				System.out.println("Account successfully added!");
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("You can only have 2 accounts");
			return false;
		}
	}
	public boolean removeAccount(int A) {
		if (A == 1 && Acc1 != null) {
			Acc1 = null;
			return true;
		} else if (A == 2 && Acc2 != null) {
			Acc2 = null;
			return true;
		} else {
			System.out.println("you have no account to remove");
			return false;
		}
	}
	public void patronInfo() {
		System.out.print(getPatronFullName());
		if (Acc1 != null || Acc2 != null) {
			if (Acc1 != null) {
				System.out.print(" " + Acc1.getType().name());
				System.out.print(" " + Acc1.getAccountNum());
				System.out.print(" " + Acc1.checkBalance() + " " + Acc1.getRate());
				System.out.println("");
			}
			if (Acc2 != null) {
				System.out.print(Acc2.getType().name());
				System.out.print(" " + Acc2.getAccountNum());
				System.out.print(" Balance: " + Acc2.checkBalance() + " Interest Rate: " + Acc2.getRate());
				System.out.println("");
			}
		} else {
			System.out.println("");
		}
	}
}
