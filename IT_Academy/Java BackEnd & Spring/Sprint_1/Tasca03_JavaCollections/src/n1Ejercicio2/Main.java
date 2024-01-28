package n1Ejercicio2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		
		List<Integer> listaNum = new LinkedList<Integer>();
		listaNum.add(1);
		listaNum.add(2);
		listaNum.add(3);
		listaNum.add(4);
		listaNum.add(5);
		List<Integer> listaNumInversa = new ArrayList<Integer>();
		
		
		ListIterator<Integer> it = listaNum.listIterator(listaNum.size());
		
		System.out.println("Imprimimos el orden de la lista original: \n");
		for (Integer i : listaNum) {
			System.out.println(i);
		}
		while(it.hasPrevious()) {
			listaNumInversa.add(it.previous());
			
		}
		
		System.out.println("\nImprimimos la lista Invertida: \n");
		
		for (Integer i : listaNumInversa) {
			System.out.println(i);
		}

	}

}
