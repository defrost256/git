package web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;

import entities.Client;

@ManagedBean(name="ClientLogin")
@SessionScoped
public class LoginClientBean implements Serializable{

	private static final long serialVersionUID = 4918699346085889528L;
	
	private DataModel<Client> clients;
	private Client current = null;
	
	public String LoginAsClient()
	{
		current=getClients().getRowData();
		return FacesUtil.RedirectPage("BorrowBook.xhtml");
	}

	public DataModel<Client> getClients() {
		return clients;
	}

	public void setClients(DataModel<Client> clients) {
		this.clients = clients;
	}

	public Client getCurrent() {
		return current;
	}

	public void setCurrent(Client current) {
		this.current = current;
	}
}
