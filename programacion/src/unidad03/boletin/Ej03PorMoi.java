package unidad03.boletin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej03PorMoi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Introduzca el valor A: ");
			int A = scan.nextInt();
			System.out.println("Introduzca el valor B: ");
			int B = scan.nextInt();
			int resultado = A/B;
			System.out.println("El resultado de la operación es: " + resultado);
		} catch (ArithmeticException e) { //tira una excepción
			System.out.println("No se puede dividir entre 0");
	
}

	}

}
