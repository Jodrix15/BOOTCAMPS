package n1Ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		String filePath = "Resources";
		String file =  "Fichero.txt";
		
	
		Directory d = new Directory(filePath);
		MyFiles mf = new MyFiles(file, true);
		
		d.checkDirectory(d.getDirectory(), mf);

	}

}
