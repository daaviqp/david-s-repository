package unidad02;

import java.util.Scanner;

/**
 * Devuelve el mayor número de los introducidos por teclado.
 * - Instrucción de parada. STOP.
 * o
 * - Indicar número de datos. -> for
 * o
 * - while.
 */
public class MayorNumerot {

	public static void main(String[] args) {
		// Opción A. Indicamos el número de datos aevaluar.
		// Declaración del scanner para obtener los datos por teclado.
		Scanner scan = new Scanner(System.in);
		// Petición al usuario de los datos de entrada que se introducen en la variable.
		System.out.print("Este programa devuelve el mayor de todos los números introducidos por teclado!!");
		System.out.print("Introduce el número de datos para calcular el máximo número: ");
		int numeroDeDatos = scan.nextInt();
		int mayorNumero = Integer.MIN_VALUE;
		// Ejecutamos tantas veces como datos deba introducir el usuario.
		for (int index = 0; index < numeroDeDatos;index++) {
		//for (int index = numeroDeDatos; index > 0; index--) {
			System.out.println("Introduce el dato número " + (index + 1));
			System.out.println("Recuerda que vas a introducir " + numeroDeDatos);
			int numActual = scan.nextInt();
			if (mayorNumero < numActual) {
				mayorNumero = numActual;
			}
			System.out.println("Te faltan " + (numeroDeDatos - index - 1) + " datos");
	}
	System.out.println("El mayor número introducido es el " + mayorNumero);
		
		
		
		
		
		// Opción B. Establecemos una instrucción de parada (hacerlo en casa).
		
		

	}

}
