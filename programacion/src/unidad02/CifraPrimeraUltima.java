package unidad02;

import java.util.Scanner;

public class CifraPrimeraUltima {
/**
 * 1. cuál es la primera cifra de un número entero introducido por teclado
 * 2. cuál es la última cifra de un numero entero introducido por teclado 
 */
	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int numero = scan.nextInt();
		
		System.out.println("""
				Elige una opción:
				1. Primera cifra.
				2. Última cifra.
				""");
		// AQUÍ OBLIGAMOS AL USUARIO A INTRODUCIR UNA OPCIÓN VÁLIDA.
		boolean correcto = true;
		do { 		
			int opcion = scan.nextInt();
			switch (opcion) {
		case 1:
			// OBTIENE LA PRIMERA CIFRA DEL NÚMERO.
			int dividendo = numero;
			int primeraCifra = 0;
			while (dividendo != 0) {
				// dividendo = dividendo % 10;
				primeraCifra = dividendo;
				// la siguiente línea es equivalente a --> dividendo = dividendo
				dividendo /= 10;
			}
			System.out.println("La primera cifra del número  " + numero + " es " + primeraCifra);
			break;
		case 2:
			// OBTIENE LA ÚLTIMA CIFRA DEL NÚMERO.
			int ultimaCifra = numero % 10;
			System.out.println("La ultima cifra del número " + numero + " es " + ultimaCifra);
			break;
			
		default:
			// NO SE HA INTRODUCIDO NI 1 NI 2.
			correcto = false;
			System.out.println("No has escogido una opción válida!!");
			break;
			}
	} while(!correcto);
		scan.close();		
	}
		
}

