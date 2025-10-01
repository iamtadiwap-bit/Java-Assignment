import java.io.FileWriter;
import java.io.IOException;

public class Account extends Bank {
	
    public Account(String accountName, double balance) {
        super(accountName, balance);
    }
	
    @Override
    public void deposit(double amt){
		if(amt<=0) {
			System.out.println("Cannot deposit: Invalid amount");
			return;
		}
		
		String filename = "Bank.txt";
		String rec = "\nTransaction deposit:"
				+ "\nOld balance = " + balance
				+ "\nDeposit amount = " + amt
				+ "\nNew balance = "+ (amt+balance);
		
		try {
			
		    FileWriter fw = new FileWriter(filename,true);
		    fw.write(rec);
		   	fw.close();
		   	
		   	balance = balance + amt;
		   	
		} catch (IOException e) {		
			System.out.println("Cannot deposit: Transaction Recording Error");
			return;
		}
		System.out.println("Successful deposit: New balance: " + balance);	
		
		return;
	}
    
	@Override
	public double withdraw(double amt){
		if(balance<amt) {
			System.out.println("Cannot withdraw: Insufficient funds");
			return 0.00;
		}
		
		String filename = "Bank.txt";
		String rec = "\nTransaction withdraw:"
				+ "\nOld balance = " + balance
				+ "\nWithdraw amount = " + amt
				+ "\nNew balance = "+ (balance-amt);
		try {
			
		    FileWriter fw = new FileWriter(filename,true);
		    fw.write(rec);
		    fw.close();
		
			balance = balance - amt;
			
		} catch (IOException e) {
				System.out.println("Cannot withdraw: Transaction Recording Error");	
				return 0.00;
		}
		
		System.out.println("Successful withdraw: New balance: " + balance);
		return amt;
	}
	
	@Override
	public double getBalance(){
		
		return balance;
		
	}
	
}
