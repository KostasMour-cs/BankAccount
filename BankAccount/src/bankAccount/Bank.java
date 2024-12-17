package bankAccount;
import java.util.*;

public class Bank {

	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public void addAccount(BankAccount account) {
		accounts.add(account);
	}
	
	public void printAllData() {
		for(int i=0;i<accounts.size();i++) {
			BankAccount account = accounts.get(i);
			account.printData();
		}
	}
	
}
