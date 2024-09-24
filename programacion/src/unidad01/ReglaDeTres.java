package unidad01;

import java.util.Scanner;

public class ReglaDeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Mirar código en casa.
		
		//sol x = (b*c)/a

		

			System.out.println("""

						*REGLA DE TRES*

						a ---> b

						c ---> x

						""");



				

				//Declaracion herramienta Scanner

				try (Scanner scan = new Scanner(System.in)) {
					System.out.print("Introduzca valor A: ");

					double a = scan.nextDouble();

					System.out.print("Introduzca valor B: ");

					double b = scan.nextDouble();

					System.out.print("Introduzca valor C: ");

					double c = scan.nextDouble();

					

					//Resolucion

					double x = (b*c)/a;

					

					System.out.println("Dados los parametros, la solucion es:");

					System.out.println(x);
				}

				

				//Analisis input

		
	}

}
