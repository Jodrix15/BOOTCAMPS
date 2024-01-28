package n1Ejercicio8;

public class Main {

	public static void main(String[] args) {
		/*Crea una Functional Interface que contingui 
		 * un mètode anomenat reverse(). Aquest mètode 
		 * ha de rebre i ha de retornar un String. En el 
		 * main() de la classe principal, injecta a la 
		 * interfície creada mitjançant una lambda, el cos 
		 * del mètode, de manera que torni la mateixa cadena 
		 * que rep com a paràmetre però al revés. Invoca la instància 
		 * de la interfície passant-li una cadena i comprova si el 
		 * resultat és correcte.
		 */
		
		LambdaReverse stringReverse = (s) -> {
			String sRev = "";
			for(int i = s.length() -1; i >=0; i--) {
				sRev += s.charAt(i);
			}
			return sRev;
		};
		
		System.out.println(stringReverse.reverse("Hola"));

	}

}
