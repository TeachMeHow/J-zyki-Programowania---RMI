package lab07;

import java.rmi.Remote;
import java.rmi.RemoteException;

public class ICentrala implements Remote {
	// zwraca numer przypisany do zarejestrowanej tablicy lub 0, jeśli
	// operacja się nie udała
	int register(IBoard s) throws RemoteException {
		return 0;
	}

	// zwraca numer wyrejestrowanej tablicy lub 0, jeśli operacja się nie
	// udała
	int unregister(int id) throws RemoteException {
		return 0;
	}

}
