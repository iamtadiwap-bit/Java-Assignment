public class AccountTest {
    public static void main(String[] args) {
    	
    	
        Account acc = new Account("Farai", 500.00);
        
        acc.deposit(200);
        acc.withdraw(100);
        acc.withdraw(700);
        acc.deposit(-50);
        
        System.out.println("Final Balance: " + acc.getBalance());
    }
}