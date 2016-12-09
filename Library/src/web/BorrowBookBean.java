package web;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import dal.BookFacade;
import dal.BorrowFacade;
import entities.Book;
import entities.Borrow;
import entities.Client;

@ManagedBean
public class BorrowBookBean implements Serializable {

	private static final long serialVersionUID = -3937140819874571685L;

	private Borrow borrow;
	private Book book;
	
	private DataModel<Book> books;
	
	@EJB
	private BookFacade bookFacade;
	
	@EJB
	private BorrowFacade borrowFacade;
	
	public Borrow getBorrow() {
		return borrow;
	}
	
	public void Borrow(Client currentClient)
	{
		book = getBooks().getRowData();
		borrow = new Borrow();
		borrow.setBook(book);
		borrow.setClient(currentClient);
		
		borrowFacade.create(borrow);
	}

	public void setBorrow(Borrow borrow) {
		this.borrow = borrow;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public DataModel<Book> getBooks() {
		if(books == null)
			books = new ListDataModel<>(bookFacade.findAll());
		return books;
	}

	public void setBooks(DataModel<Book> books) {
		this.books = books;
	}
	
	
}
