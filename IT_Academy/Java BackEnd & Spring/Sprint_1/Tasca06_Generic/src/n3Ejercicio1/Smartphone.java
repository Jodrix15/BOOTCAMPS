package n3Ejercicio1;

public class Smartphone implements Telephone{
	
	public void takePhoto() {
		System.out.println("Hago una foto");
	}

	@Override
	public void call() {
		System.out.println("Hago una llamada");
		
	}
	
	

}
