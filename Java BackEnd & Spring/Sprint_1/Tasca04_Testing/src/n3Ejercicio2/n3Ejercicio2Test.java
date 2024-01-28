package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class n3Ejercicio2Test {
	/*Una asserció que demostri que la 
	 * referència a un objecte és la mateixa que 
	 * una altra, i una altra que indiqui que és diferent
	 */

	@Test
	void testSameRefer() {
		Object obj = new Object();
		Object obj2 = obj;
		Assert.assertSame(obj, obj2);
	}
	
	@Test
	void testDiferentRefer() {
		Object obj = new Object();
		Object obj2 = new Object();
		Assert.assertNotSame(obj, obj2);
	}

}
