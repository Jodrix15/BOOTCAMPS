package n1Ejercicio5;

import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		Pokemon pkmn = new Pokemon("Growlithe", 58);

		try {
			ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("pkmn.ser"));
			
			file.writeObject(pkmn);
			file.close();
			
			ObjectInputStream fileRecover = new ObjectInputStream (new FileInputStream("pkmn.ser"));
			Pokemon pkmnRecover = (Pokemon) fileRecover.readObject();
			fileRecover.close();
			
			System.out.println(pkmnRecover);
			
			
		}catch(Exception e) {
			
		}
	}

}
