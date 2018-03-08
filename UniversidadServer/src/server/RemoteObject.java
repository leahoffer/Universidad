package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import controller.Controller;
import dto.AlumnoVO;
import dto.CursoVO;
import dto.MateriaVO;
import dto.ProfesorVO;
import tda.TDABusiness;

public class RemoteObject extends UnicastRemoteObject implements TDABusiness {

	private static final long serialVersionUID = 1L;


	protected RemoteObject() throws RemoteException {
		super();
	}

	@Override
	public void agregarAlumno(AlumnoVO alumno)
	{
		Controller.getInstance().agregarAlumno(alumno);
	}


	@Override
	public void agregarMateria(MateriaVO materia) throws RemoteException 
	{
		Controller.getInstance().agregarMateria(materia);
	}

	@Override
	public void agregarProfesor(ProfesorVO profesor) throws RemoteException {
		Controller.getInstance().agregarProfesor(profesor);
		
	}

	@Override
	public void eliminarAlumno(AlumnoVO alumno) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCurso(CursoVO curso) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarMateria(MateriaVO materia) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProfesor(ProfesorVO profesor) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
