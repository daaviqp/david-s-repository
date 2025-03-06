package com.davidQuiros.tareau4;

import java.util.Arrays;

public class UtilesDeArrays {

	public static void main(String[] args) {

		// ejemplo de uso de sort
		Integer[] numeros = { 6, 0, 12312, 235 };
		Arrays.sort(numeros);
		System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

		// ejemplo de uso de binarySearch
		int indice = Arrays.binarySearch(numeros, 3);
		System.out.println("Índice de 3: " + indice);

		// ejemplo de uso de equals
		Integer[] otrosNumeros = { 1, 3, 5, 8 };
		boolean sonIguales = Arrays.equals(numeros, otrosNumeros);
		System.out.println("¿Son iguales? " + sonIguales);

		// ejemplo de uso de fill
		String[] nombres = new String[4];
		Arrays.fill(nombres, "holamundo");
		System.out.println("Arreglo relleno: " + Arrays.toString(nombres));

		// ejemplo de uso de copyOf
		String[] copiaNombres = Arrays.copyOf(nombres, 6);
		System.out.println("Copia del arreglo: " + Arrays.toString(copiaNombres));

		// ejemplo de uso de toString
		int[] numerosPrimitivos = { 12, 21, 33 };
		System.out.println("Arreglo en formato String: " + Arrays.toString(numerosPrimitivos));
	}
}
