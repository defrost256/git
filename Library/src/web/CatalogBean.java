package web;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import dal.BookFacade;
import entities.Book;

@ManagedBean(name="Catalog")
public class CatalogBean implements Serializable {
	
	private static final long serialVersionUID = -2194599864318111137L;

	private DataModel<Book> books = null;
	
	@EJB
	private BookFacade bookFacade;
	
	public DataModel<Book> getBooks()
	{
		if(books == null)
			books = new ListDataModel<>(bookFacade.findAll());
		return books;
	}

	public void setBooks(DataModel<Book> books) {
		this.books = books;
	}
	
}
