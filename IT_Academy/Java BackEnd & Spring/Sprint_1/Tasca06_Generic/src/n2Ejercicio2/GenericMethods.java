package n2Ejercicio2;

import java.util.ArrayList;

public class GenericMethods {
	
	public <T> void showAttributes(T...obj1){
		for (T ob : obj1) {
			System.out.println(ob);
		}
	}

}