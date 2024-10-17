package unidad02.boletin2;

import java.util.Scanner;

/**
 * Escribe un programa que pida por teclado un día de la semana (Lunes, martes...) y que diga 
 * qué asignatura toca a primera esa hora.
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		final String LUN = "Lunes";
		final String MAR = "Martes";
		final String MIE = "Miércoles";
		final String JUE = "Jueves";
		final String VIE = "Viernes";
		final String SAB = "Sábado";
		final String DOM = "Domingo";
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa muestra la asignatura que toca a primera hora el día que se haya introducido.");
		String diaSemana = "";
		System.out.print("Introdue el día de la semana del que quieras saber el horario: ");
		scan.next();
		diaSemana = diaSemana.toLowerCase();
		switch (diaSemana) {
		case LUN:
			if (diaSemana == "Lunes"){
				System.out.println("A primera toca Entornos de desarrollo");
			}
			break;

		default:
			break;
		}
		

	}

}
