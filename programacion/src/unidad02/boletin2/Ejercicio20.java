package unidad02.boletin2;

import java.util.Scanner;

/**
 * Escribe un programa que muestre los n primeros términos de la serie de 
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y el 
resto se calcula sumando los dos anteriores, por lo que tendríamos que los 
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
introducir por teclado.
 */
public class Ejercicio20 {

	public static void main(String[] args) {
		System.out.println("Este programa muestra los primeros x números de la serie de Fibonacci.");
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce cuántos números quieres que se muestren por pantalla: ");
		int n = scan.nextInt();
		scan.close();
		if (n == 1) {
			System.out.println("0");	
		} else if (n == 2){
			System.out.println("0, 1");
		} else {
			int f1 = 1;
			int f2 = 0;
			int nuevo = f2 + f1;
			String salida = "0, 1" + ", "+ nuevo;
			// COPIAR DEL GITHUB DEL PROFE
		}
			
				
			
		
		
	}

}
