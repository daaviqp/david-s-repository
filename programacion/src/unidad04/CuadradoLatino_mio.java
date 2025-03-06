package unidad04;

import java.util.Scanner;

/**
 * Crear un cuadrado latino en Java
 * 
 * Un cuadrado latino de orden N es una matriz cuadrada de N filas y N columnas
 * en la que su primera fila contiene los N primeros números naturales y cada
 * una de las filas siguientes contiene la rotación de la fila anterior un lugar
 * a la derecha.
 * 
 * Por ejemplo, un cuadrado latino de orden 4 es una matriz cuadrada de tamaño 4
 * x 4 con el siguiente contenido:
 *
 * 
 * 1 2 3 4 4 1 2 3 3 4 1 2 2 3 4 1
 */
public class CuadradoLatino_mio {

	public static void main(String[] args) {
		// pedir datos y almacenarlos en el array
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce la dimensión del cuadrado: ");
		int n = scan.nextInt();
		int[][] dimension = new int[n][n];

		// recorro el cuadrado y recojo los valores que el usuario quiere en las filas
		for (int i = 0; i < n; i++) {
			System.out.print("Introduce el siguiente número de la fila: ");
			int numActual = scan.nextInt();
			dimension[0][i] = numActual;
		}

		// guardo el último número en una variable y muevo los demás uno a la derecha
		for (int j = 1; j < n; j++) {
			int numAux = dimension[j - 1][n - 1]; // guardar el último número en una variable
			for (int i = n - 1; i > 0; i--) {
				dimension[j][i] = dimension[j - 1][i - 1];
			}
			dimension[j][0] = numAux;
		}

		// recorro el cuadrado y muestro los valores
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(dimension[j][i] + "\n");
			}
			System.out.println("<");
		}

	}

}
