package bizdenAlTicaret.entities.concretes;

import bizdenAlTicaret.entities.abstracts.Entity;

public class GoogleUser implements Entity {
	
	private int id;
	private String email;
	private String parola;
	public GoogleUser() {
		
	}
	public GoogleUser(int id, String email, String parola) {
		
		this.id = id;
		this.email = email;
		this.parola = parola;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	

}
