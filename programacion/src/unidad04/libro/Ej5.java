package unidad04.libro;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeros[] = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scan.nextInt();
		}

		// encontrar el máximo y el mínimo
		int maximo = numeros[0];
		int minimo = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maximo) {
				maximo = numeros[i];
			}
			if (numeros[i] < minimo) {
				minimo = numeros[i];
			}
			
			//mostrar los números como máximo y mínimo
			System.out.println("\nNúmeros introducidos:");
			for (int numero : numeros) {
				if (numero == maximo) {
					System.out.println(numero + " (máximo)");
				} else if (numero == minimo) {
					System.out.println(numero + " (minimo)");
				} else {
					System.out.println(numero);
				}

			}
			scan.close();
		}

	}

}