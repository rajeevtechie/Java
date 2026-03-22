abstract class Transport {
    String trackingId;
    String destination;

    Transport(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }

    abstract void dispatch();
}

interface GPS {
    void getCoordinates();

    default void pingServer() {
        System.out.println("Status: Online...");
    }
}

interface Autonomous {
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {

    DeliveryDrone(String trackingId) {
        super(trackingId, "Customer Location");
    }

    @Override
    void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }

    @Override
    public void getCoordinates() {
        System.out.println("Drone coordinates: [19.07, 72.87]");
    }

    @Override
    public void selfNavigate() {
        System.out.println("Drone navigating autonomously...");
    }
}

class Truck extends Transport {

    Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Truck " + trackingId + " leaving warehouse...");
    }
}

class CargoShip extends Transport implements GPS {

    CargoShip(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Ship " + trackingId + " sailing...");
    }

    @Override
    public void getCoordinates() {
        System.out.println("Ship coordinates: [18.96, 72.82]");
    }
}

// 🔹 Main Class
public class SmartLogistics {
    public static void main(String[] args) {

        Transport t = new DeliveryDrone("D101");
        t.dispatch();

        GPS g = new DeliveryDrone("D101");
        g.pingServer();

        Transport[] arr = {
            new DeliveryDrone("D101"),
            new Truck("T202", "Delhi"),
            new CargoShip("S303", "Dubai")
        };

        System.out.println("\n--- Processing ---");

        for (Transport tr : arr) {
            tr.dispatch();

            if (tr instanceof GPS) {
                GPS gps = (GPS) tr;
                gps.getCoordinates();
                gps.pingServer();
            }

            if (tr instanceof Autonomous) {
                Autonomous a = (Autonomous) tr;
                a.selfNavigate();
            }

            System.out.println();
        }
    }
}