package n1Ejercicio1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		List<String> stringList = Arrays.asList(
				"Hola", "pescao", "patata", "pirata", "boniato");
		
		
		stringList.stream().filter(name-> name.contains("o")).forEach(System.out::println);;
		
		
	}
	

}
