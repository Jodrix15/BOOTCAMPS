package n1Ejercicio3;
import java.util.ArrayList;

public class Array extends Exception{
	/*Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
	Verifica el seu correcte funcionament amb un test jUnit.*/
	
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
