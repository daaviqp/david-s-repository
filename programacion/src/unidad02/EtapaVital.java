package unidad02;

import java.util.Scanner;

/** Introduciendo un año de nacimiento, el programa dirá si el usuario es:
 * bebé: 0-2 años
 * niñ@: 3-11 años
 * 
 */

public class EtapaVital {

	public static void main(String[] args) {
		// PROGRAMA EDAD.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu año de nacimiento: ");
		int anio = scan.nextInt();
		int edad = 2024-anio;
		if (edad < 0) {
			System.err.println("No se puede introducir un año mayor al actual");
		} else if (edad <= 2) {
			System.out.println("Eres un bebé");
		} else if (edad <= 11) {
			System.out.println("Eres un niñ@");
		} else if (edad <= 18) {
			System.out.println("Eres un adolescente");
		} else if (edad <= 65) {
			System.out.println("Eres un adulto");
		} else if (edad <= 65) {
			System.out.println("Eres un anciano");
			scan.close();
		}
	
	}

}
