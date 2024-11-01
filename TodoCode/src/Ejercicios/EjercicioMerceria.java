package Ejercicios;

import java.util.Scanner;

/*
 * Una mercería solicita la cantidad de paquetes en cada venta. Depende de los 
 * paquetes, se dice una cosa u otra.
 */
public class EjercicioMerceria {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el número de paquetes que quieres comprar: ");
		int numpaquetes = scan.nextInt();
		if (numpaquetes >= 0 && numpaquetes < 5) {
			System.err.println("No se hacen envíos tan pequeños.");
			
		} else if (numpaquetes > 5 && numpaquetes < 15) {
			System.out.print("Ingrese el monto total de la compra: ");
			double montoTotal = scan.nextDouble();
			System.out.println("El envío cuesta 10$.");
			
		} else if (numpaquetes > 15) {
			System.out.print("Ingrese el monto total de la compra: ");
			double montoTotal = scan.nextDouble();
			System.out.println("El envío es gratis.");
			
		} else {
			System.err.println("No se pueden hacer envíos con un número de paquetes negativo.");
		}
		

	}

}
