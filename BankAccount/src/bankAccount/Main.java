package bankAccount;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BankAccount BA= new BankAccount(1000);
		SavingsAccount SA = new SavingsAccount(1000,0.2);
		CheckingAccount CA = new CheckingAccount(500);
		
		Bank bank = new Bank();
		bank.addAccount(BA);
		bank.addAccount(SA);
		bank.addAccount(CA);
		
		bank.printAllData();
	}

}
