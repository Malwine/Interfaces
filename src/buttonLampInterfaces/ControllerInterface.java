package buttonLampInterfaces;

import java.rmi.RemoteException;

public interface ControllerInterface extends java.rmi.Remote {

	//public void update() throws java.rmi.RemoteException;

	public void update(String version) throws RemoteException;

}
