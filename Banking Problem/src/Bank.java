public abstract class Bank {
	String accountName;
	Double balance;
	
	 public Bank(String accountName, double balance) {
	        this.accountName = accountName;
	        this.balance = balance;
	    }
	
	   public abstract void deposit(double amount);
	   public abstract double withdraw(double amount);
	   public abstract double getBalance();
}
