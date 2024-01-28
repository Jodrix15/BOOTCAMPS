package nivel3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada /*extends Excepcion*/{

	public static Scanner input() {

		return new Scanner(System.in);
	}
	
	public static byte llegirByte(String msj) throws InputMismatchException {
		Object num;
		byte numCorrecto;
		System.out.print(msj);
		
		num = input().nextByte();

		/*if(!(num instanceof Byte)) {
			throw new InputMismatchException();
		}else {*/
			numCorrecto = (byte) num;
		//}
		
		
		return numCorrecto;
	}
	
	public static int llegirInt(String msj) throws InputMismatchException{
		Object obj;
		int num;
		
		System.out.print(msj);
		obj = input().nextInt();
		
		/*if(!(obj instanceof Integer)) {
			throw new InputMismatchException();
		}else {*/
			num = (int) obj;
		//}

		return num;
	}
	
	public static float llegirFloat(String msj) throws InputMismatchException{
		Object obj;
		float num;
		
		System.out.print(msj);
		obj = input().nextFloat();
		
		/*if(!(obj instanceof Float)) {
			throw new InputMismatchException();
		}else {*/
			num = (float) obj;
		//}

		return num;
		
	}
	
	public static double llegirDouble(String msj) throws InputMismatchException{
		Object obj;
		double num;
		
		System.out.print(msj);
		obj = input().nextDouble();
		
		/*if(!(obj instanceof Double)) {
			throw new InputMismatchException();
		}else {*/
			num = (double) obj;
		//}

		return num;
	}
	
	public static char llegirChar(String msj) throws Exception {
		Object obj;
		char ch;
		
		System.out.print(msj);
		obj = input().next();
		
		if(!(obj instanceof String) || obj.toString().length() > 1) {
			throw new Exception();
		}else {
			ch = obj.toString().charAt(0);
		}

		return ch;
	}
	
	public static String llegirString(String msj) {
	
		System.out.print(msj);
		String texto = input().nextLine();

		return texto;
	}
	
	public static boolean llegirSiNo(String msj) throws Exception{
		
		Object obj;
		char ch;
		boolean chrCorrecto = false;
		
		System.out.print(msj);
		obj = input().next();
		
		
		if(!(obj instanceof String) || 
				obj.toString().length() > 1 || 
				((!(obj.toString().equalsIgnoreCase("s")) && !(obj.toString().equalsIgnoreCase("n"))))) {
			throw new Exception();
		}else {
			ch = obj.toString().charAt(0);
			if(ch == 's') {
				chrCorrecto = true;
			}else chrCorrecto =false;
		}
		System.out.println(chrCorrecto);

		return chrCorrecto;
	}

}
