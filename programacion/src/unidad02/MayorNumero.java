package unidad02;

import java.util.Scanner;

/**
 * Se introducen 3 números enteros por teclado y debe devolver el mayor de ellos.
 */
public class MayorNumero {

	public static void main(String[] args) {
		// Número mayor de los 3.
	Scanner scan = new Scanner(System.in);
	System.out.print("Introduzca el primer número: ");
	int numero1 = scan.nextInt();
	System.out.print("Introduzca el segundo número: ");
	int numero2 = scan.nextInt();
	System.out.print("Introduzca el tercer número: ");
	int numero3 = scan.nextInt();
	scan.close();
	
	// Cálculo del mayor número.
	int mayor;
	if (numero1 > numero2) {
		mayor = numero1;
		if (mayor < numero3) {
			mayor = numero3;
		}
	} else {
		mayor = numero2;
		if (mayor < numero3) {
			mayor = numero3;
		}
	
	}
	// Respuesta final.
	System.out.println("\nEl número mayor es: " + mayor);
	}

}
