package com.davidQuiros.tarea2;

import java.util.Scanner;

/**
 * Realizar un programa que muestre en pantalla el siguiente menú:
~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~
1 - Suma
2 - Resta
3 - Multiplicación
4 – División
5 - Raíz cuadrada
6 – Potencia
0 - Salir del programa
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Posteriormente se quedará a la espera de que el usuario introduzca un valor 
numérico.
Si introduce un 0 el programa mostrará un mensaje de despedida, que habrá 
que confirmar pulsando cualquier tecla y después finalizará.
Si se pulsa un valor comprendido entre 1 y 6 pedirá al usuario dos números y 
devolverá el resultado de la operación escogida.
Si se pulsa cualquier otra cosa el programa volverá a mostrar el menú tras un 
mensaje de error instando a introducir un valor correcto.
 */

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~");
			System.out.println("""				
					1 - Suma
					2 - Resta
					3 - Multiplicación
					4 – División
					5 - Raíz cuadrada
					6 – Potencia
					0 - Salir del programa				
					""");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("Introduce la opción que quieres usar: ");
			opcion = scan.nextInt();
			
			if (opcion == 0) { // Si el número es 0, saldremos del programa.
				System.out.println("Hasta la próxima!");
				System.out.print("Pulsa cualquier tecla para salir del programa:");
				scan.next();
				break;
			}
			
			if (opcion >=1 && opcion <=6) { // Si el número está entre 1 y 6, contunuamos con las operaciones.
				System.out.print("Introduce el primer número: ");
				double num1 = scan.nextDouble();
				double num2 = 0;
				if (opcion != 5) { // Hacemos esto porque para la raíz cuadrada sólo necesitamos un número.
					System.out.print("Introduce el segundo número: ");
					num2 = scan.nextDouble();					
				}
				
				switch (opcion) { // Usar un switch case es la mejor opción cuando hay que repetir operaciones, como en esta calculadora.
				case 1:
					System.out.println("El resultado de sumar " + num1 + " más " + num2 + " es " + (num1 + num2));
					try {
						Thread.sleep(2000); // Esto sirve para insertar un tiempo de espera entre que se muestra el resultado y el inicio de la siguiente operación.
					} catch (InterruptedException e) {
						
					}
					break;
					
				case 2:
					System.out.println("El resultado de restar " + num1 + " menos " + num2 + " es " + (num1 - num2));
					try {
						Thread.sleep(2000); 
					} catch (InterruptedException e) {
						
					}
					break;
					
				case 3:
					System.out.println("El resultado de multiplicar " + num1 + " por " + num2 + " es " + (num1 * num2));
					try {
						Thread.sleep(2000); 
					} catch (InterruptedException e) {
						
					}
					break;
					
				case 4:
					System.out.println("El resultado de dividir " + num1 + " entre " + num2 + " es " + (num1 / num2));
					try {
						Thread.sleep(2000); 
					} catch (InterruptedException e) {
						
					}
					break;
					
				case 5:
					if (num1 >= 0) { // Si el número es mayor o igual que 0, seguiremos con la raíz cuadrada.
						System.out.println("La raíz cuadrada de " + num1 + " es " + Math.sqrt(num1));
						try {
							Thread.sleep(2000); 
						} catch (InterruptedException e) {
							
						}
						
					} else { // Si no, pondremos por pantalla que no se puede realizar la raíz de un número negativo.
						System.err.println("Error. No se puede calcular la raíz de un número negativo");
						try {
							Thread.sleep(2000); 
						} catch (InterruptedException e) {
							
						}
					}
					break;
					
				case 6:
					System.out.println(num1 + " elevado a " + num2 + " es " + Math.pow(num1, num2));
					try {
						Thread.sleep(2000); 
					} catch (InterruptedException e) {
						
					}
					break;
				}
				
			} else { // Si no se introduce una opción válida, se muestra el siguiente mensaje y se reinicia el programa.
				System.err.print("Error. Introduce una opción válida.");
				try {
					Thread.sleep(2000); 
				} catch (InterruptedException e) {
					
				}
			}
			
		} while (true);
		
		scan.close();
		
	}	
}