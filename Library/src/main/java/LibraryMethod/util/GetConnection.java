package LibraryMethod.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import LibraryMethod.Book;
import LibraryMethod.Create;
import LibraryMethod.Retrieve;
import LibraryMethod.Update;

public class GetConnection {
	private static SessionFactory sf;

	public static SessionFactory getconn() {
		try {
			Configuration cfg = new Configuration();
			Properties pr = new Properties();
			pr.put(Environment.USER, "root");
			pr.put(Environment.PASS, "root");
			pr.put(Environment.URL, "jdbc:mysql://localhost:3306/anudip");
			pr.put(Environment.SHOW_SQL, "true");
			pr.put(Environment.HBM2DDL_AUTO, "update");
			pr.put(Environment.FORMAT_SQL, "true");
			cfg.setProperties(pr);
			cfg.addAnnotatedClass(Book.class);
			cfg.addAnnotatedClass(Create.class);
			cfg.addAnnotatedClass(Retrieve.class);
			cfg.addAnnotatedClass(Update.class);
			ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
			sf = cfg.buildSessionFactory();
		} catch (Exception e) {
		}
		return sf;
	}
}
