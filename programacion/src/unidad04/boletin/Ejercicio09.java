package unidad04.boletin;
/**
 * 9. Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y 
que los almacene en un array. El programa debe ser capaz de pasar todos los 
números pares a las primeras posiciones del array (del 0 en adelante) y todos 
los números impares a las celdas restantes. Utiliza arrays auxiliares si es 
necesario.
 */
public class Ejercicio09 {

	public static void main(String[] args) {
		int[] numeros = new int[20];
		for (int i = 0; i < 100; i++) {
			int numeroAleatorio = (int) (Math.random() * 101);
			System.out.println(numeroAleatorio);
			//COPIAR DE GIT.
		}
		
	}

}
