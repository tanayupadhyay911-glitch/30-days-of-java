class BankAcc{
	private double balance;
	
	public  double getBalance(){
		return balance;
	}
	public void setBalance(double b) {
        if (b < 0) {
            System.out.println("Invalid balance! Balance cannot be negative.");
        } else {
            balance = b;
        }
    }
} 
 
public class Account {
    public static void main(String[] args) {

        BankAcc acc = new BankAcc();

        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());

        acc.setBalance(-100);
        System.out.println("Balance: " + acc.getBalance());
    }
}