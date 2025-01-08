package cap1;

import java.util.Scanner;
/**
 * Un economista nos ha encargado un programa para realizar cálculos con el IVA. La
 * aplicación debe solicitar la base imponible y el IVA a aplicar. Debemos mostrar en
 * pantalla el importe correspondiente de IVA y el total.
 */
public class ej1 {

	public static void main(String[] args) {		
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la base imponible al usuario
        System.out.print("Introduce la base imponible (en euros): ");
        double baseImponible = scanner.nextDouble();

        // Solicitar el IVA al usuario
        System.out.print("Introduce el IVA a aplicar (en porcentaje, por ejemplo 21 para 21%): ");
        double tasaIVA = scanner.nextDouble();

        // Calcular el importe del IVA
        double importeIVA = baseImponible * (tasaIVA / 100);

        // Calcular el total con IVA
        double totalConIVA = baseImponible + importeIVA;

        // Mostrar los resultados
        System.out.println("\n--- Resultados ---");
        System.out.printf("Base imponible: %.2f €%n", baseImponible);
        System.out.printf("IVA (%.2f%%): %.2f €%n", tasaIVA, importeIVA);
        System.out.printf("Total con IVA: %.2f €%n", totalConIVA);

        // Cerrar el scanner
        scanner.close();
	}

}
