package unidad04.libro;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		//leer el número por teclado
		Scanner scan = new Scanner(System.in);
		int numeros[] = new int[15];
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scan.nextInt();
		}
		
		//rotar los elementos del array uno a la derecha
		int ultimo = numeros[numeros.length - 1]; //guardamos el último elemento
		for (int i = numeros.length - 1; i > 0; i--) {
			numeros[i] = numeros[i - 1]; //desplazo cada elemento hacia la derecha
		}
		numeros[0] = ultimo;
		
		//mostrar el contenido del array después de rotarlo
		System.out.println("\nArray después de rotar: ");
		for (int numero : numeros) {
			System.out.println(numero + " ");
		}
		scan.close();
	}

}