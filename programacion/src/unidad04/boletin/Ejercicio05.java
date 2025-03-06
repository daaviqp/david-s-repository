package unidad04.boletin;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[15];
		for (int i = 0; i < 15; i++) {
			System.out.println("Introduce un número:");
			numeros[i] = scan.nextInt();
			
		
		}
		//rotar
		int primero = numeros[numeros.length - 1];
		for (int i = numeros.length - 2; i>=0; i--) {
			numeros[i] = numeros[i = 1];
		
		}
		
		

	}

}
