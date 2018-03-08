package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import entity.*;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
		static
	    {
	        try
	        {
	        	 AnnotationConfiguration config = new AnnotationConfiguration();
	        	 config.addAnnotatedClass(AlumnoEntity.class);
	        	 config.addAnnotatedClass(MateriaEntity.class);
	        	 config.addAnnotatedClass(ProfesorEntity.class);
	        	 config.addAnnotatedClass(DireccionEntity.class);
	        	 config.addAnnotatedClass(CursoEntity.class);
	             sessionFactory = config.buildSessionFactory();
	        }
	        catch (Throwable ex)
	        {
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	 
	    public static SessionFactory getSessionFactory()
	    {
	        return sessionFactory;
	    }
}

