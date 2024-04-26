package intermediate_Level;
public class BankAccount {
	private int accountNumber;
	private String accountHolderName; 
	private double balance;
	
	public void bankAccount (int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance; 
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successful. Current balance: " + balance);
	}
	
	public void withdraw(double amount) {
		if (balance < amount ) {
			System.out.println("Insuffienct balance. Withdrawal failed.");
		}else {
			balance -= amount;
			System.out.println("Withdrawal was successful. Current balance:" + amount);
		}
	}
	
	 public void checkBalance() {
	        System.out.println("Current balance: " + balance);
	    }
	 
	 public int getAccountNumber() {
	        return accountNumber;
	    }
	 
	 public String getAccountHolderName() {
	        return accountHolderName;
	    }

	 public double getBalance() {
	        return balance;
	    }
	    
	  public void setAccountNum (int Num) {
		  this.accountNumber = Num ;
	  }
	  public void setAccountHolder ( String name) {
		  this.accountHolderName = name;
	  }
	  public void setbalance(double Bal) {
		  this.balance = Bal;
	  }
	  
}
