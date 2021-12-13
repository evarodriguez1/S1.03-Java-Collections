package n1ejercicio3;

public class TheHobbit {
	private String personaje[] = new String[10];
	private static int index  = 0;
	
	public TheHobbit() {
		personaje[0] = "Bilbo";
		personaje[1] = "Gollum";
		personaje[2] = "Galadriel";
		personaje[3] = "Gandalf";
		personaje[4] = "Gloin";
		personaje[5] = "Fili";
		personaje[6] = "Kili";
		personaje[7] = "Bombur";
		personaje[8] = "Saruman";
		personaje[9] = "Smaug";
	}
	
	  public String next() {
	        int temp=index;
	        index = index+1;
	        index = index % personaje.length;
	        return personaje[temp];
	    }
	
	  
}
