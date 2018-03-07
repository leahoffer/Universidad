package tda;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dto.*;

public interface TDABusiness extends Remote {
	
	public void saveAlumno(AlumnoVO alumno) throws RemoteException;

}
