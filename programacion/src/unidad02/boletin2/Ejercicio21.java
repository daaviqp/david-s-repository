package unidad02.boletin2;

import java.util.Scanner;

/**
 * Escribe un programa que lea una lista de diez números y determine cuántos 
son positivos, y cuántos son negativos.

 */
public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una lista de diez números.");
		int positivos = 0;
		int negativos = 0;
		for (int numeros=10;numeros > 0;numeros--);
		System.out.print("Introduce un número (quedan " + numeros + ")");
		int numero = scan.nextInt();
		if (numero >= 0); {
			positivos++;
		} else {
			negativos--;
		}
		scan.close();
		System.out.printf("Has introducido %d números positivos y % d números negativos");
		
		}

	}


// copiar de github pq estoy hasta la misma polla
/**
 * Estructura del bucle for
for(int i = 0; // índice de control
    i < 100;   // condición booleana
    i++)      // modificación del índice tras cada bucle
{
  // Lo que quieras que se ejecute varias veces
}
*/