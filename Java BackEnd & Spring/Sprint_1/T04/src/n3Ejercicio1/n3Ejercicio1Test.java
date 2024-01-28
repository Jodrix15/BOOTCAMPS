package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class n3Ejercicio1Test {
	/*Una asserció que demostri que 
	 * el valor de dos objectes sencers 
	 * és igual, i una altra que indiqui que no ho és.
	 */
	
	@Test
	void testEqualObjects() {
		Object entero = 2;
		Object entero2 = 2;
		
		Assert.assertEquals(entero, entero2);
	}
	
	@Test
	void testNotEqualObjects() {
		Object entero = 1;
		Object entero2 = 2;
		
		Assert.assertNotEquals(entero, entero2);
	}

}
