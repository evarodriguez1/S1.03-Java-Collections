package n2ejercicio1;
import java.util.Random;

public class numRandom<Integer> implements Comparable<Integer> {

	//creamos un numero random en una clase comparable
	Random random = new Random();
	int num = 1 + random.nextInt(100);
			
			
			
	public int getNum() {
		return num;
	}

	
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "numRandom [num=" + num + "]";
	}
			
	@Override
	public int compareTo(Integer o) {   //usa un parametro generico
		// TODO Auto-generated method stub
		return 0;
	}

	
}
