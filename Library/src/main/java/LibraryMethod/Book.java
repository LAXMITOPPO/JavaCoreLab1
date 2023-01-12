package LibraryMethod;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libraryBook")
public class Book {

	@Id
	@Column(name = "Book_id")
	private int Book_id;
	private String Book_name;
	private String Book_author;
	private String Publisher;
	private String Status;

	public void Book1(int booki, String bookn, String booka, String pub, String st) {

		this.Book_id = booki;
		this.Book_name = bookn;
		this.Book_author = booka;
		this.Publisher = pub;
		this.Status = st;
	}

	public int getBook_id() {
		return Book_id;
	}

	public void setBook_id(int book_id) {
		Book_id = book_id;
	}

	public String getBook_name() {
		return Book_name;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public String getBook_author() {
		return Book_author;
	}

	public void setBook_author(String book_author) {
		Book_author = book_author;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int book_id, String book_name, String book_author, String publisher, String status) {
		super();
		Book_id = book_id;
		Book_name = book_name;
		Book_author = book_author;
		Publisher = publisher;
		Status = status;
	}
}
