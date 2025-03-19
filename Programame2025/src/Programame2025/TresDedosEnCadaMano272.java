package Programame2025;

//Esquema de la entrada: número de casos
import java.util.*;

public class TresDedosEnCadaMano272 {

	static Scanner in;

	public static void casoDePrueba() {

		// TU CÓDIGO AQUÍ.
		// Procesa un único caso leyendo con
		// in.next*()

		int numeroBase10 = in.nextInt();
		int resto = numeroBase10;
		StringBuilder numeroBase6 = new StringBuilder();
		while (resto >= 6) {
			numeroBase6.append(resto % 6);
			resto = resto / 6;
		}
		numeroBase6.append(resto);
		System.out.println(numeroBase6.reverse());

	} // casoDePrueba

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();

	} // main

} // class Solution
