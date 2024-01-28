package n1Ejercicio3;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Locale;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Directory {
	
	private File directory;
	
	public  Directory(String path) {
		
		this.directory = new File(path);
		
	}
	
	public void setDirectory(String path) {
		
		this.directory = new File(path);
	}
	
	public File getDirectory() {
		
		return this.directory;
	}
	
	
	public void checkDirectory(File file, MyFiles mf) {
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			
			if(files != null) {
				Arrays.sort(files, new Comparator<File>() {
					
					public int compare(File f1, File f2) {
						return f1.getName().compareToIgnoreCase(f2.getName());
					}
					
				});
				
				for(File f: files) {
					
					infoFile(f, mf);
					
					if(f.isDirectory()) {
						
						checkDirectory(f, mf);	
					}
				}		
			}else {
				System.out.println("Directorio vacio");
			}		
		}else {
			System.out.println("Error el directorio no existe");
		}
	}
	
	public void infoFile(File file, MyFiles mf) {
	
		Date date;
		String inf = "";
		
		try {
			date = new Date(file.lastModified());
			if (file.isDirectory()) {
				inf =file.getName() +" (D)\t"+date+"\n";
			}else {
				inf =file.getName() +" (F)\t"+date+"\n";
			}

			mf.writeFile(inf);
		} catch (Exception e) {
			System.out.println("Archivo no encontrado");
		}
		
		
	}

}