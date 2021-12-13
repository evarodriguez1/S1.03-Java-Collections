package n3ejercicio1;
import java.util.Arrays;

public class Contenedora {

	private String [] arrayString;
	private int index;
	
	public Contenedora (int size) {
		this.arrayString = new String [size];
		this.index = 0;
	}
	
	public void addString(String palabra) {
		if(index >= arrayString.length) {
			arrayString = Arrays.copyOf(arrayString, index+1);  //---> Arrays.copyOf Copia la matriz especificada, truncando o rellenando con falso (si es necesario) 
		}														//     para que la copia tenga la longitud especificada.
		this.arrayString [index] = palabra;
		this.index = index +1;
	}

}
