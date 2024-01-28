package nivel3;
import java.util.ArrayList;

public class GestionButacas {
	
	private ArrayList<Butaca> butacas;
	
	public GestionButacas () {
		this.butacas = new ArrayList<Butaca>();
	}
	
	public ArrayList<Butaca> getButacas() {
		
		return this.butacas;
		
	}
	
	public void aniadirButacas(Butaca b) throws ExcepcionButacaOcupada{
		
		if(buscarButaca(b.getNumFila(), b.getNumAsiento()) != -1) {
			throw new ExcepcionButacaOcupada("La butaca ingresada ya esta reservada");
			
		}else this.butacas.add(b); System.out.println("Butaca aniadida");

	}
	
	public void eliminarButaca(Butaca b) throws ExcepcionButacaLibre {
		
		int posButaca = buscarButaca(b.getNumFila(), b.getNumAsiento());
		if (posButaca == -1) {
			throw new ExcepcionButacaLibre("La butaca ingresada esta libre, por favor ingresa una butaca que este reservada");
			
		}else {
			this.butacas.remove(posButaca);
			System.out.println("Butaca eliminada");
		}
		
		
	}
	
	public int buscarButaca(int fila, int butaca) {
		
		int butacaEncontrada = -1;
		int index = 0;
		
		while (butacaEncontrada == -1 && index < this.butacas.size()) {
			if(this.butacas.get(index).equals(fila, butaca)) {
				butacaEncontrada = index;
			}
			index +=1;
		}
		
		return butacaEncontrada;
			
	}

}
