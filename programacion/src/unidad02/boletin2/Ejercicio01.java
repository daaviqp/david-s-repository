package unidad02.boletin2;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el salario semanal de un trabajador teniendo 
en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 
euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
Ejemplo 1:
Por favor, introduzca el número de horas trabajadas durante la semana: 36
El sueldo semanal que le corresponde es de 432 euros
Ejemplo 2:
Por favor, introduzca el número de horas trabajadas durante la semana: 40
El sueldo semanal que le corresponde es de 480 euros
Ejemplo 3:
Por favor, introduzca el número de horas trabajadas durante la semana: 55
El sueldo semanal que le corresponde es de 720 euros
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa muestra el sueldo semanal que le corresponde.");
		System.out.print("Introduzca el número de horas que ha trabajado: ");
		int horas = scan.nextInt();
		int sueldo = 0;
		scan.close();
		if (horas <= 40) {
			sueldo = horas * 12;
		} else {
			sueldo = (40*12) + ((horas - 40) * 16);			
		}
		System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros.");
		
	}

}
