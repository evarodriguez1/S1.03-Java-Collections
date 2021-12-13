package n3ejercicio2;

import java.util.Arrays;

public class Numeros {

	private int [] arrayNumbers;
	private int index;
	
	public Numeros(int size) {
		this.arrayNumbers = new int [size];
		this.index = 0;
	}
	
	public void addInt(int num) {
		if(index >= arrayNumbers.length) {
			arrayNumbers = Arrays.copyOf(arrayNumbers, index+1);
		}
		this.arrayNumbers [index] = num;
		this.index = index +1;
	}
}
