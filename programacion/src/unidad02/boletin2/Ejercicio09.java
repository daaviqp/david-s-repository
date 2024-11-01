package unidad02.boletin2;

import java.util.Scanner;

/**
 * Escribe un programa que pinte una pirámide rellena con un carácter 
introducido por teclado que podrá ser una letra, un número o los símbolos 
como *, +, € o $. El programa debe permitir al usuario mediante un menú elegir 
si el vértice de la pirámide está apuntando hacia arriba, hacia abajo o hacia la 
derecha.
 */

// añadir acotaciones en los símbolos.
public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String caracter;
		String direccion;
		System.out.println("Introduce el carácter que quieres usar: (número, *, +, € o $.)");
		caracter = scan.next();
		System.out.println("""
				Introduce la dirección en la que quieres el triángulo:
				"Arriba"
				"Abajo"
				"Derecha"
				""");
		direccion = scan.next();
		if (direccion.equalsIgnoreCase("Arriba")) {
			System.out.println("  " + caracter + "  " + "\n" + " " + caracter + caracter + caracter + " " + "\n"
					+ caracter + caracter + caracter + caracter + caracter);
		}
		
		if (direccion.equalsIgnoreCase("Abajo")) {
			System.out.println("  " + caracter + "  " + "\n" + " " + caracter + caracter + caracter + " " + "\n"
					+ caracter + caracter + caracter + caracter + caracter);
		}
		
		if (direccion.equalsIgnoreCase("Derecha")) {
			System.out.println("  " + caracter + "  " + "\n" + " " + caracter + caracter + caracter + " " + "\n"
					+ caracter + caracter + caracter + caracter + caracter);
				
		}
	}

}
