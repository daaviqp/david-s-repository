package unidad04;

import java.util.Scanner;

public class solution2 {
	static Scanner in;

	public static void casoDePrueba() {
		int dia = in.nextInt();
		int mes = in.nextInt();// 9
		int diasrestantes = 0;
		for (int mesActual = mes; mesActual <= 12; mesActual++) {

			if (mesActual == 12 || mesActual == 10 || mesActual == 8 || mesActual == 7 || mesActual == 5 || mesActual == 3 || mesActual == 1) {
				if (mesActual == mes) {
					diasrestantes += 31 - dia;
				} else {
					diasrestantes += 31;
				}
			} else if (mesActual == 2) {
				if (mesActual == mes) {
					diasrestantes += 28 - dia;
				} else {
					diasrestantes += 28;
				}
			} else {
				if (mesActual == mes) {
					diasrestantes += 30 - dia;
				} else {
					diasrestantes += 30;
				}
			}

		}
		System.out.println(diasrestantes);

		// TU CÓDIGO AQUÍ.
		// Procesa un único caso leyendo con
		// in.next*()

	} // casoDePrueba

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();

	} // main

}
