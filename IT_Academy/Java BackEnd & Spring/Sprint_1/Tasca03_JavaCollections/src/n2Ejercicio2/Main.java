package n2Ejercicio2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import n2Ejercicio1.Entrada;
import n2Ejercicio1.Restaurante;

public class Main {

	public static void main(String[] args) {

		HashSet<Restaurante> restaurantes = new HashSet<>();
		ArrayList<Restaurante> r = new ArrayList<Restaurante>();
		Entrada ex = new Entrada();
		
		int opcion = 0;
		
		do {
			System.out.println("Del siguiente menu:\n ");
			menu();
			try {
				opcion = ex.llegirInt("\nElige una opcion: ");
				
				
				if (opcion == 1) {
					Restaurante restaurante = new Restaurante (ex.llegirString("Nombre del restaurante: "), ex.llegirInt("Puntuacion: "));
					introducirRestaurante(restaurante, restaurantes);
					
					
				}
				if (opcion == 2) {
					r = ordenarRestaurantes(restaurantes);
					mostrarRestaurantes(r);
				}
			}catch(Exception e) {
				System.out.println("Debes escribir un numero entero");
				
			}
			
		}while(opcion != 0);

	}
	
	public static void introducirRestaurante(Restaurante r, HashSet<Restaurante> restaurantes) {
		
		if(buscarRestaurante(r, restaurantes) == false) {
			restaurantes.add(r);
			System.out.println(String.format("El restaurante %s ha sido agregado\n", r.getName()));
			
		}else System.out.println(String.format("El restaurante %s con puntuacion %d ya se encuentra en la base de datos\n", r.getName(), r.getPoints()));
		
	}
	
	public static ArrayList<Restaurante> ordenarRestaurantes(HashSet<Restaurante> restaurantes) {
		
		ArrayList<Restaurante> r = new ArrayList<Restaurante>(restaurantes);
		
		Restaurante rAux;

		for (int i = 0; i<r.size(); i++) {
			for(int j=i+1; j<r.size(); j++) {
				
				if(r.get(i).getName().compareToIgnoreCase(r.get(j).getName()) > 0){
					rAux = r.get(j);
					r.set(j, r.get(i));
					r.set(i, rAux);

					}		
				}
	
			}
		
		for (int i = 0; i<r.size(); i++) {
			for(int j=i+1; j<r.size(); j++) {
				if (r.get(i).getName().equalsIgnoreCase(r.get(j).getName())){
					if(r.get(i).getPoints() < r.get(j).getPoints()) {
					rAux = r.get(i);
					r.set(i, r.get(j));
					r.set(j, rAux);
					}
				}
	
			}
		}
		
		return r;
	}
	
	public static boolean buscarRestaurante(Restaurante r, HashSet<Restaurante> restaurantes) {
		
		Iterator<Restaurante> it = restaurantes.iterator();
		boolean restauranteRegistrado = false;
		
		if (restaurantes.size() == 0) {
			restauranteRegistrado = false;
		}
		while (it.hasNext()) {
			if(r.equals(it.next())) {
				restauranteRegistrado = true;
			}
		}
		
		return restauranteRegistrado;
	}
	
	public static void mostrarRestaurantes(ArrayList<Restaurante>  restaurantes) {
		Iterator<Restaurante> it = restaurantes.iterator();
		while (it.hasNext()) {
			Restaurante r = it.next();
			System.out.println("Nombre: " + r.getName() + "\tPuntuacion: " + r.getPoints());
		}
		System.out.println();
	}
	
	public static void menu() {
		
		System.out.println("0. Salir\n"
				+ "1. Introducir Restaurante\n"
				+ "2. Mostrar Restaurantes");
	}

}