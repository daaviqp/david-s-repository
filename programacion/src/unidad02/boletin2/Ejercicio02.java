package unidad02.boletin2;

import java.util.Scanner;

/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo 
ax+b=0).
Ejemplo 1:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 2
Ahora introduzca el valor de b: 1
x = -0.5
Ejemplo 2:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 0
Ahora introduzca el valor de b: 7
Esa ecuación no tiene solución real.
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa mresuelve ecuaciones de primer grado del tipo ax + b = 0.");
		System.out.print("Introduce el valor a: ");
		double a = scan.nextDouble();
		System.out.print("Introduce el valor b: ");
		double b = scan.nextDouble();
		double x = (-b/a);
		scan.close();
		System.out.println("x = " + x);

	}

}
