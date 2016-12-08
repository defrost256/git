package dal;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Book;

@Stateless
@LocalBean
public class BookFacade extends AbstractFacade<Book> {

	@PersistenceContext
	private EntityManager em;
	
	public BookFacade() {
		super(Book.class);
	}
	
	@Override
	protected EntityManager em() {
		return em;
	}
	
}
