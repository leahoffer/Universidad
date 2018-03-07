package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.MateriaEntity;
import hibernate.HibernateUtil;

public class MateriaDAO {

	private static MateriaDAO instance;
	
	public static MateriaDAO getInstance() {
		if (instance==null)
				instance = new MateriaDAO();
		return instance;
	}
	
	private MateriaDAO() {
	}
	
	public void saveMateria(MateriaEntity me)
	{
		try
		{
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session s = sf.openSession();
			s.beginTransaction();
			s.save(me);
			s.getTransaction().commit();
			s.flush();
			s.close();
		}
		catch (Exception e)
		{
			System.out.println("Error al guardar la Materia");
			e.printStackTrace();
		}
	}
	
}
