package Models;

public class Client {

	/// Attributes

	private String name;
	private String lastname;
	private String id;
	private String phoneNumber;
	private boolean hasChildrens;

	/// Constructor

	public Client(String name, String lastname, String id,String phoneNumber, boolean hasChildrens) {

		this.name = name;
		this.lastname = lastname;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.hasChildrens = hasChildrens;

	}

	/// Methods / get / set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public boolean isHasChildrens() {
		return hasChildrens;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setHasChildrens(boolean hasChildrens) {
		this.hasChildrens = hasChildrens;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	@Override
	public String  toString() {
		
		return "Client [Nombre " + " " + name + ", Apellido" + " " + lastname + " " + ", Identificacion "+ " " + id + " " + " " + "Numero de Telefono : " + " " + phoneNumber + " " + " " + " Hijos?" + " " + hasChildrens+"]";
		
	}
	
	
}
