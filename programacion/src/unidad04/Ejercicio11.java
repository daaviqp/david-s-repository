package unidad04;

/*
 * 11. Desarrolla un programa que solicite la entrada de 20 números enteros. Estos 
números deberán ser almacenados en un array de dimensiones 4 filas por 5 
columnas. El programa exhibirá las sumas parciales tanto por filas como por 
columnas, simularizando la presentación de una hoja de cálculo. La suma total 
se deberá mostrar en la esquina inferior derecha del array.
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Definir el array.
		int[][] arrayBidimensional = new int[4][5];
		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional[0].length; j++) {
				int numAleatorio = (int) (Math.random() * 10);
				arrayBidimensional[i][j] = numAleatorio;
			}
		}		
		int sumaFila = 0;
		int[] sumaCol = new int[arrayBidimensional[0].length];
		int sumaTotal = 0;
		//mismo recorrido quito el math y syso arraybidimensional con /t
		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional[0].length; j++) {
				System.out.print(arrayBidimensional[i][j] + "\t");		
				sumaFila += arrayBidimensional[i][j];
				sumaTotal += arrayBidimensional[i][j];
				sumaCol[j] += arrayBidimensional[i][j];
			}
			// para el salto necesito /n fuera del corchete syso /n. CUIDADO Q SI LO PONGO FUERA DEL OTRO SE IMPRIME TO EN LÍNEA.
			System.out.print(sumaFila + "\n");
			sumaFila = 0; //para que empiece desde cero y no se sume con las demás.
			
			//mirar en git lo que tenga diferente, repasarlo y copiarlo.
		}
		for (int num : sumaCol) {
			System.out.print(num + "\t");
			num=10;
			
		}
		System.out.print(sumaTotal);
		
		
	}

}
