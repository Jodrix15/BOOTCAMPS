package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class n3Ejercicio3Test {
	/*Una asserció que indiqui que dos arrays d'enters són idèntics*/

	@Test
	void test() {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {1, 2, 3, 4, 5};
		
		Assert.assertArrayEquals(array1, array2);
	}

}
