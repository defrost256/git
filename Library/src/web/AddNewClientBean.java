package web;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import dal.ClientFacade;
import entities.Client;

@ManagedBean(name="AddNewClient")
public class AddNewClientBean implements Serializable {

	private static final long serialVersionUID = -3591681734127003983L;

	private long clientID;
	
	private Client newClient;
	
	@EJB
	private ClientFacade clientFacade;
	
	
	public void AddNewClient()
	{
		newClient = new Client();
		clientFacade.create(newClient);
	}

	public long getClientID() {
		return clientID;
	}

	public void setClientID(long clientID) {
		this.clientID = clientID;
	}

	public Client getNewClient() {
		return newClient;
	}

	public void setNewClient(Client newClient) {
		this.newClient = newClient;
	}
	
}
