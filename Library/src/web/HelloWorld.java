package web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="hello", eager=true)
public class HelloWorld implements Serializable {

	private static final long serialVersionUID = 1L;

	private String world = "HerroWord!";
	
	public HelloWorld()
	{
		
	}
	
	public String getWorld() {
		return world;
	}

	public void setWorld(String world) {
		this.world = world;
	}
	
	
	
}
