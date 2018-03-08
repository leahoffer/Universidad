package tda;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dto.*;

public interface TDABusiness extends Remote {
	
	public void agregarAlumno(AlumnoVO alumno) throws RemoteException;
	public void agregarMateria(MateriaVO materia) throws RemoteException;
	public void agregarProfesor(ProfesorVO profesor) throws RemoteException;
	public void eliminarAlumno(AlumnoVO alumno) throws RemoteException;
	public void eliminarCurso(CursoVO curso) throws RemoteException;
	public void eliminarMateria(MateriaVO materia) throws RemoteException;
	public void eliminarProfesor (ProfesorVO profesor) throws RemoteException;
}
