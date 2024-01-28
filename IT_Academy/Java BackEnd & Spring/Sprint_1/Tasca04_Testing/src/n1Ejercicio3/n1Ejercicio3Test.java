package Test;

import static org.junit.jupiter.api.Assertions.*;
import n1Ejercicio3.Array;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.lang.ArrayIndexOutOfBoundsException;

class n1Ejercicio3Test {

	@Test
	void test() {
		Array arr = new Array();
		Exception e = Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> arr.getNum(10));
		assertEquals("Error" , e.getMessage());
		
		
	}

}
