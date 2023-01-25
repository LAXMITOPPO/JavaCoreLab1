package LibraryMethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import LibraryMethod.util.GetConnection;

public class Update extends Create {
	public void update() {
		try {

			SessionFactory sf = GetConnection.getconn();
			Session s = sf.openSession();
			s.beginTransaction();
			Book b1 = (Book) s.get(Book.class, 9);
			b1.setBook_id(22);
			s.getTransaction().commit();
			System.out.println("update succesfully");

			s.close();
		} catch (Exception e) {
		}
	}

}
