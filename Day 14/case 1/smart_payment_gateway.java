abstract class payment{
    private int transaction_id;
    private double amount;

    payment(int transaction_id, int amount){
        this.transaction_id = transaction_id;
        this.amount = amount;
    }

    int getTransaction(){
        return transaction_id;
    }

    double getAmount(){
        return amount;
    }
    abstract double processPayment();
}

class CreditCardPayment extends payment{

    CreditCardPayment(int transaction_id, int amount) {
        super(transaction_id, amount);
    }
    // @Override
    double processPayment(){
        return getAmount() + (2.0/100.0)*getAmount();
    }
}

class UPIPayment extends payment{

    UPIPayment(int transaction_id, int amount) {
            super(transaction_id, amount);
    }

    @Override
    double processPayment() {
        return getAmount();
    }
}

class PaymentProcessor {

    void process(payment p) {
        System.out.println("Transaction ID: " + p.getTransaction());
        System.out.println("Final Amount: " + p.processPayment());
    }
}


public class smart_payment_gateway {
    public static void main(String[] args){
        CreditCardPayment a = new CreditCardPayment(1001,1000);
        System.out.println( a.processPayment());

        UPIPayment b = new UPIPayment(1002,1000);
        System.out.println(b.processPayment());

        PaymentProcessor processor = new PaymentProcessor();
        payment p1 = new CreditCardPayment(1001, 1000);
        payment p2 = new UPIPayment(1002, 2000);

        processor.process(p1); // Credit Card
        processor.process(p2); // UPI

    }
}
