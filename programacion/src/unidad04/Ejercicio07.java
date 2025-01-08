package unidad04;

import java.util.Scanner;

/*
 * 7. Realiza un programa que pida la temperatura media que ha hecho en cada mes 
de un determinado año y que muestre a continuación un diagrama de barras 
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base 
de asteriscos o cualquier otro carácter. 
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Nombre de los meses.
		String[] meses = {
	            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
	            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
	        };
		
		// Arreglo para almacenar las temperaturas.
        float[] temperaturas = new float[12];

        // Solicitar temperaturas medias de cada mes.
        System.out.println("Introduce la temperatura media (con decimales) para cada mes del año:");
        for (int i = 0; i < meses.length; i++) {
            System.out.print(meses[i] + ": ");
            temperaturas[i] = scan.nextFloat();
        }
        
        // Mostrar el diagrama de barras
        System.out.println("\nDiagrama de barras:");
        for (int i = 0; i < meses.length; i++) {
            System.out.printf("%-10s: ", meses[i]);
            int asteriscos = (int) temperaturas[i]; // Convertir temperatura a entero para dibujar las barras.
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            System.out.printf(" (%.1f°C)%n", temperaturas[i]); // Mostrar temperatura con 1 decimal.
        }

        scan.close();

	}

}
