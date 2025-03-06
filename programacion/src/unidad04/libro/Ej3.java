package unidad04.libro;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		//leer los numeros del teclado
		Scanner scan = new Scanner(System.in);
		int numeros[] = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scan.nextInt();
		}
		
		//mostrar los numeros al contrario
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
		
		scan.close();

	}

}
