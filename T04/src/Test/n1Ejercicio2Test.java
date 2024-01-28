package Test;


import static org.junit.jupiter.api.Assertions.*;
import n1Ejercicio2.DniLetter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class n1Ejercicio2Test {
	
	DniLetter chr = new DniLetter();

	@ParameterizedTest
	@CsvSource({
        "12345678, Z",
        "98765432, M",
        "11122333, Q",
        "44556677, L",
        "11223344, B",
        "99988877, B",
        "65432198, G",
        "77777777, B",
        "88888888, Y",
        "66666666, Q"
	})
	
	void dniTest(int num, char letter) {
		assertEquals(letter, chr.letterDni(num));
		
	}

}
