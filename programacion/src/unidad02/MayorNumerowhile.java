package unidad02;

import java.util.Scanner;

public class MayorNumerowhile {

	public static void main(String[] args) {
		// CON WHILE.
		
		
		Scanner scan = new Scanner(System.in);
		// Petición al usuario de los datos de entrada que se introducen en la variable.
		System.out.print("Este programa devuelve el mayor de todos los números introducidos por teclado!!");
		System.out.print("Introduce \"STOP\" cuando quieras parar de introducirnúmeros");
		int numeroDeDatos = scan.nextInt();
		int mayorNumero = Integer.MIN_VALUE;
		// Ejecutamos tantas veces como datos deba introducir el usuario.
		String dato = "";
		boolean salir = false;
		do {
			System.out.println("Introduce un entero: ");
			dato = scan.nextLine();
			salir = "STOP".equalsIgnoreCase(dato) ? true : false;
			} while (!salir);
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
	scan.close();

	
	
	
	
	while (condicion) {
	}

}
