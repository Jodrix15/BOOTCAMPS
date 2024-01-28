package Test;

import n1Ejercicio1.Mes;


import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class n1Ejercicio1Test {
	
	public final Mes ms = new Mes();
	
	@Test
	public void sizeTest() {
		/*Verifica amb jUnit que la llista té 12 posicions, 
		 * que no és nul·la i que en la seva posició 8 conté el nom 'agost'*/
		
		Assert.assertEquals(12, ms.inicio().size());
		
		
		TreeSet<Mes> mes = ms.inicio();
		int i = 0;
		for (Mes month : mes) {
			i += 1;
			if (i == 8) {
				Assert.assertEquals("agosto", month.getName());
			}
			
		}
		
		Assert.assertNotNull(mes);
	}
}
