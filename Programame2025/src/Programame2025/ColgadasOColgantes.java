package Programame2025;

//Esquema de la entrada: número de casos
import java.util.*;

public class ColgadasOColgantes {

	static Scanner in;

	public static void casoDePrueba() {

		// TU CÓDIGO AQUÍ.
		// Procesa un único caso leyendo con
		// in.next*()

		String colgantes = "colgantes";
		String colgadas = "colgadas";
		String prueba = in.next();
		if (prueba.toLowerCase().equals(colgadas)) {
			System.out.println("Bien");
		} else if (prueba.toLowerCase().equals(colgantes)) {
			System.out.println("Mal");
		}

	} // casoDePrueba

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();

	} // main

} // class Solution
