package n1Ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//Falta que notifique al usuario que el archivo no existe si pone uno que no existe
		String filePath = "Resources";
		Scanner sc = new Scanner(System.in);
		System.out.print("Que fichero quieres leer? (no escribas la extension): ");
		String file =  sc.next() +".txt";
		
		Directory d = new Directory(filePath);
		MyFiles mf = new MyFiles(file, true);
		
		d.checkDirectory(d.getDirectory(), mf, true, file);
	
	}

}
