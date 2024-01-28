package n1Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*Fer la mateixa impressió del punt anterior, però mitjançant method reference*/
		
		ArrayList<String> months = new ArrayList(Arrays.asList("Enero", "Febrero", "Marzo",
				"Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"));
		
		months.forEach(System.out::println);

	}

}
