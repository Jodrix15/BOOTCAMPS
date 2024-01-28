package n1Ejercicio2;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
	
		List<String> stringList = Arrays.asList(
				"Hola", "pescao", "patata", "pirata", "boniato");
		
		System.out.println(stringList.stream()
        .filter(s -> s.contains("o") && s.length() > 5)
        .collect(Collectors.toList()));

	}

}
