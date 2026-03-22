//Case Study 1: 
class Account{
    double calculateInterest(double balance){
        return ((2.0/100.0))*balance;
    }
}

class SavingAccount extends Account{
    @Override
    double calculateInterest(double balance){
        if(balance > 50000){
            return ((4.0/100.0)*balance) + 500;
        }
        return (4.0/100.0)*balance;
    }
}

class FixedDeposit extends SavingAccount{
    double finalInterest;
    @Override
    double calculateInterest(double balance){
        finalInterest = super.calculateInterest(balance)+(2.0/100.0)*balance ;
        return finalInterest;
    }
    
}
public class Multi_tier_interest_system {
    public static void main(String[] args) {
        SavingAccount a = new SavingAccount();
        System.out.println(a.calculateInterest(10000));
        System.out.println(a.calculateInterest(60000));

        FixedDeposit b = new FixedDeposit();
        System.out.println(b.calculateInterest(60000));
    }
}
