package unidad01;

import java.util.Scanner;

/*
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a medianoche.
 */
public class ParaMediaNoche {

	public static void main(String[] args) {
		// Declaración del objeto Scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("introduce la hora actual:");
		int hora = scan.nextInt();
		System.out.print("\nintroduce los minutos actuales:");
		int minutos = scan.nextInt();
		int horasParaMedianoche = (23 - hora);
		int minutosParaMedianoche = (60 - minutos);
		int segParaMedianoche = horasParaMedianoche * 3600 + minutosParaMedianoche * 60;
		System.out.println("\nQuedan " + segParaMedianoche + " segundos para media noche");
		scan.close();
		

	}

}
