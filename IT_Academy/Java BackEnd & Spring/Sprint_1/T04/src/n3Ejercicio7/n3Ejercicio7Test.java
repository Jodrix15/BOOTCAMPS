package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class n3Ejercicio7Test {
	/*Crea un objecte Optional buit. 
	 * Escriu l'asserció correcta per a 
	 * verificar que efectivament està buit.
	 */

	@Test
	void test() {
		Optional<String> obj = Optional.empty();
		Assert.assertTrue(obj.isEmpty());
	}

}
