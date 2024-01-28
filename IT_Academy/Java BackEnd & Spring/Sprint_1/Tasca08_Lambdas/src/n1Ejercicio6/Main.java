package n1Ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		/*Crea una llista amb nombres i cadenes de 
		 * text i ordena la llista amb les cadenes de més 
		 * curta a més llarga.
		 */
		
		ArrayList<String> stringNums = new ArrayList(Arrays.asList("un", "dos", "tres",
				"quatre", "catorze", "quinze", "cinquanta"));
		
		Collections.sort(stringNums, (x, y) -> x.length() - y.length());;
		stringNums.forEach(System.out::println);

	}

}
