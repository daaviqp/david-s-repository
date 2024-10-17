package unidad02.boletin2;

import java.util.Scanner;

/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde 
una altura h.
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa calcula el tiempo que tardará en caer un objeto desde una altura h.");
		System.out.print("Introduce el valor h: ");
		double h = scan.nextDouble();
		double g = 9.81;
		double t = Math.sqrt((2 * h) / g);
		scan.close();
		System.out.println("El tiempo que tarda el objeto es de " + t + " segundos.");

	}

}
