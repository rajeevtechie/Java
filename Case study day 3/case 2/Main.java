abstract class Robot {
    private String batteryId;
    protected double chargeLevel;

    public Robot(String batteryId, double chargeLevel) {
        this.batteryId = batteryId;
        this.chargeLevel = chargeLevel;
    }

    public String getBatteryId() {
        return batteryId;
    }

    public void reportStatus() {
        System.out.println("Battery " + batteryId + " Charge: " + chargeLevel + "%");
    }

    public abstract void performTask();
}

class DroneRobot extends Robot {

    public DroneRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    @Override
    public void performTask() {
        if (chargeLevel < 15) {
            System.out.println("Low battery!");
        } else {
            chargeLevel -= 15;
            reportStatus();
        }
    }
}

class GroundRobot extends Robot {

    public GroundRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    @Override
    public void performTask() {
        if (chargeLevel < 5) {
            System.out.println("Low battery!");
        } else {
            System.out.println("Performing surface check...");
            chargeLevel -= 5;
            reportStatus();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Robot[] fleet = {
            new DroneRobot("D1", 20),
            new GroundRobot("G1", 10),
            new DroneRobot("D2", 10)
        };

        for (Robot r : fleet) {
            r.performTask();
        }
    }
}