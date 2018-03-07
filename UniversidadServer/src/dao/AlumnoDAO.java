package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.AlumnoEntity;
import hibernate.HibernateUtil;

public class AlumnoDAO {

	private static AlumnoDAO instance;
	
	public static AlumnoDAO getInstance() {
		if (instance==null)
				instance = new AlumnoDAO();
		return instance;
	}
	
	private AlumnoDAO() {
	}
	
	public void saveAlumno(AlumnoEntity ae) {
		try 
		{
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session s = sf.openSession();
			s.beginTransaction();
			s.save(ae);
			s.getTransaction().commit();
			s.flush();
			s.close();
		}
		catch (Exception e)
		{
			System.out.println("Error al guardar Alumno");
			e.printStackTrace();
		}
	}
	
}
