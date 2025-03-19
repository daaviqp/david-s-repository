package Programame2025;

//Esquema de la entrada: caso de prueba que marca el final
import java.util.*;

public class AnillamientoEnLaAlbufera {

	static Scanner in;

	public static boolean casoDePrueba() {

		int numCasos = in.nextInt();

		if (numCasos == 0)
			return false;
		else {
			// CÓDIGO PRINCIPAL AQUÍ
			// Procesa un único caso leyendo con
			// in.next*()
			
			int totalAvesAnilladas = 0;
			for (int i = 0; i < numCasos; i++) {
				int avesCapturadas = in.nextInt();
				int avesYaAnilladas = in.nextInt();
				totalAvesAnilladas += avesCapturadas - avesYaAnilladas;
			}
			System.out.println(totalAvesAnilladas);
			return true;
		}

	} // casoDePrueba

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		while (casoDePrueba())
			;

	} // main

} // class Solution