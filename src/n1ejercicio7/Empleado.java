package n1ejercicio7;

public class Empleado {
	private String nombre;
	private double sueldo;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		sueldo = 2000;
	}
	
	public String toString() {
		
		return"[Nombre ="+nombre+",sueldo="+sueldo+"]";
	}
}
