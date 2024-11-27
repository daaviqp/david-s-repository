package unidad03.boletin;

import java.util.Scanner;

public class UtilidadesEj06 {

	public static int introduceInt(String mensaje) {
		Scanner scan = new Scanner(System.in);
		int valor;
		while (true) {
			try {
				System.out.println(mensaje);
				valor = Integer.parseInt(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error. Introduce un valor int válido.");
				
			}
		}
		return valor;		
	}
	
	public static float introduceFloat(String mensaje) {
		Scanner scan = new Scanner(System.in);
		float valor;
		while (true) {
			try {
				System.out.println(mensaje);
				valor = Float.parseFloat(scan.nextLine());
				break;
			} catch (NumberFormatException e){
				System.out.println("Error. Introduce un valor float válido.");
			}
		}
		return valor;
	}
	
	public static double introduceDouble(String mensaje) {
		Scanner scan = new Scanner(System.in);
		double valor;
		while (true) {
			try {
				System.out.println(mensaje);
				valor = Double.parseDouble(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error. Introduce un valor double válido.");
				
			}
		}
		return valor;
	}
	
	public static boolean introduceBoolean(String mensaje) {
		Scanner scan = new Scanner(System.in);
		boolean valor;
		while (true) {
			try {
				System.out.println(mensaje);
				valor = Boolean.parseBoolean(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error. Introduce un valor boolean válido.");
				
			}
		}
		return valor;
	}
	
	public static char introduceChar(String mensaje) {
		Scanner scan = new Scanner(System.in);
		char valor;
		while (true) {
			try {
				System.out.println(mensaje);
				valor = scan.nextLine().charAt(0);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error. Introduce un valor char válido.");
			}
		}
		return valor;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Menú:");
			System.out.println("1. Introducir int:");
			System.out.println("2. Introducir float:");
			System.out.println("3. Introducir double:");
			System.out.println("4. Introducir boolean:");
			System.out.println("5. Introducir char:");
			System.out.println("6. Salir");
			System.out.println("Elige una opción: ");
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case 1:
				int intValue = introduceInt("Introduce un valor entero: ");
				System.out.println("Valor introducido: " + intValue);
				break;
				
			case 2:
				float floatValue = introduceFloat("Introduce un valor entero: ");
				System.out.println("Valor introducido: " + floatValue);
				break;
				
			case 3:
				double doubleValor = introduceDouble("Introduce un valor entero: ");
				System.out.println("Valor introducido: " + doubleValor);
				break;
				
			case 4:
				boolean booleanValor =  introduceBoolean("Introduce un valor entero: ");
				System.out.println("Valor introducido: " + booleanValor);
				break;
				
			case 5:
				char charValor = introduceChar("Introduce un valor entero: ");
				System.out.println("Valor introducido: " + charValor);
				break;
				
			case 6:
				System.out.println("Saliendo del programa...");
				break;
			
			default:
				System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
		

		} while (opcion != 6);

	}

}
