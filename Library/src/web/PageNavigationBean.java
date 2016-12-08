package web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="PageNavigation")
public class PageNavigationBean implements Serializable {

	private static final long serialVersionUID = -3485981074285713612L;

	public String getNextPage(int pageID)
	{
		switch (pageID) {
		case 0:
			return "index.xhtml";
		case 1:
			return "AddNewBook.xhtml";
		default:
			return "index.xhtml";
		}
	}
	
}
