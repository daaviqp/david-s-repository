package Programame2025;

//Esquema de la entrada: caso de prueba que marca el final
import java.util.*;

public class NinotsIndultados765 {

	static Scanner in;

	public static boolean casoDePrueba() {

		int cantidadVotaciones = in.nextInt();

		if (cantidadVotaciones == 0)
			return false;
		else {
			// CÓDIGO PRINCIPAL AQUÍ
			// Procesa un único caso leyendo con
			// in.next*()
			for (int i = 0; i < cantidadVotaciones; i++) {
				String ninotVotado = in.next();
			}

			return true;
		}

	} // casoDePrueba

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		while (casoDePrueba())
			;

	} // main

} // class Solution
