package unidad02.boletin2;

import java.util.Scanner;

// Calcular el número de cifras de un número.

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Este programa muestra cuántas cifras tiene el número introducido.");
		System.out.println("Introduce un número: ");
		int numero = teclado.nextInt();
		teclado.close();
		int numeroActual = numero;
		int numCifras = 1;
		while (numeroActual/10 != 0); {
			numCifras++;
			numeroActual = numeroActual/10;
			
		}
		System.out.println("El número " + numero + " tiene " + numCifras + " cifras");
		
		/**
		Scanner teclado = new Scanner(System.in);
		System.out.println("Este programa calcula la cantidad de cifras de un número introducido por teclado.");
		System.out.print("Introduce un número entero:");
		int num = teclado.nextInt();
		teclado.close();
		int numActual = num;
		int numCifras = 1;
		while (numActual/10 != 0) {
			numCifras++;
			numActual = numActual/10;
		}
		System.out.println("El número " + num + " tiene " + numCifras + " cifras.");

		 */

	}

}
