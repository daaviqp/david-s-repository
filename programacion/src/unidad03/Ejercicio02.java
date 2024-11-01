package unidad03;
/*
 * Crea un método adicional en el ejercicio anterior que sea capaz de insertar 10
 * saltos de línea en la salida estándar. Utilízalo cuando creas que es necesario en
 * la aplicación. 
 * EXTRA: crear tantos saltos como se indique en el parámetro.
 */
public class Ejercicio02 {

		public static void salto10 (int saltos) {
			for (int i=0;i<10;i++);
			System.out.println("\n\n\n\n\n\n\n\n\n\n");
			
			for (int i = 0; i < saltos; i++) {
				System.out.println();
			}
			
			// esto se mete dentro del programa anterior para llamarlo cuando sea necesario.
			
		}
		

	}


