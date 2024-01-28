package n2Ejercicio2;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		nums.stream().map( (n) -> (n %2 == 0) ? "e"+n : "o"+n  ).forEach(System.out::println);

	}

}
