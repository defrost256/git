package dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Client;

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
	
	@Override
	public int count() {
		return super.count();
	}
	
	@Override
	public void create(Client entity) {
		super.create(entity);
	}

	@Override
	public void edit(Client entity) {
		super.edit(entity);
	}
	
	@Override
	public Client find(Object id) {
		return super.find(id);
	}
	
	@Override
	public List<Client> findAll() {
		return super.findAll();
	}
	
	@Override
	public List<Client> findRange(int[] range) {
		return super.findRange(range);
	}
	
	@Override
	public void remove(Client entity) {
		super.remove(entity);
	}
}
