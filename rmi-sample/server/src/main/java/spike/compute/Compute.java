package spike.compute;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Compute extends Remote {

    <T> T execute(Task<T> t) throws RemoteException;

}
