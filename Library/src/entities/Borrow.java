package entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Borrow implements Serializable{
	
	private static final long serialVersionUID = -1452566269069155842L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Borrow_Id;
	
	@OneToMany
	@JoinColumn(name="ISBN")
	private Book book;
	
	@OneToMany
	@JoinColumn(name="client_id")
	private Client client;
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public long getBorrow_Id() {
		return Borrow_Id;
	}

	public void setBorrow_Id(long borrow_Id) {
		Borrow_Id = borrow_Id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
