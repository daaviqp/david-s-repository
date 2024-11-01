package unidad02.boletin2;

import java.util.Scanner;

/**
 * Una tienda de banderas y banderolas vende productos personalizados de la 
máxima calidad y nos ha pedido hacer un configurador que calcule el precio 
según el alto y el ancho. 
 El precio base de una bandera es de un céntimo de euro el centímetro 
cuadrado. 
 A partir de 6 metros cuadrados, por la dificultad de conseguir dichas 
telas, el precio pasa a ser de 0,012 €/cm2
 Si la queremos con un escudo bordado, el precio se incrementa en 2.50€ 
independientemente del tamaño. 
 Los gastos de envío son 3.25 €. 
 El IVA ya está incluido en todas las tarifas.

 */
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa muestra el precio de las banderas y banderolas.");
		System.out.println("Introduce el alto: ");
		double alto = scan.nextInt();
		System.out.println("Introduce el ancho: ");
		double ancho = scan.nextInt();
		double cm2 = alto * ancho;
		double precio = cm2 * 0.01;
		if (cm2 >= 0 && cm2 <= 600) {
			System.out.println("El precio de la bandera es de " + precio + "€");
			
		} else {
			System.out.println("El precio de la bandera es de " + (cm2 - 600) * 0.012 + "€");
		}
		
		System.out.println("¿Quieres escudo bordado?");
		String escudo = scan.next();
		

	}

}
