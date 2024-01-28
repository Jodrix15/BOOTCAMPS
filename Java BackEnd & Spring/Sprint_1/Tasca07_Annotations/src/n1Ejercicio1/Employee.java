package n1Ejercicio1;

public class Employee {
	
	/*La classe Treballador té els atributs nom, cognom, preu/hora, 
		 * i el mètode calcularSou() que rep per paràmetre el nombre d'hores 
		 * treballades i el multiplica pel preu/hora. Les classes filles l'han 
		 * de sobreescriure,  emprant @Override. */
	
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
