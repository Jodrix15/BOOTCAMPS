package nivel3;

public class Butaca {
	
	private int numFila;
	private int numAsiento;
	private String nombrePersona;
	
	public Butaca() {}
	
	public Butaca(int nombre, int asiento, String nombrePersona) {
		
		this.numFila = nombre;
		this.numAsiento = asiento;
		this.nombrePersona = nombrePersona;
		
	}
	
	public boolean equals(int fila, int butaca) {
		
		boolean sonIguales = false;
		
		if(this.numFila == fila && this.numAsiento == butaca) {
			sonIguales = true;
		}
		
		return sonIguales;
		
	}
	
	public String toString() {
		
		return String.format("Fila: %d, Asiento: %d, Persona: %s", this.numFila, this.numAsiento, this.nombrePersona);
		
	}

	public int getNumFila() {
		return this.numFila;
	}


	public int getNumAsiento() {
		return this.numAsiento;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	
	
	
	
	
}
