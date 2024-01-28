package n3Ejercicio1;

public class Generic {
	
	public <T> void firstMethod (Telephone obj) {
		System.out.println("Metodo limitado por Interfaz Telefono");
		obj.call();
		System.out.println("El metodo limitado por la interfaz Telefono, no puede llamar al metodo hacer fotos"
				+ "de la clase Smartphone");
	}
	public <T> void secondMethod(Smartphone obj) {
		System.out.println("\nMetodo limitado por Smartphone");
		obj.call();
		obj.takePhoto();
	}

}
