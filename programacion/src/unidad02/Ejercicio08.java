package unidad02;

import java.util.Scanner;

/**
 * Escribe un programa que ordene tres números enteros introducidos por 
teclado.
 */

public class Ejercicio08 {

	public static void main(String[] args) {
		// Scanner y entrada de datos.
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa ordena los números introducidos de menor a mayor.");
		System.out.println("Introduce el primer número: ");
		int numero1 = scan.nextInt();
		System.out.println("Introduce el primer número: ");
		int numero2 = scan.nextInt();
		System.out.println("Introduce el primer número: ");
		int numero3 = scan.nextInt();
		
		// cálculo del menor, mediano y mayor.
		int temp;
		if (numero1 > numero2) {
			temp = numero1;
			numero1 = numero2;
			numero2 = temp;
		}
		if (numero1 > numero3) {
			temp = numero1;
			numero1 = numero3;
		}
	}

}
