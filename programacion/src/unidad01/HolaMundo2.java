package unidad01;

import java.util.Scanner;

public class HolaMundo2 {

	public static void main(String[] args) {
		// SI INTRODUCE NOMBRE LE DEVOLVEMOS HOLA + SU NOMBRE, SI NO, LE DECIMOS HOLA AMIGO.
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu nombre! (opcional): ");
		String nombre = scan.nextLine(); // Cuando el usuario no introduce ningun nombre se guada una cadena vacia. ""
		// ESTA ES LA FORMA DE COMPRAR CADENAS. NO CON ==.
		nombre = "".equals(nombre) ? "amigo" : nombre;
		System.out.println("Hola " + nombre + "!!");
		scan.close();
		

	
	}

}


