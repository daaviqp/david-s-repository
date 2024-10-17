package unidad02.boletin2;

import java.util.Scanner;

/**
 * 19. Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás 
utilizando un bucle for.
EXTRA: Cambiar los valores por parámetros
inicio - fin - incremeto
 */
public class Ejercicio19Y23 {

	public static void main(String[] args) {
	/**
	 * 	System.out.println("Este programa muestra los números del 320 al 160, contando de 20 en 20 hacia atrás.");
		for (int i = 320; i >= 160; i=i-20) { // i-=20 también es válido.
			System.out.println(i);
	 */
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Introduce el número de inicio: ");
	int numeroInicio = scan.nextInt();
	System.out.print("Introduce el número de fin: ");
	int numeroFin = scan.nextInt();
	System.out.print("Introduce el número de incremento/decremento: ");
	int numeroIncremento = scan.nextInt();
	scan.close();
	if (numeroInicio >= numeroFin) {
		for (int i = numeroInicio; i >= numeroFin ; i-=numeroIncremento) {
			System.out.println(i);
			
		}
			
		
	} else {
		for (int i = numeroInicio; i <= numeroFin ; i+=numeroIncremento) {
			System.out.println(i);
			
		}
	}
		
		
	}
	
	
			
		}




