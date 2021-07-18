package models;

public class Password {
	
	// atributos,
	private int length;
	private String password;
	
	final private int LENGTH = 8;
	final private String PASSWORD = "12345678";
	
	//constructores,
	
	//por defecto,
	public Password() {
		this.length = this.LENGTH;
		this.password = this.PASSWORD;
	}
	
	//con la longitud de contraseña,
	public Password(int length) {
		this.length = length;
		this.password = this.generatePassword(this.length);
	}
	
	//métodos,
	
	//método que genera un password aleatoriamente,
	//con la longitud indicada,
	private String generatePassword(int length) {
		String password= "";
		
		for (int i = 0; i < length; i++) {
			password += (int) Math.floor(Math.random() * ((9 - 0) + 1) + 0);
		}
		
		return password;		
	}

	//getters y setters,
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	//método toString,
	@Override
	public String toString() {
		return "Password [length=" + this.getLength() + ", password=" + this.getPassword() + "]";
	}
	
	

}
