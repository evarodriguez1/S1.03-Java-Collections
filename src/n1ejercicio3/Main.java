package n1ejercicio3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[]args) {
		
		TheHobbit film = new TheHobbit(); // instanciamos el objeto para poder acceder al método next().
		
		ArrayList<String> listaArrayList = new ArrayList<String>(); // ineficiente para insertar o eliminar elementos; eficiente para recorrer
		for (int i=0; i<20;i++) {
			listaArrayList.add(film.next());
			//System.out.println(listaArrayList);
		}
		System.out.println(listaArrayList);
		
		HashSet<String> listaHashSet = new HashSet<String>(); // no permite duplicados. no ordena, no da acceso aleatorio 
		for (int i=0; i<20;i++) {
			listaHashSet.add(film.next());
		}
		System.out.println(listaHashSet);
		
		TreeSet<String> listaTreehSet = new TreeSet<String>(); // ordena por defecto los elementos de forma alfabética 
		for (int i=0; i<20;i++) {
			listaTreehSet.add(film.next());
		}
		System.out.println(listaTreehSet);
		
		LinkedList<String> listaLinked = new LinkedList<String>(); // eficiente para insertar o eliminar elementos, no tanto para recorrer
		for (int i=0; i<20;i++) {
			listaLinked.add(film.next());
		}
		System.out.println(listaLinked);
		
		LinkedHashSet<String> listaLinkedHashSet= new LinkedHashSet<String>(); //ordena por orden entrada, facil de acceder, no sirve para agregar 
		for (int i=0; i<20;i++) {
			listaLinkedHashSet.add(film.next());
		}
		System.out.println(listaLinkedHashSet);
		
	}
}
