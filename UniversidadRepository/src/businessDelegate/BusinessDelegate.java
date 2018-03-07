package businessDelegate;

import java.rmi.Naming;
import java.rmi.RemoteException;

import dto.AlumnoVO;
import dto.MateriaVO;
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
	

}
