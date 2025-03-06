package unidad04.boletin;

import java.util.Scanner;

public class Ejercicio07vertical {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Arreglo para almacenar las temperaturas de los 12 meses
	        double[] temperaturas = new double[12];
	        String[] meses = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", 
	                          "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};

	        // Solicitar las temperaturas al usuario
	        for (int i = 0; i < 12; i++) {
	            System.out.print("Introduce la temperatura media de " + meses[i] + ": ");
	            temperaturas[i] = scanner.nextDouble();
	        }

	        // Calcular la escala del diagrama
	        double maxTemperatura = temperaturas[0];
	        for (double temp : temperaturas) {
	            if (temp > maxTemperatura) {
	                maxTemperatura = temp;
	            }
	        }

	        // Escalar las temperaturas para generar las alturas de las barras
	        int[] alturas = new int[12];
	        for (int i = 0; i < 12; i++) {
	            alturas[i] = (int) (temperaturas[i] / maxTemperatura * 20); // Escala a 20 filas
	        }

	        System.out.println("\nDiagrama de barras verticales (Temperaturas):\n");

	        // Dibujar las barras desde la parte superior
	        for (int nivel = 20; nivel > 0; nivel--) {
	            for (int i = 0; i < 12; i++) {
	                if (alturas[i] >= nivel) {
	                    System.out.print("  *  ");
	                } else {
	                    System.out.print("     ");
	                }
	            }
	            System.out.println(); // Salto de línea
	        }

	        // Dibujar los nombres de los meses
	        for (String mes : meses) {
	            System.out.printf("%-5s", mes);
	        }
	        System.out.println();

	        scanner.close();
	    }
	}


	


