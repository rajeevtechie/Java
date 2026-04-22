import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ModulusServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server is waiting for a client connection...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            // Read the two numbers sent by the client
            int num1 = input.readInt();
            int num2 = input.readInt();
            System.out.println("Received numbers: " + num1 + " and " + num2);

            // Calculate modulus
            int remainder = num1 % num2;

            // Send result back to client
            output.writeInt(remainder);
            System.out.println("Modulus sent to client: " + remainder);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}