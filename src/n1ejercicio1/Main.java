package n1ejercicio1;
import java.util.*;

public class Main {

	public static void main(String[]args) {
		Month mes = new Month("name");
		ArrayList <Month> month = new ArrayList <Month> ();
		
		month.add(new Month("Enero"));
		month.add(new Month("Febrero"));
		month.add(new Month("Marzo"));
		month.add(new Month("Abril"));
		month.add(new Month("Mayo"));
		month.add(new Month("Junio"));
		month.add(new Month("Julio"));
		//month.add(new Month("Agosto"));
		month.add(new Month("Septiembre"));
		month.add(new Month("Octubre"));
		month.add(new Month("Noviembre"));
	
		month.add(7, new Month("Agosto"));
		
		for (Month meses:month) {
			System.out.println(meses.getName());
		}
	}
	
}
