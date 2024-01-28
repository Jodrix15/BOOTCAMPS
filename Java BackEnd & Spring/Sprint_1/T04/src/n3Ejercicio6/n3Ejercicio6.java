package n3Ejercicio6;

import java.util.ArrayList;

public class n3Ejercicio6 extends Exception {
	
	/*Provoca una ArrayIndexOutOfBoundsException 
	 * en una classe qualsevol. Crea una asserció 
	 * que validi que l'excepció és llançada quan correspon.
	 */
	public int getNum(int index) throws ArrayIndexOutOfBoundsException{
		ArrayList<Integer> listNum = new ArrayList<Integer>();
		listNum.add(3);
		listNum.add(6);
		listNum.add(2);
		listNum.add(9);
		listNum.add(7);
		
		
		if(index >= listNum.size()) {
			throw new ArrayIndexOutOfBoundsException("Error");
			
		}else return listNum.get(index);
	
	}
	

}
