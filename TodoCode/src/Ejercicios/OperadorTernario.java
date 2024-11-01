package Ejercicios;

import java.util.Scanner;
/*
 * Programa que dependiendo del promedio de un alumno, nos diga si aprobó
 * o no la asignatura.
 */
public class OperadorTernario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double promedio;
		String condicionFinal;		
		System.out.print("Introduce el promedio del alumno: ");
		promedio = scan.nextDouble();
		scan.close();
		condicionFinal = (promedio >= 5) ? "Aprobado" : "Suspenso";
		System.out.println(condicionFinal);

	}

}
