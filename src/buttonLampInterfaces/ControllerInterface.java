package buttonLampInterfaces;


public interface ControllerInterface extends java.rmi.Remote {
	
	public void sendMessage(String message) throws java.rmi.RemoteException;

	public void update() throws java.rmi.RemoteException;

}
