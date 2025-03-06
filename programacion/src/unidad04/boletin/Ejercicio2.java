package unidad04.boletin;

import java.util.Scanner;

/**
	 * Escribe un programa que lea 10 números por teclado y que luego los muestre 
	en orden inverso, es decir, el primero que se introduce es el último en 
	mostrarse y viceversa.
	 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeros[] = new int[4];
		for (int i= 0; i < numeros.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scan.nextInt();
		}
		
		//darle la vuelta al array
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
			
		scan.close();
	}

}
