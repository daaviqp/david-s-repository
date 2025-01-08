package cap1;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int numInicio = scan.nextInt();
		int numSuma = 0;
		
		if (numInicio % 7 == 0) {
			System.out.println("El número es múltiplo de 7");
		} 
		
		while (numInicio % 7 != 0) {
			numSuma++;
		
		}
		System.out.println(numSuma);
		

	}

}
