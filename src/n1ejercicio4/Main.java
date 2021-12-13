
package n1ejercicio4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
	 
	 public static <T> void iterador (Collection<T> c) { //ITERAR ES RECORRER UNA COLECCION
		 Iterator<T> ite = c.iterator(); // crear el iterador
			while (ite.hasNext()) {  //indica si hay, o no, más elementos
				System.out.println(ite.next().toString()); //Next() --> busca el siguiente obj de la lista
			}
	 }
	
	 public static void main(String arg[]) {
	
		MyIterator myIt = new MyIterator("nuevo");
		
		LinkedHashSet<MyIterator> listaLDH = new LinkedHashSet<MyIterator>();
		listaLDH.add(new MyIterator("uno"));
		listaLDH.add(new MyIterator("dos"));
		
		ArrayList<MyIterator> listaAL = new ArrayList<MyIterator>();
		listaAL.add(new MyIterator("tres"));
		listaAL.add(new MyIterator("cuatro"));
		
		TreeSet<MyIterator> listaTS = new TreeSet<MyIterator>();
		listaTS.add(new MyIterator("cinco"));
		listaTS.add(new MyIterator("seis"));
		
		LinkedList<MyIterator> listaL = new LinkedList<MyIterator>();
		listaL.add(new MyIterator("siete"));
		listaL.add(new MyIterator("ocho"));
		
		HashSet<MyIterator> listaHS = new HashSet<MyIterator>(); 
		listaHS.add(new MyIterator("nueve"));
		listaHS.add(new MyIterator("diez"));
		
		iterador(listaLDH);
		iterador(listaAL);
		iterador(listaTS);
		iterador(listaL);
		iterador(listaHS);
	 }
}
