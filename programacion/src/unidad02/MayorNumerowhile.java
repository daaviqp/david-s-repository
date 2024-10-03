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
			salir = true
			} else {
				int datoEntero = Integer.parseInt(dato);
				if (datoEntero > mayorNumero) {
					mayorNumero = datoEntero;
				}
			}
	} while (!salir)
	}
	System.out.println("El mayor número introducido es el " + mayorNumero);
	scan.close();

}
