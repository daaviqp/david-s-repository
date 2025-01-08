package unidad04;

import java.util.Scanner;

public class solution {
	static Scanner in;

	  public static void casoDePrueba() {
		  int numero = in.nextInt();
		  int factorialNumero = numero;
		  for (int j = factorialNumero - 1; j > 1; j--) {
			  factorialNumero = factorialNumero * j;
		  }
		  System.out.println(factorialNumero % 10);
		  
		  
		// TU CÓDIGO AQUÍ.
	    // Procesa un único caso leyendo con
	    // in.next*()

	  } // casoDePrueba

	  public static void main(String[] args) {

	    in = new java.util.Scanner(System.in);

	    int numCasos = in.nextInt();
	    for (int i = 0; i < numCasos; i++)
	      casoDePrueba();

	  } // main

	} // class Solution

