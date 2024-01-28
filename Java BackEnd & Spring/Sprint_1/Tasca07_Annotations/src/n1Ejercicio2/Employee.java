package n1Ejercicio2;

import java.util.Date;

public class Employee {
	/*Afegeix a les classes filles alguns mètodes obsolets (deprecated), 
	 * i utilitza l’anotació corresponent. Invoca des d'una classe externa 
	 * els mètodes obsolets, suprimint mitjançant l'anotació corresponent els
	 *  “warnings” per ser obsolets.
	 */
	
	protected final String name;
	protected final String surname;
	protected float priceHour;
	
	public Employee (String name, String surname, float priceHour) {
		
		this.name =name;
		this.surname = surname;
		this.priceHour = priceHour;
		
	}
	
	
	public float estimateIncome(float numHours) {
		return numHours*this.priceHour;
		
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public float getPriceHour() {
		return priceHour;
	}

	public void setPriceHour(float priceHour) {
		this.priceHour = priceHour;
	}
	
	

}
