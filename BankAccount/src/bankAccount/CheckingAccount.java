package bankAccount;

public class CheckingAccount extends BankAccount {

	private int trancactiontsCounter;
	
	public CheckingAccount(double initialAccount) {
		super(initialAccount);
		trancactiontsCounter = 0;
	}
	
	public void deductFees() {
		balance = balance - 0.5; 
	}
	//Επαναορισμός / Επικάλυψη μεθόδου
	//Override
	public void deposit(double amount) {
		trancactiontsCounter++;
		super.deposit(amount);
		
		if(trancactiontsCounter > 3) 
			deductFees();
		
	}
	public void printDate() {
		System.out.println("Checking  Account");
		System.out.println("Balance: "+balance+ " free limit:3 trans.");
	}
}
