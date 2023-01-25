package LibraryMethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import LibraryMethod.util.GetConnection;

public class Create {
	public void create() {

		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory sf = GetConnection.getconn();
		Session s = sf.openSession();
		// s.beginTransaction();
		Transaction tr = s.beginTransaction();
		// create book
		Book b1 = new Book();
		b1.setBook_id(011);
		b1.setBook_name("Let Us C++");
		b1.setBook_author("Yashwant");
		b1.setPublisher("BPB");
		b1.setStatus("Available");
		// create book
//		Book b2 = new Book();
//		b2.setBook_id(012);
//		b2.setBook_name("Let Us C");
//		b2.setBook_author("Yashwant Kanetkar");
//		b2.setPublisher("BPB");
//		b2.setStatus("Available");
		// lib2.setadmin(a1);

//		List<LibraryManagment> list = new ArrayList<LibraryManagment>();
//		list.add(lib1);
//		list.add(lib2);
//		a1.setLibraryManagment(list);
//		s.save(a1);
		s.save(b1);
//		s.save(b2);
//		s.save(list);
//		LibraryManagment lib = s.get(LibraryManagment.clas
//		lib.setBook_id(9);
//		s.save(lib);
		// System.out.println(s.get(LibraryManagment.class, 2));
		tr.commit();

		System.out.println("save book............");
		s.close();
	}
}
