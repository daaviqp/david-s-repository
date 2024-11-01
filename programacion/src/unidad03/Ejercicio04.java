package unidad03;

import java.util.Scanner;

/*
 * Implementa un programa con tres funciones: 
 *  void imprimePositivo(int p): Imprime el valor p. Lanza ‘Exception’ si p < 0 
 *  void imprimeNegativo(int n): Imprime el valor n. Lanza ‘Exception’ si p >= 0 
 *  La función main para realizar pruebas. Puedes llamar a ambas funciones 
 * varias veces con distintos valores, hacer un bucle para pedir valores por 
 * teclado y pasarlos a las funciones. Maneja las posibles excepciones.
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		int p = 0;
		imprimePositivo(p);
		p = 5;
		imprimePositivo(p);
		p = -10;
		imprimePositivo(p);
		int n = 0;
		imprimenegativo(n);
		n = 5;
		imprimenegativo(n);
		n = -10;
		imprimenegativo(n);

	}


	private static void imprimePositivo(int p) throws Exception{
		if (p < 0) {
			throw new Exception();
		}
		
	}

	private static void imprimenegativo(int n) throws Exception{
		if (n > 0) {
			throw new Exception();
			
			// MIRAR EN GITHUB PORQUE HE DESCONECTADO Y YA NO ME ENTERO DE NADA.
		}
		
	}
}
