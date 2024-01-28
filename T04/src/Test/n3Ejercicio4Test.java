package Test;

import java.time.temporal.ChronoUnit;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import n3Ejercicio4.n3Ejercicio4;

class n3Ejercicio4Test {
	/*Crea un arrayList contenidor de diversos tipus
	 *  d'objectes (crea'ls també). Escriu una asserció 
	 *  per a verificar l'ordre dels objectes en l'ArrayList 
	 *  segons han estat inserits.
	 *  Ara verifica que la llista anterior conté els objectes 
	 *  en qualsevol ordre.
		Verifica que, en la llista anterior, un dels objectes s'ha 
		afegit només una vegada. Deixa un dels elements sense afegir, 
		i verifica que la llista no conté aquest últim.
	 */
	
	
	n3Ejercicio4 ej = new n3Ejercicio4();
	
	@Test
	
	void testArrayAddSorted() {
		
		
		assertEquals(1, ej.crearArray().get(0));
		assertEquals(true, ej.crearArray().get(1));
		assertEquals(2.22f, ej.crearArray().get(2));
		assertEquals("Hola", ej.crearArray().get(3));
		assertEquals('h', ej.crearArray().get(4));
		

	}
	
	@Test
	void testArrayContainsObjectAnyOrder() {
		ArrayList<Object> listObj = ej.crearArray();
		ArrayList<Object> col = new ArrayList<Object>(Arrays.asList("Hola", 1, true, 'h', 2.22f));
		
		assertTrue(listObj.containsAll(col));
	}
	
	@Test
	void testArrayWithouDuplicate() {
		ArrayList<Object> listObj = ej.crearArray();
		boolean isDuplicated = false;
		
		for(int i = 0; i<listObj.size(); i++) {
			Object obj = listObj.get(i);
			
			for(int j = 0; j<listObj.size(); j++) {
				Object obj2 = listObj.get(j);
				
				if(i != j) {
					if(obj.equals(obj2)) {
						isDuplicated = true;
					}
					
				}
			}
			
		}
		assertTrue(isDuplicated==false);
	}
	
	@Test
	void testArrayNotContainsElement() {
		ArrayList<Object> listObj = ej.crearArray();
		assertFalse(listObj.contains(29));
		
	}

}
