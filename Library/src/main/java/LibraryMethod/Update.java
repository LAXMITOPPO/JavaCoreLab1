package LibraryMethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Update {
	public void update() {
		try {

			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session s = sf.openSession();
			s.beginTransaction();
			Book b1 = (Book) s.get(Book.class, 1);
			b1.setBook_id(22);
			System.out.println("update succesfully");
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {
		}
	}

}
