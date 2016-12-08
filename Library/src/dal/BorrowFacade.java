package dal;

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
}
