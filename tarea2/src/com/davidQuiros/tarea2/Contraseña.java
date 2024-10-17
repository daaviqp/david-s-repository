package com.davidQuiros.tarea2;

import java.util.Scanner;

/**
 * Escribe un programa con una cadena de texto que contenga una contraseña 
cualquiera. Después se pedirá al usuario que introduzca la contraseña, con 3 
intentos. Cuando acierte mostrará un mensaje de éxito. Si excede el número de 
intentos, avisa del error y termina el programa.
 */

public class Contraseña {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String contrasenia = "usuario"; // Declaro yo cuál es la contraseña.
		int intentosPermitidos = 3; // Número de intentos permitidos.
		int intentos = 0; // Número de intento que lleva el usuario.
	boolean exito = false;
	do {
		System.out.print("Introduce la contraseña: ");
		String entrada = scan.nextLine();
		if (entrada.equals(contrasenia)) { // Comparamos la contraseña con lo que ha introducido el usuario.
			System.out.println("Éxito! Has introducido la contraseña correcta.");
			exito = true;
			break;
		} else {
			intentos++; // Si no acierta, sumamos un intento. Luego, lo restaremos al número de intentos permitidos.
			System.out.println("Contraseña incorrecta. Te quedan " + (intentosPermitidos - intentos) + " intentos.");
		}
		if (intentos >= intentosPermitidos) { // Si excede el número de intentos, el programa termina.
			System.err.println("Has excedido el número de intentos.");
			break;
		}
	
	} while (!exito);
	scan.close();
		
	
	}

}
