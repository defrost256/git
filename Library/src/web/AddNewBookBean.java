package web;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import dal.BookFacade;
import entities.Book;

@ManagedBean(name="newBook", eager=true)
public class AddNewBookBean implements Serializable{

	private static final long serialVersionUID = 355580033880114009L;

	private Book newBook;
	private String Title;
	private String ISBN;
	private String output="Ready";
	
	@EJB
	private BookFacade bookFacade;

	public void AddNewBook()
	{
		if(!Title.isEmpty() && !ISBN.isEmpty())
		{
			newBook = new Book();
			newBook.setISBN(ISBN);
			newBook.setTitle(Title);
			
			bookFacade.create(newBook);
			
			setOutput("NewBookAdded " + newBook.getISBN() + " " +  newBook.getTitle());
		}
	}
	
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
	
	
}
