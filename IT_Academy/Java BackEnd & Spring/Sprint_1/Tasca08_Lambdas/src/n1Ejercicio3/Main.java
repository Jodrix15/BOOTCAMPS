package n1Ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*Crea una llista amb els noms dels mesos de l’any. 
		 * Imprimeix tots els elements de la llista amb una lambda*/
		
		ArrayList<String> months = new ArrayList(Arrays.asList("Enero", "Febrero", "Marzo",
				"Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"));
		
		months.forEach((m) -> System.out.println(m));
		
		

	}

}


