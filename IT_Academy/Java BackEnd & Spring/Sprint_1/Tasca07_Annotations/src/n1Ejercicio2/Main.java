package n1Ejercicio2;



public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		Entrada input = new Entrada();
		Employee worker = new Employee(input.llegirString("Nombre: "), 
				input.llegirString("Apellidos: "), 
				input.llegirFloat("Precio/hora: "));
		
		
		EmployeeOnline workerOnline = new EmployeeOnline(input.llegirString("\nNombre: "), 
				input.llegirString("Apellidos: "), 
				input.llegirFloat("Precio/hora: "), 
				input.llegirFloat("Precio tarifa: "));
		
		
		EmployeePresent workerPresent = new EmployeePresent(input.llegirString("\nNombre: "), 
				input.llegirString("Apellidos: "), 
				input.llegirFloat("Precio/hora: "));
		
		
		System.out.println();
		System.out.println(workerOnline.fullName());
		System.out.println(workerPresent.petrolStation());
		
		
		

	}

}
