package unidad02;

import java.util.Scanner;

public class Capicúa {

	public static void main(String[] args) {
		// Comprobar si un número es capicúa (se lee igual al derecho que al revés)
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa muestra si el número introducido es capicúa.");
		System.out.print("Introduce el número que quieres comprobar: ");
		long numero = scan.nextLong();
		long numeroActual = numero;
		int numCifras = 1;
		while (numeroActual/10 !=0) {
			numCifras++;
			numeroActual = numeroActual / 10;			
			
		}
		
		for (int i = 0;;i++) {
			
		}
				

	}

}
