package unidad02.boletin2;
// Programa que diga cuál es la última cifra de un número introducido por teclado.
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int numero = scan.nextInt();
		int ultimaCifra = numero % 10;
		System.out.println("La última cifra de " + numero + " es " + ultimaCifra);

	}

}


