import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Create the object that handles the logic
            ModulusImpl obj = new ModulusImpl();
            
            // Start the RMI registry programmatically on the default port 1099
            Registry registry = LocateRegistry.createRegistry(1100);
            
            // Bind the object to the registry with a unique name
            registry.rebind("ModulusService", obj);
            
            System.out.println("RMI Server is running and ready on port 1099...");
        } catch (Exception e) {
            System.out.println("Server Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}