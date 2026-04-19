abstract class Payment {
    private String transactionId;
    private double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public abstract double processPayment();
}

class CreditCardPayment extends Payment {

    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public double processPayment() {
        return getAmount() * 1.02; // 2% fee
    }
}

class UPIPayment extends Payment {

    public UPIPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public double processPayment() {
        return getAmount(); // no fee
    }
}

class PaymentProcessor {
    public static double process(Payment p) {
        return p.processPayment();
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment("TXN1", 1000);
        Payment p2 = new UPIPayment("TXN2", 1000);

        System.out.println(p1.processPayment()); // 1020
        System.out.println(p2.processPayment()); // 1000

        // Polymorphic array
        Payment[] payments = {p1, p2};
        double total = 0;

        for (Payment p : payments) {
            total += p.processPayment();
        }

        System.out.println("Total: " + total); // 2020
    }
}