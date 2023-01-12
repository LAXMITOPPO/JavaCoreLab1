package LibraryMethod;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sf;
	static {
		try {
			sf = new Configuration().configure().buildSessionFactory();
		} catch (Throwable th) {
			System.err.println("Enitial SessioonFactory creation failed" + th);
			throw new ExceptionInInitializerError(th);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sf;
	}

}
