package unidad04.boletin;

import java.util.Scanner;

/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
 * un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 */

public class Ejercicio07_mio {

	public static void main(String[] args) {
		// recoger datos del teclado y almacenarlos en el array temperatura
		Scanner scan = new Scanner(System.in);
		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };
		float[] temperatura = new float[12];
		for (int i = 0; i < temperatura.length; i++) {
			System.out.printf("Temperatura media de %s: ", meses[i]);
			temperatura[i] = scan.nextFloat();
		}
		
		//recorrer el array meses y hacer el diagrama
		for (int i = 0; i < meses.length; i++) {
			String mes = meses[i];
			if (mes.length() > 7) {
				System.out.print(mes + "\t");
			} else {
				System.out.print(mes + "\t\t");
			}
			for (int j = 0; j < temperatura[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
