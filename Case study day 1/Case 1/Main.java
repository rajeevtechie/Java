class Account {
    protected double balance;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to calculate interest
    public double calculateInterest() {
        return balance * 0.02; // 2%
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance); // constructor chaining
    }

    @Override
    public double calculateInterest() {
        double interest = balance * 0.04; // 4%

        if (balance > 50000) {
            interest += 500; // loyalty bonus
        }

        return interest;
    }
}

class FixedDeposit extends SavingsAccount {

    public FixedDeposit(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        double parentInterest = super.calculateInterest(); // reuse SavingsAccount logic
        double extra = balance * 0.02; // extra 2%

        return parentInterest + extra;
    }
}

public class Main {
    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount(10000);
        System.out.println(s1.calculateInterest()); // 400

        SavingsAccount s2 = new SavingsAccount(60000);
        System.out.println(s2.calculateInterest()); // 2900

        FixedDeposit fd = new FixedDeposit(60000);
        System.out.println(fd.calculateInterest()); // 4100
    }
}