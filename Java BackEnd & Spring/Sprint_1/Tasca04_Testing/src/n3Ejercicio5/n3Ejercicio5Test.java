package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class n3Ejercicio5Test {
	/*Crea un map i verifica que conté una de les key que li afegeix.*/

	@Test
	void test() {
		HashMap<Integer, String> pokemon = new HashMap<Integer, String>();
		pokemon.put(1, "Bulbasaur");
		pokemon.put(2, "Ivysaur");
		pokemon.put(3, "Venusaur");
		pokemon.put(4, "Charmander");
		pokemon.put(5, "Charmeleon");
		
		Assert.assertTrue(pokemon.containsKey(1));

	}

}
