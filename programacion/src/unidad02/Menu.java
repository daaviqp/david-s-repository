package unidad02;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		/**
		 *  ELIGE UNA OPCIÓN:
		 *   1. COMPRIMIR ARCIVO, 
		 *   2. ELIMINAR ARCHIVO, 
		 *   3. COPIAR ARCHIVO, 
		 *   4. CERRAR PROGRAMA.
		 */

		System.out.println("Tienes 4 opciones: "
				+ "1. COMPRIMIR ARCIVO, "
				+ "2. ELIMINAR ARCHIVO, "
				+ "3. COPIAR ARCHIVO, "
				+ "4. CERRAR PROGRAMA. ");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("¿Qué desea hacer con el programa? ");
		int operacion = scan.nextInt();

		
		// CON IF Y ELSE IF.
		/**		if (operacion == 1) {
			System.out.println("Has elegido copiar archivo");
		} else if (operacion == 2) {
			System.out.println("Has elegido eliminar archivo");
		} else if (operacion == 3) {
			System.out.println("Has elegido copiar archivo");
		} else if (operacion == 4) {
			System.out.println("Hasta la próxima!!");
		} else {
			System.err.println("Has elegido una opción incorrecta");
			scan.close();
*/

		// CON SWITCH.
		
	switch (operacion) {
case 1:
	System.out.println("Has elegido copiar archivo");
	break;
case 2:
	System.out.println("Has elegido eliminar archivo");
	break;
case 3:
	System.out.println("Has elegido copiar archivo");
	break;
case 4:
	System.out.println("Hasta la próxima!!");
	break;
	
default: System.err.println("Has elegido una opción incorrecta");
	break;
	

		}
		
		
	}

}
