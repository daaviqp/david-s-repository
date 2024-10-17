package unidad02.boletin2;

import java.util.Scanner;

/**
 * Realiza un minicuestionario con 5 preguntas tipo test sobre el módulo de 
programación. Cada pregunta acertada sumará dos puntos si se acierta y 
restará un punto si se falla. El programa mostrará al final la calificación 
obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan 
para ver qué tal andan de conocimientos.
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int puntuacion = 0;
		System.out.println("Esto es un minicuestionario de 5 preguntas tipo test. Cada pregunta acertada sumará dos puntos. Suerte!!");
		System.out.println("""
				1. ¿Qué es un algoritmo?
				a) Un lenguaje de programación.
				b) Un vonjunto de instrucciones para resolver un probelma.
				c) Un tipo de dato.
				d) Un error en el código
				""");
		System.out.print("Introduce la respuesta que creas que es correcta:");
		char respuesta1 = scan.next().charAt(0);
        if (respuesta1 == 'b') {
            puntuacion = +2;
        } else {
            puntuacion = 0;
        }
        System.out.println("""
				1. ¿Cuál de los siguientes es un lenguaje de programación orientado a objetos?
				a) HTML.
				b) CSS.
				c) Java.
				d) SQL.
				""");
        System.out.print("Introduce la respuesta que creas que es correcta:");
        char respuesta2 = scan.next().charAt(0);
        if (respuesta1 == 'c') {
        	puntuacion = +2;
        } else {
        	puntuacion = 0;
        }
        System.out.println("Tu calificación final es de " + puntuacion + " puntos");

		
	

	}

}
