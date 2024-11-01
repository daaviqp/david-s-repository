package unidad02.boletin2;

import java.util.Scanner;

/*
 * Programa que indique la primera cifra de un número introducido por
 * teclado (números de hasta 5 cifras)
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa muestra la primera cifra de un número introducido por el teclado (máximo 5 cifras.");
		System.out.print("Introduce el número (máximo 5 cifras): ");
		int numero = scan.nextInt();
		int primeraCifra = 0;
		int dividendo = numero;
		while (dividendo != 0) {
			primeraCifra = dividendo;
			dividendo /= 10;
		}
		
		System.out.println("La primera cifra del número " + numero + " es " + primeraCifra);				
	}

}


/*int dividendo = numero;
int primeraCifra = 0;
while (dividendo != 0) {
	primeraCifra = dividendo;
	// la siguiente línea es equivalente a --> dividendo = dividendo / 10;
	dividendo /= 10;				
}
System.out.println("La primera cifra del número " + numero + " es " + primeraCifra);
break;
*/