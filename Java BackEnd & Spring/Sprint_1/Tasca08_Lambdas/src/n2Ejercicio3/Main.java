package n2Ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		Lambda add = (a, b) -> a + b;
		Lambda subtraction = (a, b) -> a -b;
		Lambda multiplication = (a , b) -> a * b;
		Lambda division = (a, b) -> a/b;
		
		System.out.println(add.operacio(3, 4));
		System.out.println(subtraction.operacio(3, 4));
		System.out.println(multiplication.operacio(3, 4));
		System.out.println(division.operacio(3, 4));

	}

}
