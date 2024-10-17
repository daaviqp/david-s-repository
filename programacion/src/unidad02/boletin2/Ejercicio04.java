package unidad02.boletin2;

import java.util.Scanner;

/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2+bx+c=0)
*/
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax2 + bx + c = 0");
		System.out.print("Introduzca el valor a: ");
		double a =scan.nextDouble();
		System.out.print("Introduzca el valor b: ");
		double b =scan.nextDouble();
		System.out.print("Introduzca el valor c: ");
		double c =scan.nextDouble();
		scan.close();
		if (a == 0 ) {
			System.err.print("El valor a no puede ser 0");
		} else if (Math.pow(b, 2) <= 4*a*c) {
			System.out.print("El valor b cuadrado debe ser mayor que 4*a*c");
			
		}else {
			double xp = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);		
			double xn = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);		
			System.out.print("Las soluciones son " + xp + " y " + xn);
		

	}

	}
}
