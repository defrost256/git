package dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Borrow;

public class BorrowFacade extends AbstractFacade<Borrow> {

	@PersistenceContext
	private EntityManager em;
	
	public BorrowFacade() {
		super(Borrow.class);
	}

	@Override
	protected EntityManager em() {
		return em;
	}
	
	@Override
	public void create(Borrow entity) {
		super.create(entity);
	}
	
	@Override
	public int count() {
		return super.count();
	}
	
	@Override
	public void edit(Borrow entity) {
		super.edit(entity);
	}
	
	@Override
	public Borrow find(Object id) {
		return super.find(id);
	}
	
	@Override
	public List<Borrow> findAll() {
		return super.findAll();
	}
	
	@Override
	public List<Borrow> findRange(int[] range) {
		return super.findRange(range);
	}
	
	@Override
	public void remove(Borrow entity) {
		super.remove(entity);
	}

}
