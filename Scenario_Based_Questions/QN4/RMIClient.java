import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Locate the RMI registry on the server
            Registry registry = LocateRegistry.getRegistry("localhost", 1100);
            
            // Look up the remote object using the unique name
            ModulusInterface stub = (ModulusInterface) registry.lookup("ModulusService");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number for RMI Modulus: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number for RMI Modulus: ");
            int num2 = scanner.nextInt();

            // Call the remote method as if it were a local method
            int result = stub.calculateModulus(num1, num2);
            System.out.println("\nResult returned from RMI Server: The modulus is " + result);
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("Client Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}