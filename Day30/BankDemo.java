class BankAccount {

    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    int getBalance() {
        return balance;
    }
}

public class BankDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        account.deposit(2000);
        account.withdraw(3000);
        account.withdraw(6000);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
