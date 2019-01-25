package lab07;

import java.rmi.Remote;
import java.rmi.RemoteException;

public class IBoard implements Remote {
	boolean register(ISensor s, char category) throws RemoteException {
		return false;
	}

	boolean unregister(ISensor s) throws RemoteException {
		return false;
	}

	// przełącznik włącz/wyłącz zbierania i wyświetlania danych na tablicy
	void toggle() throws RemoteException {
	}

	void setUpdateInterval(long milisec) throws RemoteException {
	}

}
