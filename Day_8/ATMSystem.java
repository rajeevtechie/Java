/*
Scenario:
A bank provides an ATM withdrawal service where customers can withdraw money from their accounts. However, the ATM imposes two restrictions:
A user cannot withdraw more money than their account balance.
The withdrawal amount must be in multiples of 100 (e.g., 100, 200, 500, etc.).
If a user attempts to withdraw more than their balance, the system should throw an InsufficientFundsException. If a user tries to withdraw a non-multiple of 100, the system should throw an InvalidAmountException.
Your task is to implement this system in Java by:
Creating a BankAccount class with attributes for account number and balance.
Implementing a method withdraw(double amount) that validates and processes the withdrawal.
Writing two custom exception classes: InsufficientFundsException and InvalidAmountException.
Testing the functionality using a main method.

 */

// Custom Exception for insufficient balance
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom Exception for invalid withdrawal amount
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount)
            throws InsufficientFundsException, InvalidAmountException {

        // Check if amount is multiple of 100
        if (amount % 100 != 0) {
            throw new InvalidAmountException(
                    "Withdrawal amount must be in multiples of 100."
            );
        }

        // Check if sufficient balance is available
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient balance. Available balance: " + balance
            );
        }

        // If all validations pass
        balance -= amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }
}

// Main Class
public class ATMSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC12345", 5000);

        try {
            account.withdraw(1500);   // Valid withdrawal
            System.out.println();

            account.withdraw(125);    // Invalid amount (not multiple of 100)
            System.out.println();

            account.withdraw(6000);   // Insufficient funds

        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }
}
