package tda;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dto.*;

public interface TDABusiness extends Remote {
	
	public void agregarAlumno(AlumnoVO alumno) throws RemoteException;
	public void agregarMateria(MateriaVO materia) throws RemoteException;

}
