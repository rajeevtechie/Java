abstract class Plan{
    private String patientName;
    private double baseFee;
    abstract double calculateBill();

    Plan(String patientName, double baseFee){
        this.patientName = patientName;
        this.baseFee = baseFee;
    }

    String getPatientName(){
        return patientName;
    }

    Double getBaseFee(){
        return baseFee;
    }

}

class SilverPlan extends Plan{
    SilverPlan(String PatientName, double baseFee){
        super(PatientName,baseFee);
    }

    @Override
    double calculateBill(){
        return getBaseFee() + 15.0;
    }
}

class GoldPlan extends Plan{
    GoldPlan(String patientName, double baseFee){
        super(patientName,baseFee);
    }

    @Override
    double calculateBill(){
        double surcharge = 0.10 * getBaseFee();
        double discount = 20.0;
        return getBaseFee() + surcharge - discount;
    }

}

class BillingEngine{
    void printInvoice(Plan p){
        System.out.println("Patient: " + p.getPatientName());
        System.out.println("final bill: " + p.calculateBill());
        System.out.println();
    }
}



public class TelemedicineApp {
    public static void main(String[] args) {

        BillingEngine engine = new BillingEngine();

        Plan p1 = new SilverPlan("John",100.0);
        engine.printInvoice(p1);

        Plan p2 = new GoldPlan("Sophia", 200.0);
        engine.printInvoice(p2);

        Plan p3 = new GoldPlan("Max",50.0);
        engine.printInvoice(p3);
        
    }
}
