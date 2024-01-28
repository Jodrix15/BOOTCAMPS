package n1Ejercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFiles {
	
	private String filePath;
	private boolean add;
	
	public MyFiles(String filePath, boolean add) {
		
		this.filePath = filePath;
		this.add= add;
	}
	
	public void writeFile(String inf) {
	
		try {
			FileWriter fw = new FileWriter(filePath, add);
			BufferedWriter writer = new BufferedWriter(fw);
			writer.write(inf);
			writer.close();
			
		}catch(IOException e) {
		
			System.out.println("Fichero no encontrado");
			
		}
		
	}

}
