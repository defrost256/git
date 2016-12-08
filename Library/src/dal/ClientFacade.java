package dal;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Client;

@Stateless
@LocalBean
public class ClientFacade extends AbstractFacade<Client> {

	@PersistenceContext
	EntityManager em;
	
	public ClientFacade() {
		super(Client.class);
	}

	@Override
	protected EntityManager em() {
		return em;
	}
}
