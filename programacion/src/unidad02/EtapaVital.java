package unidad02;

import java.util.Scanner;

/** Introduciendo un año de nacimiento, el programa dirá si el
 * bebé: 0-2 años
 * niñ@: 3-11 años
 * 
 */

public class EtapaVital {

	public static void main(String[] args) {
		// PROGRAMA EDAD.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce la edad del usuario");
		String  edad = scan.nextLine();
		if (!"".contains(edad));
		System.out.println("El usuario es un bebé");

	}

}
