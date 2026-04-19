abstract class Transport {
    protected String trackingId;
    protected String destination;

    public Transport(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }

    public abstract void dispatch();
}

interface GPS {
    String getCoordinates();

    default void pingServer() {
        System.out.println("Status: Online...");
    }
}

interface Autonomous {
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {

    public DeliveryDrone(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    public void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }

    @Override
    public String getCoordinates() {
        return "40.7128° N";
    }

    @Override
    public void selfNavigate() {
        System.out.println("Drone navigating autonomously...");
    }
}

class Truck extends Transport {

    public Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    public void dispatch() {
        System.out.println("Truck " + trackingId + " leaving warehouse...");
    }
}

public class Main {
    public static void main(String[] args) {

        Transport t = new DeliveryDrone("D101", "Pune");
        t.dispatch();

        GPS g = new DeliveryDrone("D101", "Pune");
        g.pingServer();

        if (t instanceof GPS) {
            System.out.println(((GPS) t).getCoordinates());
        }
    }
}