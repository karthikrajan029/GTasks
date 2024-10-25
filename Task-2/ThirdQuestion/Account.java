import java.util.Scanner;

public class Account {
    int balance;

    public Account() {
        System.out.println("Account Initialized");
        balance = 1000;   //Giving the A/c balance initial value as 1000;
    }

    public Account(int balance) {
        System.out.println("Account Initialized");
        this.balance = balance;
    }

    public void deposit(int amt) {
        this.balance = this.balance + amt;
        System.out.println("Amt deposited successfully");
    }

    public void withDraw(int amt) {
        if (amt <= this.balance) {
            this.balance = this.balance - amt;
            System.out.println("Amt withdrawal successful");
        } else {
            System.out.println("No sufficient Balance");
        }
    }

    public void balance() {
        System.out.println("Account balance is " + balance);
    }

    public static void main(String[] args) {
        int depositAmt = 0;
        int withDrawAmt = 0;
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();
        ac.balance();
        System.out.println("Enter the amt to deposit into the account");
        depositAmt = sc.nextInt();
        ac.deposit(depositAmt);
        System.out.println("Enter the amt to withdraw from the account");
        withDrawAmt = sc.nextInt();
        ac.withDraw(withDrawAmt);
        ac.balance();
        Account ac1 = new Account(2000);//Giving the A/c balance initial value as 2000
        ac1.balance();
        System.out.println("Enter the amt to deposit into the account");
        depositAmt = sc.nextInt();
        ac1.deposit(depositAmt);
        System.out.println("Enter the amt to withdraw from the account");
        withDrawAmt = sc.nextInt();
        ac1.withDraw(withDrawAmt);
        ac1.balance();
    }


}
