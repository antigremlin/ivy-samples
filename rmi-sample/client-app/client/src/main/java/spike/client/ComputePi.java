package spike.client;

import spike.compute.Compute;

import java.math.BigDecimal;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ComputePi {

    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }

        try {
            String name = "Compute";
            Registry registry = LocateRegistry.getRegistry(args[0]);
            Compute engine = (Compute) registry.lookup(name);
            Pi task = new Pi(Integer.parseInt(args[1]));
            BigDecimal pi = engine.execute(task);
            System.out.println(pi);
        } catch (RemoteException e) {
            System.err.println("Remoting error:");
            e.printStackTrace();
        } catch (NotBoundException e) {
            System.err.println("Remote object not found");
            e.printStackTrace();
        }
    }

}
