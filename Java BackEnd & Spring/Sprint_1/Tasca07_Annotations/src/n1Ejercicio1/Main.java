package n1Ejercicio1;

public class Main {

	public static void main(String[] args) {
		/*Crea una jerarquia d’objectes amb tres classes:  
		 * Treballador, TreballadorOnline i TreballadorPresencial.
		 * 

		Des del main() de la classe Principal, fes les invocacions necessàries 
		per demostrar el funcionament de l’anotació @Override.
		 */
		Entrada input = new Entrada();
		Employee worker = new Employee(input.llegirString("Nombre: "), 
				input.llegirString("Apellidos: "), 
				input.llegirFloat("Precio/hora: "));
		System.out.println("Salario clase Employee: " + worker.estimateIncome(input.llegirFloat("Horas trabajdas: ")));
		
		EmployeeOnline workerOnline = new EmployeeOnline(input.llegirString("\nNombre: "), 
				input.llegirString("Apellidos: "), 
				input.llegirFloat("Precio/hora: "), 
				input.llegirFloat("Precio tarifa: "));
		System.out.println("Salario clase EmployeeOnline: " + workerOnline.estimateIncome(input.llegirFloat("Horas trabajdas: ")));
		
		EmployeePresent workerPresent = new EmployeePresent(input.llegirString("\nNombre: "), 
				input.llegirString("Apellidos: "), 
				input.llegirFloat("Precio/hora: "));
		
		EmployeePresent.setPetrol(input.llegirFloat("Precio gasolina: "));
		System.out.println("Salario clase EmployeePresent: " + workerPresent.estimateIncome(input.llegirFloat("Horas trabajdas: ")));
		
		

	}

}
