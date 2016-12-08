package dal;

import java.util.List;

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
	
	@Override
	public void create(Book entity) {
		super.create(entity);
	}
	
	@Override
	public void edit(Book entity) {
		super.edit(entity);
	}
	
	@Override
	public Book find(Object id) {
		return super.find(id);
	}
	
	@Override
	public List<Book> findAll() {
		return super.findAll();
	}
	
	@Override
	public List<Book> findRange(int[] range) {
		return super.findRange(range);
	}
	
	@Override
	public void remove(Book entity) {
		super.remove(entity);
	}
	
	@Override
	public int count() {
		return super.count();
	}

}
