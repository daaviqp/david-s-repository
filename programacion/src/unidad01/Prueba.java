package unidad01;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// ESTO ES UNA PRUEBA.
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu nombre de usuario: ");
		String nombre = scan.nextLine();
		System.out.println("Bienvenid@ " + nombre + "!");
		scan.close();

	}

}
