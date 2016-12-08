package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="client")
public class Client implements Serializable {

	private static final long serialVersionUID = 1570957437483547087L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long client_id;
}
