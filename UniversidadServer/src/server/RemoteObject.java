package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import controller.Controller;
import dto.AlumnoVO;
import tda.TDABusiness;

public class RemoteObject extends UnicastRemoteObject implements TDABusiness {

	private static final long serialVersionUID = 1L;


	protected RemoteObject() throws RemoteException {
		super();
	}

	@Override
	public void saveAlumno(AlumnoVO alumno)
	{
		Controller.getInstance().saveAlumno(alumno);
	}

}
