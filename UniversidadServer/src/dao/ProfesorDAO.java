package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.ProfesorEntity;
import hibernate.HibernateUtil;

public class ProfesorDAO {

	private static ProfesorDAO instance;
	
	public static ProfesorDAO getInstance()
	{
		if (instance==null)
			instance = new ProfesorDAO();
		return instance;
	}
	
	private ProfesorDAO() {
	}
	
	public void saveProfesor(ProfesorEntity pe)
	{
		try
		{
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session s = sf.openSession();
			s.getTransaction();
			s.save(pe);
			s.getTransaction().commit();
			s.flush();
			s.close();
		}
		catch (Exception e)
		{
			System.out.println("Error al guardar Profesor");
			e.printStackTrace();
		}
	}
}
