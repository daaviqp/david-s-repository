package Ejercicios;
/**
 * Este programa muestra el horario de una academia de inglés según la edad introducida.
 */
import java.util.Scanner;

public class AcademiaIngles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa muestra el horario que tiene su hijo/a.");
		System.out.print("Introduzca la edad de su hijo/a: ");
		int edad = scan.nextInt();
		scan.close();
		if (edad >= 4 && edad <= 6) {
			System.out.println("Lunes y Miércoles de 16:00 a 17:00");
			
		} else if (edad >= 7 && edad <= 8) {
			System.out.println("Martes y Jueves de 16:30 a 17:30");
			
		} else if (edad >=9 && edad <= 10) {
			System.out.println("Martes y Juevs de 17:30 a 19:00");

		} else if (edad >=11 && edad <= 13) {
			System.out.println("Lunes y Miércoles de 17:00 a 18:00");
			
		} else {
			System.err.println("No se ha introducido una edad adecuada.");
		}
	}

}
