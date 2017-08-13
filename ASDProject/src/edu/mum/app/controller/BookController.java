package edu.mum.app.controller;

import edu.mum.app.dao.BookDao;
import edu.mum.app.domain.Book;
import edu.mum.app.service.BookService;
import edu.mum.framework.controller.ProductController;

public class BookController extends ProductController<Book>{
	public BookController(Class<Book> classType) {
		super(classType);
	}
	BookService bookService = new BookService(new BookDao());
	public BookService getBookService(){
		return bookService;
	}
}
