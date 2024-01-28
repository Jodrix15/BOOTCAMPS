package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import n1Ejercicio3.Array;

class n3Ejercicio6Test {

	@Test
	void test() {
		
		Array arr = new Array();
		Exception e = Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> arr.getNum(10));
		assertEquals("Error" , e.getMessage());
				
	}

}
