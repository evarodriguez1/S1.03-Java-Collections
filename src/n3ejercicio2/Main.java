/*
Repita el ejercicio anterior para un contenedor de tipo int (por ejemplo llamado 'Numeros' y con un método 'add')
y compare el rendimiento con el de un ArrayList<Integer>. 
En la comparación de rendimiento, incluya el proceso de incrementar cada objeto en el contenedor. 
 */
package n3ejercicio2;
import java.util.ArrayList;

public class Main {

	public static void main(String[]args) {
		
		Numeros numerosArray = new Numeros(3);
		
		numerosArray.addInt(1);
		numerosArray.addInt(2);
		numerosArray.addInt(3);
		
		final long startTime = System.nanoTime();
		
		numerosArray.addInt(4);
		
		final long endTime = System.nanoTime();
		
		System.out.println("Time use from Contenedora = "+ (startTime - endTime));
		
		
		ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
		
		final long startTime2 = System.nanoTime();
		
		arrayListInt.add(6);
		
		final long endTime2 = System.nanoTime();
		
		System.out.println("Time use to ArrayList = "+(startTime2 - endTime2));
		
	}
}
