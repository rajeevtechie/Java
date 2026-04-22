import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ModulusClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             Scanner scanner = new Scanner(System.in)) {
             
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Send numbers to the server
            output.writeInt(num1);
            output.writeInt(num2);

            // Receive the calculated modulus from the server
            int result = input.readInt();
            System.out.println("The modulus (remainder) calculated by the server is: " + result);

        } catch (IOException e) {
            System.out.println("Could not connect to the server. Make sure ModulusServer is running first!");
        }
    }
}