package com.example.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.Entity.Book;
import com.example.library.exception.BookNotFoundException;
import com.example.library.repository.BookRepository;
import com.example.library.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	private BookRepository bookRepository;

	@Autowired
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Book saveBook(Book book) {
		Book savedBook = bookRepository.save(book);
		return saveBook(book);
	}

	@Override
	public List getAllBook() {

		return (List) bookRepository.findAll();
	}

	@Override
	public Book getBookById(int id) throws BookNotFoundException {
		if (bookRepository.findById(id).isEmpty()) {
			throw new BookNotFoundException("Book Not Found");

		}
		return bookRepository.findById(id).get();
	}

	@Override
	public List getAllBooks() throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
