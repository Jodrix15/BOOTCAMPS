package n1Ejercicio2;

import java.util.Date;

public class EmployeeOnline extends Employee {
	
	
	private final float fee;
	
	
	public EmployeeOnline(String name, String surname, float priceHour, float fee) {
		super(name, surname, priceHour);
		this.fee = fee;
	}
	
	@Deprecated
	public String fullName() {
		return this.name + " " + this.surname;
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
