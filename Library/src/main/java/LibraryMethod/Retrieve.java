package LibraryMethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import LibraryMethod.util.GetConnection;

public class Retrieve extends Create {

	public void retrieve() {
		// try {
		SessionFactory sf = GetConnection.getconn();
		System.out.println("sf is ready" + sf);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		System.out.println("Fetching data...........");
		Book b1 = (Book) s.get(Book.class, 9);

		System.out.println(b1);
		tr.commit();
	} // catch (Exception e) {
		// }
		// }
}
