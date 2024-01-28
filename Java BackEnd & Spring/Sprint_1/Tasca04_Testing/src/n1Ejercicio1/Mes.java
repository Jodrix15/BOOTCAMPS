package n1Ejercicio1;

import java.util.Comparator;
import java.util.TreeSet;

public class Mes implements Comparator<Mes>{
	
	private String name;
	private int numMonth;
	
	public Mes() {}
	public Mes(int numMonth, String name) {
		this.name = name;
		this.numMonth = numMonth;
	}
	@Override
	public int compare(Mes o1, Mes o2) {
		
		int month1 = o1.getNumMonth();
		int month2 = o2.getNumMonth();
		
		int result = month1 - month2;
		
		return result;
	}
	
	public TreeSet<Mes> inicio() {
		Mes me = new Mes();
		TreeSet<Mes> monthsOrder = new TreeSet<Mes>(me);
		
		monthsOrder.add(new Mes(10, "octubre"));
		monthsOrder.add(new Mes(1, "enero"));
		monthsOrder.add(new Mes(2, "febrero"));
		monthsOrder.add(new Mes(3, "marzo"));
		monthsOrder.add(new Mes(4, "abril"));
		monthsOrder.add(new Mes(5, "mayo"));
		monthsOrder.add(new Mes(6, "junio"));
		monthsOrder.add(new Mes(7, "julio"));
		monthsOrder.add(new Mes(8, "agosto"));
		monthsOrder.add(new Mes(9, "septiembre"));
		monthsOrder.add(new Mes(11, "noviembre"));
		monthsOrder.add(new Mes(12, "diciembre"));
		
		for (Mes m : monthsOrder) {
			System.out.println(m.getName());
		}
		
		return monthsOrder;
	}
	
	public String getName() {
		return name;
	}
	public int getNumMonth() {
		return numMonth;
	}

	
	
	

}
