package unidad02;

import java.util.Scanner;

public class TablasDeMultiplicar {

	public static void main(String[] args) {
		// HACERLO EN CASA.
		Scanner scan = new Scanner(System.in);
		System.out.print("Inroduce un número para calcular su tabla de multiplicar: ");
		int numero = scan.nextInt();
		scan.close();
		// for (declara e inicializa la variable; condicion que cumple la variable;inc
	for (int indice = 0;indice<=10;indice++) {
	System.out.println(numero + " x " + indice + " = " + indice*numero);
}
	}

}
