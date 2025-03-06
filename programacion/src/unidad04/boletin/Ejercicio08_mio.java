package unidad04.boletin;

import java.util.Scanner;

/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 */
public class Ejercicio08_mio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeros[] = new int[8];
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce el número " + (i + 1) + ": ");
			numeros[i] = scan.nextInt();
		}

		System.out.println("\nResultado: ");
		for (int numero : numeros) {
			String paridad = (numero % 2 == 0) ? "par" : "impar"; // forma corta de hacer un if else
			System.out.println(numero + " es " + paridad);
		}

		scan.close();
	}

}
