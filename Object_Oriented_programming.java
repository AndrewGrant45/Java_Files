package intermediate_Level;
public class Object_Oriented_programming {	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		int acc = 1234;
		String name = "Andrew";
		double bal = 5000;
		
		account.setAccountNum(acc);
		account.setAccountHolder(name);
		account.setbalance(bal);
		
		account.deposit(2000);
		account.withdraw(1000);
		account.checkBalance();
	}
}
