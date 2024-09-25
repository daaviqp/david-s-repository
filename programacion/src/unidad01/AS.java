package unidad01;

import java.util.Scanner;

public class AS {

	public static void main(String[] args) {
		//INTENTO DE REGLA DE TRES.
		System.out.println("Realicemos una regla de tres!");
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzca el valor a: ");
		double a = scan.nextDouble();
		System.out.print("Introduzca el valor b: ");
		double b = scan.nextDouble();
		System.out.print("Introduzca el valor c: ");
		double c = scan.nextDouble();
		double x = (b*c)/a;
		System.out.print("El resultado de la operación es " + x);
		scan.close();
							
	}

}
