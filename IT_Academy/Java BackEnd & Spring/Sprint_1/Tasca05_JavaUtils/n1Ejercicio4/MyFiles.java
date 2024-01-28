package n1Ejercicio4;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
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
	
	public void readFile(String path) {
		
		String cadena = "";
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			while (cadena != null) {
				cadena = br.readLine();

				if (cadena != null && !cadena.isEmpty()){
					System.out.println(cadena);
				}
			}
		}catch(IOException e) {
			System.out.println("Fichero no encontrado");
		}
		
	}

}
