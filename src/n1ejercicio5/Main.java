package n1ejercicio5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {
	public static void main(String[]args) {
		ArrayList<Integer> lista1 = new ArrayList<Integer>(); //creo la lista1
		
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		lista1.add(5);
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>(); //creo la lista2
	
		Collections.reverse(lista1);  // con .reverse() ---> doy vuelta el contenido de la lista
		
		Iterator<Integer> iteratorList1 = lista1.iterator();  //creo el objeto iterador??
		
		//con este while...
		while (iteratorList1.hasNext()) {
			lista2.add(iteratorList1.next());
		}
		
		System.out.println(lista2);
		
	}
}
