package unidad02;

import java.util.Scanner;
/**
 * Resuelve una ecuación de segundo grado, recoge los datos a, b y c
 * ax2 + bx + c = 0
 */

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		// scanner y entrada de datos:
		System.out.println("Vamos a realizar una ecuación de segundo grado");
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el valor a: ");
		double a = scan.nextDouble();
		System.out.print("Introduce el valor b: ");
		double b = scan.nextDouble();
		System.out.print("Introduce el valor c: ");
		double c = scan.nextDouble();
		
		// operaciones:
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
