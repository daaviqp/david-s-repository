package unidad02.boletin2;

import java.util.Scanner;

/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule 
los segundos que faltan para llegar a la medianoche.
 */
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa nos dice cuántos segundos faltan para que sea media noche.");
		System.out.print("Introduce la hora actual: ");
		int hora = scan.nextInt();
		System.out.print("Introduce los minutos actuales: ");
		int minuto = scan.nextInt();
		int horasParaMediaNoche = (23 - hora);
		int minutosParaMediaNoche = (60 - minuto);
		int segundosParaMediaNoche = horasParaMediaNoche * 3600 + minutosParaMediaNoche *60;
		scan.close();
		System.out.println("Faltan " + segundosParaMediaNoche + " segundos para la media noche.");
		
		
		
	}

}
