package unidad03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Implementa un programa que pida dos valores int A y B utilizando un nextInt() 
 * (de Scanner), calcula A/B y muestra el resultado por pantalla. Se deberán tratar 
 * de forma independiente las dos posibles excepciones, InputMismatchException 
 * y ArithmeticException, mostrando un mensaje de error indicativo del error en 
 * cada caso. 
 * 
 * ESTO SE USA PARA ACOTAR LAS RESPUESTAS QUE SE PUEDEN DAR. EJECUTAR PARA ENTENDER.	
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Introduce A: ");
			int A = scan.nextInt();
			System.out.print("Introduce B: ");
			int B = scan.nextInt();
			int resultado = A / B;
			System.out.println("El resultado de la operación es " + resultado);
			scan.close();
			
			/*
			 * El try es lo que tiene que ejecutar, luego, el catch son las 
			 * excepciones que tiene.
			 */
			
		} catch (InputMismatchException e) { // EXCEPCIÓN
			System.out.println("Solo se permite introducir números enteros.");
		} catch (ArithmeticException e) { // EXCEPCIÓN
			System.out.println("No se puede dividir por 0.");
			
		}
		

	}

}
