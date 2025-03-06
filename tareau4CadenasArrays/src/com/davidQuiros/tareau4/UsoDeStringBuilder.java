package com.davidQuiros.tareau4;

public class UsoDeStringBuilder {

	public static void main(String[] args) {

		// cadena de ejemplo
		String texto = "Este programa separa las vocales de las consonantes";

		// crear dos objetos StringBuilder para almacenar vocales y consonantes
		StringBuilder vocales = new StringBuilder();
		StringBuilder consonantes = new StringBuilder();

		// iterar a través de cada carácter en la cadena
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (esVocal(c)) {
				vocales.append(c);
			} else if (esConsonante(c)) {
				consonantes.append(c);
			}
		}

		// mostrar los resultados
		System.out.println("Vocales: " + vocales.toString());
		System.out.println("Consonantes: " + consonantes.toString());
	}

	// método para verificar si un carácter es una vocal
	private static boolean esVocal(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	// método para verificar si un carácter es una consonante
	private static boolean esConsonante(char c) {
		c = Character.toLowerCase(c);
		return c >= 'a' && c <= 'z' && !esVocal(c);
	}
}