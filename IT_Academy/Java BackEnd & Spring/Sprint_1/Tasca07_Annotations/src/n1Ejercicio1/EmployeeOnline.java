package n1Ejercicio1;

public class EmployeeOnline extends Employee {
	/*En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre 
		el nombre d'hores treballades al mes. A l'hora de calcular el sou es multiplicarà el 
		nombre d'hores treballades pel preu/hora i se li sumarà el preu de la tarifa plana 
		d'Internet, que serà una constant de la classe TreballadorOnline.*/
	
	private final float fee;
	
	public EmployeeOnline(String name, String surname, float priceHour, float fee) {
		super(name, surname, priceHour);
		this.fee = fee;
	}

	@Override
	public float estimateIncome(float numHours) {
		// TODO Auto-generated method stub
		return super.estimateIncome(numHours) + this.fee;
	}

	public float getFee() {
		return fee;
	}
	
	

}
