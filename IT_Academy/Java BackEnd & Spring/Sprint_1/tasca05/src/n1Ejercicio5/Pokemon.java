package n1Ejercicio5;

import java.io.Serializable;

public class Pokemon implements Serializable {
	
	private String name;
	private int ID;
	
	public Pokemon (String name, int ID) {
		this.name = name;
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", ID=" + ID + "]";
	}
	
	

}
