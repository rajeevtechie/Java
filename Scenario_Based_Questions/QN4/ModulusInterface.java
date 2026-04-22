import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ModulusInterface extends Remote {
    // The method signature that the client will call and the server will execute
    int calculateModulus(int a, int b) throws RemoteException;
}