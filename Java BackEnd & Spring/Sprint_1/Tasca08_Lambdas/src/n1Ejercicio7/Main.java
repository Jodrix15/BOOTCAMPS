package n1Ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		/*Amb la llista de l’exercici anterior, 
		 * ara ordena-la al revés, de cadena més 
		 * llarga a més curta
		 */
		
		ArrayList<String> stringNums = new ArrayList(Arrays.asList("un", "dos", "tres",
				"quatre", "catorze", "quinze", "cinquanta"));
		
		Collections.sort(stringNums, (x, y) -> x.length() - y.length());
		Collections.reverse(stringNums);
		stringNums.forEach(System.out::println);

	}

}
