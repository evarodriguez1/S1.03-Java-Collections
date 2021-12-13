package n1ejercicio8;

public class Alumno {

	private String name;
	private String surname;
	
	public Alumno(String name, String surname) {
		this.name = name;
		this.surname = surname;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String toString() {
		return "Alumno [name= " +name+ " surname= " +surname+ "]";
	}
}
