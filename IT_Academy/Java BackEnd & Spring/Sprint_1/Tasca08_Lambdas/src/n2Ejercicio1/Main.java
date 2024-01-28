package n2Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Carlos", "Jordi", "Ona", "Ana", "Ani"));
		
		List<String> namesFiltered = names.stream().filter( (s) -> s.startsWith("A") && s.length() < 4).collect(Collectors.toList());
		
		namesFiltered.forEach(System.out::println);

	}

}
