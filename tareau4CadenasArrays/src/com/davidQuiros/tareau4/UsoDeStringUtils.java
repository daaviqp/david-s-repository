package com.davidQuiros.tareau4;

import org.apache.commons.lang3.StringUtils;

public class UsoDeStringUtils {

	public static void main(String[] args) {
		/*
		 * capitalize El método capitalize convierte la primera letra de una cadena a
		 * mayúscula, dejando el resto de la cadena sin cambios.
		 */
		String cadena1 = "hola mundo";
		System.out.println(StringUtils.capitalize(cadena1));
		// resultado: "Hola mundo"

		/*
		 * reverse El método reverse invierte el orden de los caracteres en una cadena.
		 */
		String cadena2 = "abcd";
		System.out.println(StringUtils.reverse(cadena2));
		// resultado: "dcba"

		/*
		 * isNumeric El método isNumeric verifica si una cadena contiene solo caracteres
		 * numéricos.
		 */
		String cadena3 = "12345";
		String cadena4 = "123a45";
		System.out.println(StringUtils.isNumeric(cadena3));
		// resultado: true
		System.out.println(StringUtils.isNumeric(cadena4));
		// resultado: false

	}

}
