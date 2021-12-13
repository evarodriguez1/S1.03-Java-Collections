/*
Ejercicio1. Crea una clase llamada 'Contenedora' que encapsule un array de objetos String. 
Defina un método 'add' que sólo permita añadir cadenas de caracteres. Si el array no es suficientemente grande para la siguiente inserción,
el contenedor debe redimensionar automáticamente este array. En main(), compare el rendimiento de este contenedor con el de un ArrayList<String>.
Idea: Para la prueba de rendimiento, se puede utilizar la apio System.nanoTime(), que permite calcular el tiempo utilizado 
en las operaciones descritas para uno u otro contenedor.
 */
package n3ejercicio1;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Contenedora contenedor = new Contenedora(3);   //---> instanciamos la clase cotenedora
		
		contenedor.addString("Pedro");  //---> se agregar tres elementos
		contenedor.addString("Eva");
		contenedor.addString("Pepe?");
		
		final long startTime = System.nanoTime();  //---> se almacena el tiempo de comienzo de la operacion --> nanoTime() 
		
		contenedor.addString("Ambar");  //---> aqui se agrega un nuevo elemento y el contenedor deberìa agrandarse
		
		final long endTime = System.nanoTime();  //---> se almacena el tiempo de finalizacion de la operacion
		
		System.out.println("Time use from Contenedora = "+ (startTime - endTime));
		
		
		ArrayList<String> arrayList = new ArrayList<String>(); //---> se crea el arrayList
		
		final long startTime2 = System.nanoTime();
		
		arrayList.add("Jorge");
		
		final long endTime2 = System.nanoTime();
		
		System.out.println("Time use to ArrayList = "+(startTime2 - endTime2));
		

	}

}
