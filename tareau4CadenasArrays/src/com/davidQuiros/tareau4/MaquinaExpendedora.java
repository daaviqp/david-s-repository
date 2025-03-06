package com.davidQuiros.tareau4;

import java.util.Arrays;
import java.util.Scanner;

public class MaquinaExpendedora {

	// Definir los productos y las unidades disponibles
	static String[][] productos = { { "Coca-Cola", "Sprite", "Fanta naranja" },
			{ "Fanta limón", "Red Bull", "Monster" }, { "Pepsi", "Schweppes tónica", "Agua mineral" },
			{ "Cruzcampo", "Heineken", "Zumo de piña" } };

	static Integer[][] unidades = new Integer[4][3];

	static int ventasTotales = 0; // total de ventas realizadas

	public static void main(String[] args) {

		for (int i = 0; i < unidades.length; i++) {
			Arrays.fill(unidades[i], 5); // inicializar el array con 5 productos por cada hueco
		}

		Scanner scanner = new Scanner(System.in);
		boolean maquinaActiva = true;

		while (maquinaActiva) {
			// mostrar menú principal
			System.out.println("\nMenú:");
			System.out.println("1. Pedir bebida");
			System.out.println("2. Mostrar bebidas disponibles");
			System.out.println("3. Apagar máquina");
			System.out.print("Elija una opción: ");
			int opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				pedirBebida(scanner);
				break;
			case 2:
				mostrarBebidasDisponibles();
				break;
			case 3:
				apagarMaquina();
				maquinaActiva = false;
				break;
			default:
				System.out.println("Opción no válida. Por favor, elija nuevamente.");
			}
		}

		scanner.close();
	}

	// pedir una bebida
	private static void pedirBebida(Scanner scanner) {
		System.out.print("\nIngrese el código de la bebida (por ejemplo, 41 para fila 4, columna 1): ");
		int codigo = scanner.nextInt();

		// validación del código
		if (codigo < 11 || codigo > 44) {
			System.out.println("Código no válido. Debe estar entre 11 y 44.");
			return;
		}

		int fila = (codigo / 10) - 1;
		int columna = (codigo % 10) - 1;

		// verificar si hay unidades disponibles
		if (unidades[fila][columna] > 0) {
			unidades[fila][columna]--;
			ventasTotales++;
			System.out.println("¡Has comprado " + productos[fila][columna] + "!");
		} else {
			System.out.println("No quedan más " + productos[fila][columna] + " disponibles.");
		}
	}

	// mostrar las bebidas disponibles
	private static void mostrarBebidasDisponibles() {
		StringBuilder mensaje = new StringBuilder("\nBebidas disponibles:\n");

		for (int i = 0; i < productos.length; i++) {
			for (int j = 0; j < productos[i].length; j++) {
				if (unidades[i][j] > 0) {
					mensaje.append("Código: ").append(i + 1).append(j + 1).append(" - ").append(productos[i][j])
							.append("\n");
				}
			}
		}

		if (mensaje.length() == 24) { // no hay bebidas disponibles
			mensaje.append("No hay bebidas disponibles.");
		}

		System.out.println(mensaje.toString());
	}

	// apagar la máquina y mostrar las ventas totales
	private static void apagarMaquina() {
		System.out.println("\nMáquina apagándose...");
		System.out.println("Ventas totales: " + ventasTotales);
	}
}
