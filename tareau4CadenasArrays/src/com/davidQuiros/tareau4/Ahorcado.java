package com.davidQuiros.tareau4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
	private static final String[] PALABRAS = { "zanahoria", "mandarina", "limon", "aguacate", "patata", "espinaca",
			"fresa", "mango", "manzana", "coliflor" }; // palabras que el programa puede elegir
	private static final int MAX_INTENTOS = 5; // intentos máximos del jugador

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean jugar = true;

		// manú principal
		while (jugar) {
			System.out.println("\n--- Menú Principal ---");
			System.out.println("1.- Jugar");
			System.out.println("2.- Finalizar el juego");
			System.out.print("Elige una opción: ");
			int opcion = scan.nextInt();
			scan.nextLine(); // limpiar el buffer

			switch (opcion) {
			case 1:
				jugarAhorcado(scan); // llama al método que inicia el juego
				break;
			case 2:
				System.out.println("¡Gracias por jugar! Hasta luego.");
				jugar = false; // termina el bucle del menú principal
				break;
			default:
				System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
		}
	}

	private static void jugarAhorcado(Scanner sc) {
		String palabraSecreta = PALABRAS[new Random().nextInt(PALABRAS.length)];
		char[] estadoPalabra = new char[palabraSecreta.length()];
		Arrays.fill(estadoPalabra, '_'); // rellena con guines bajos
		int intentos = 0;
		boolean resuelto = false;

		while (intentos < MAX_INTENTOS && !resuelto) { // submenú
			System.out.println("\nPalabra: " + String.valueOf(estadoPalabra));
			System.out.println("Intentos restantes: " + (MAX_INTENTOS - intentos));
			System.out.println("L.- Probar letra");
			System.out.println("R.- Resolver palabra");
			System.out.println("S.- Salir");
			System.out.print("Elige una opción: ");
			char opcion = sc.nextLine().toUpperCase().charAt(0);

			switch (opcion) {
			case 'L': // si introduce L
				System.out.print("Introduce una letra: ");
				char letra = sc.nextLine().toLowerCase().charAt(0);
				if (palabraSecreta.indexOf(letra) >= 0) {
					actualizarEstado(palabraSecreta, estadoPalabra, letra);
					System.out.println("¡Muy bien! La letra está en la palabra.");
				} else {
					intentos++;
					System.out.println("La letra no está en la palabra.");
				}
				break;
			case 'R': // si introduce R
				System.out.print("Introduce la palabra completa: ");
				String intentoPalabra = sc.nextLine().toLowerCase();
				if (intentoPalabra.equals(palabraSecreta)) {
					resuelto = true;
					System.out.println("¡Enhorabuena! Has acertado la palabra.");
				} else {
					intentos++;
					System.out.println("Palabra incorrecta.");
				}
				break;
			case 'S': // si introduce S
				System.out.println("Volviendo al menú principal...");
				return;
			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
			}

			if (String.valueOf(estadoPalabra).equals(palabraSecreta)) { // si la palabra del usuario es correcta
				resuelto = true;
				System.out.println("¡Enhorabuena! Has descubierto la palabra.");
			}
		}

		if (!resuelto) {
			System.out.println("Has perdido. La palabra era: " + palabraSecreta); // si la palabra del usuario no es
																					// correcta
		}
	}

	private static void actualizarEstado(String palabraSecreta, char[] estadoPalabra, char letra) { // recorre la
																									// palabra secreta y
																									// actualiza
																									// estadoPalabra con
																									// las letras
																									// correctas
		for (int i = 0; i < palabraSecreta.length(); i++) {
			if (palabraSecreta.charAt(i) == letra) {
				estadoPalabra[i] = letra;
			}
		}
	}
}
