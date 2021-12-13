package n1ejercicio6;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

	public static void main(String[]args) {
		
		LinkedList<Integer> listLinked = new LinkedList<Integer>();
		
		Iterator<Integer> listIterator = listLinked.iterator();
		
		do {  
			listLinked.add(listLinked.size()/2, ingresaNumeroInt());
			System.out.println(listLinked);
		} while (listLinked.listIterator() != null ); 
			
	}
	
	public static int ingresaNumeroInt() {
		Scanner input = new Scanner(System.in);
		int numIngresado;
		do {
		System.out.println("Ingresa un numero entero o aprieta el 0 para salir: ") ;
		numIngresado = input.nextInt();
		return numIngresado;
		} 
		while (numIngresado != 0);
		
		 }
}
