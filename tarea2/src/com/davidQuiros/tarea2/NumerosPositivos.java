package com.davidQuiros.tarea2;

import java.util.Scanner;

/**
 * Pedir números positivos al usuario hasta que el usuario introduzca un 0. Al 
terminar, mostrará lo siguiente:
1 mayor número introducido
2 menor número introducido
3 suma de todos los números
4 media aritmética de todos los números
El número 0 no contara como número introducido
 */

public class NumerosPositivos {

	public static void main(String[] args) { // Decalaro todas las variables que voy a usar.
		Scanner scan = new Scanner(System.in);
		int numero;
		int mayorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;
		int suma = 0;
		int contador = 0;
		
		System.out.println("Introduce números positivos (Introduce 0 para terminar): ");
		
		while (true) { // Si el número es 0, se muestran los resultados y acaba el programa.
			numero = scan.nextInt();
			if (numero == 0) {
				System.out.println("Aquí están tus resultados. ¡Hasta la próxima!");
				break;
			}
			
			if (numero > 0) { // Si el número es mayor que 0, se guarda, a su vez, si se registra un número mayor que el que ya se ha introducido, se guarda el mayor.
				if (numero > mayorNumero) {
					mayorNumero = numero;
				}
				
				if (numero < menorNumero) { // Pasa aquí lo mismo que con el mayor, pero a la inversa.
					menorNumero = numero;
					
				}
				
				suma += numero; // Se van sumando los números introducidos por la consola para mostrarlos al final.
				contador++;
				
			} else {
				System.err.println("Error. Introduce sólo números positivos.");
			}
		}
		
		if (contador > 0) {
			double media = (double) suma / contador; // Ecuación para calcular la media aritmética.
			System.out.println("El mayor número introducido es " + mayorNumero);
			System.out.println("El menor número introducido es " + menorNumero);
			System.out.println("La suma de todos los números da " + suma);
			System.out.println("La media aritmética de los números introducidos es " + media);
		
		} else {
			System.out.println("No se introdujeron números positivos.");
		}
		scan.close();
	}

}
