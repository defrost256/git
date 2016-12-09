package dal;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Borrow;

@Stateless
@LocalBean
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
