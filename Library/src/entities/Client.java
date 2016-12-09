package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="client")
@SequenceGenerator(name="client_seq", sequenceName="CLIENT_SEQ")
public class Client implements Serializable {

	private static final long serialVersionUID = 1570957437483547087L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="client_seq")
	private long client_id;

	public long getClient_id() {
		return client_id;
	}

	public void setClient_id(long client_id) {
		this.client_id = client_id;
	}
}
