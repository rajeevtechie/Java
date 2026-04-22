import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ModulusImpl extends UnicastRemoteObject implements ModulusInterface {
    
    protected ModulusImpl() throws RemoteException {
        super(); // Required by UnicastRemoteObject
    }

    // The actual logic that runs on the server
    @Override
    public int calculateModulus(int a, int b) throws RemoteException {
        return a % b;
    }
}