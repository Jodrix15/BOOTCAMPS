package n1Ejercicio2;

public class EmployeePresent extends Employee {
	
	/*En els treballadors presencials, el mètode per calcular el seu sou, 
		rebrà per paràmetre el nombre d’hores treballades al mes. A l’hora de calcular 
		el sou es multiplicarà el nombre d’hores treballades pel preu/hora, més el valor
		 d'un atribut static anomenat benzina que afegirem en aquesta classe.*/
	
	public static float petrol;
	
	public EmployeePresent(String name, String surname, float priceHour) {
		super(name, surname, priceHour);
	}
	
	@Deprecated
	public String petrolStation() {
		return "gasolinera bonArea";
	}

	@Override
	public float estimateIncome(float numHours) {
		
		return super.estimateIncome(numHours) + this.petrol;
	}

	public static float getPetrol() {
		return petrol;
	}

	public static void setPetrol(float petrol) {
		EmployeePresent.petrol = petrol;
	}
	
	

}
