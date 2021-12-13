/*
  Rellene un mapa LinkedHashMap con claves de tipo String y objetos del tipo que prefiera. 
  Extraiga las parejas, ordénelas según las claves (en orden alfabético) y vuelva a insertarlas en el mapa.
 */
package n1ejercicio8;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[]args) {
		
		LinkedHashMap <String,Alumno> mapaLHM = new LinkedHashMap <String,Alumno>(); //---> creamos el LinkedHashMap
		
		mapaLHM.put("uno", new Alumno("Eva","Rodriguez"));  //---> se agregan los elementos
		mapaLHM.put("dos", new Alumno("Ambar","Lis"));
		mapaLHM.put("tres", new Alumno("Carlos","Benci"));
		
		//System.out.println(mapaLHM);
		
		Set<Entry<String,Alumno>> listaSet = mapaLHM.entrySet(); //---> debo meterlo con entrySet() en un arrayList para poder ordenarlo con sort();
		ArrayList<Map.Entry<String,Alumno>> listaAL = new  ArrayList<Map.Entry<String,Alumno>>(listaSet); // ---> se crea el ArrayList
		
		//System.out.println(listaAL);
		
		//una vez en un arrayList puedo ordenar, como son Strings utilizo el compareTo para ordenar meto el comparator como parametro del sort
		Collections.sort(listaAL, new Comparator<Map.Entry<String,Alumno>>(){
			 public int compare(Map.Entry<String,Alumno> entry1, Map.Entry<String,Alumno> entry2) {
				 return entry1.getKey().compareTo(entry2.getKey());
		     }
		});
		
		System.out.println(listaAL); //---->imprimo la lista ya ordenada alfabeticamente
		
		//Introduzco  en el linkedHashMapa pero tengo que extraer del arrayList los pares clave valor en este caso no puedo rellenarlo
		//con un linkedHashMapMapa.putAll(listAL) ya que hay que extraer la clave y el valor de los entry
		LinkedHashMap<String,Alumno> linkedHashMapa = new LinkedHashMap<String,Alumno>();  //---> creo el linkedHashMap
		    for (Map.Entry<String,Alumno> entry : listaAL) {  //--->recorro con un for each la listaAL para extraer clave y valor
		       linkedHashMapa.put(entry.getKey(), entry.getValue());  //---> con el .put inserto la clave y el valor en el linkedHashMap
		    }
		    
		System.out.println(linkedHashMapa);
		
	}
}
