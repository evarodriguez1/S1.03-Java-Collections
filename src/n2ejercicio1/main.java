package n2ejercicio1;
import java.util.PriorityQueue;
public class main {

	public static void main(String[] args) {
		
		PriorityQueue<numRandom> colaPQ = new PriorityQueue(); //creamos la cola, sin parametro 
		
		numRandom num1 = new numRandom();
		numRandom num2 = new numRandom();
		numRandom num3 = new numRandom();
		numRandom num4 = new numRandom();
		numRandom num5 = new numRandom();

		
		colaPQ.add(num1);
		colaPQ.add(num2);
		colaPQ.add(num3);
		colaPQ.add(num4);
		colaPQ.add(num5);
					
		System.out.println(colaPQ);  // que orden utiliza?orden natural?
	
		for (int i=-1; i<=colaPQ.size();i++) { //por qué no le da 5 vueltas al bucle? 
			colaPQ.poll();                   //poll() elimina el nodo principal (primera posicion) y trae al ultimo nodo de la cola a la primera posicion?
			System.out.println(colaPQ);
			
		}
	}

}
