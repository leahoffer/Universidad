package businessDelegate;

import java.rmi.Naming;
import java.rmi.RemoteException;

import dto.AlumnoVO;
import dto.CursoVO;
import dto.MateriaVO;
import dto.ProfesorVO;
import tda.TDABusiness;

public class BusinessDelegate implements TDABusiness {

	private static BusinessDelegate instance;
	private TDABusiness RemoteObject;
	
	public static BusinessDelegate getInstance()
	{
		if (instance == null)
			instance = new BusinessDelegate();
		return instance;
	}
	private BusinessDelegate ()
	{
		System.out.println("Connecting to Remote Object...");
		try
		{
			RemoteObject = (TDABusiness)Naming.lookup("//localhost/RemoteObject");
			System.out.println("Connected to Remote Object!");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
	}
	
	@Override
	public void agregarAlumno(AlumnoVO alumno) throws RemoteException {
		RemoteObject.agregarAlumno(alumno);
	}
	@Override
	public void agregarMateria(MateriaVO materia) throws RemoteException {
		RemoteObject.agregarMateria(materia);
		
	}
	@Override
	public void agregarProfesor(ProfesorVO profesor) throws RemoteException {
		RemoteObject.agregarProfesor(profesor);
		
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
