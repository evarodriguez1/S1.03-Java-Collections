/*
 Rellene un HashMap con pares clave-valor. Imprima los resultados para mostrar la ordenaci�n 
 seg�n el c�digo hash.
 Ordene las parejas, extraiga la clave e introduzca el resultado en un mapa LinkedHashMap.
 Demuestre que se mantiene el orden de inserci�n.
 */
package n1ejercicio7;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String,Empleado> personal = new HashMap<String,Empleado>();
		personal.put("145", new Empleado("Eva"));
		personal.put("146", new Empleado("Ambar"));
		personal.put("147", new Empleado("Carlos"));
		personal.put("148", new Empleado("Sandra"));
		
		System.out.println(personal);
		
		//extrae su material en un entrySet
        Set<Entry<String,Empleado>> listaEntry = personal.entrySet();
        
        //Creamos un ArrayList para a�adirlo el material del hashmap a trav�s del entrySet.
        ArrayList<Map.Entry<String,Integer>> listaAL = new  ArrayList<Map.Entry<String,Integer>>();
        listaAL.addAll(((Collection<? extends Entry<String, Integer>>) listaEntry));

        System.out.println(listaAL);
      
        //ordenamos el ArrayList de forma alfab�tica
        Collections.sort(listaAL, new Comparator<Map.Entry<String,Integer>>() {
        	@Override
        	public int compare(Map.Entry<String,Integer> entry1, Map.Entry<String,Integer> entry2) {
        		return Integer.compare(entry1.getValue(),  entry2.getValue());
        	}
 
        }); // cierre de la fila Collections.sort()

        //imprimimos para ver resultado
        System.out.println(listaAL);

        //creamos LinkedHashMap y a�adimos el material del ArrayList
        LinkedHashMap<String,Integer> listaHM = new LinkedHashMap<String,Integer>() ;

        //a�adimos los valores del ArrayList sorteado a un LinkedHashMap, que se ordena por orden de introducci�n
        for (Map.Entry<String,Integer> entry:listaAL) {
            listaHM.put(entry.getKey(),entry.getValue());
        }
        System.out.println(listaHM);
	}


}
