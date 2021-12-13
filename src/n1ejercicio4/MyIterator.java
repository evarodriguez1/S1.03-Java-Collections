package n1ejercicio4;

public class MyIterator implements Comparable <MyIterator> {

	private String hola;
	
	public MyIterator(String hola) {
		this.hola = hola;
	}
	
	public String toString() {
		return "MyIterator [hola = " +hola+ "]";
	}
	
	public int compareTo(MyIterator o) {
		return this.hola.compareTo(o.hola);
	}
}
