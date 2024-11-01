package unidad02;

import java.util.Scanner;

/**
 * enunciado: elegir un carácter entre * + $ €
 * pedir cuántas veces se repiten (mínimo 3 y máximo 10)
 * AMPLIACIÓN: SACARLO VERTICAL: println. SACARLO HORIZONTAL: sólo print.
 */
public class EscribirSimbolos {
	

	public static void main(String[] args) {
		
		// TOMA DE DATOS. OPERACIONES DE ENTRADA Y SALIDA
		Scanner scan = new Scanner(System.in);
		boolean error = false;
		String simbolo = "";
		int repeticiones = 0;
		String direccion = "";
		do {
			
			// se ejecuta la primera vez
			// y se sigue ejecutando si es error
			
		System.out.println("Introduce el símbolo que quieres repetir (*, +, $, €)");
		simbolo = scan.nextLine();
		
		System.out.println("Introduce cuántas veces quieres repetirlo: ");
		repeticiones = scan.nextInt();
		
		System.out.println("Introduce en qué dirección lo quieres escribir (vertical y horizontal) ");
		scan.nextLine();
		direccion = scan.nextLine();
		if (!"*".equals(simbolo) && ! "+".equals(simbolo) && ! "$".equals(simbolo) && ! "€".equals(simbolo)) {
			//correcto
			error = true;
		}
		if (repeticiones < 3 || repeticiones > 10) { //las dos barras verticales significa "o"
			error = true;
		}
		if (!"vertical".equalsIgnoreCase(direccion) && ! "horizontal".equalsIgnoreCase(direccion))  {
			error = true;
		}
		// System.out.println("simbolo: " + simbolo + " - repeticiones: " + repeticiones + " - direccion: " + direccion);
		int indice = 0;
		while (indice < repeticiones && !error) {
		}
			if ("vertical".equalsIgnoreCase(direccion)) {
				System.out.println(simbolo);
			} else {
				System.out.println(simbolo);
				
			}
			
		} while (error);
		
		// procesado de datos
		indice = 0;
		while (indice < repeticiones && !error) {
			if ("vertical".equalsIgnoreCase(direccion)) {
				System.out.println(simbolo);
			} else {
				System.out.println(simbolo); 
			
			}
	
		}
	}
}	
		
		
	


