package LibraryMethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Retrieve extends Create {

	public void retrieve() {
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			System.out.println("sf is ready" + sf);
			Session s = sf.openSession();
			Transaction tr = s.beginTransaction();
			System.out.println("Fetching data...........");
			Book b1 = (Book) s.get(Book.class, 1);
			System.out.println(b1);
			tr.commit();
		} catch (Exception e) {
		}
	}
}
