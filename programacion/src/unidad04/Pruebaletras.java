package unidad04;

import org.apache.commons.lang3.StringUtils;

public class Pruebaletras {

	public static void main(String[] args) {
/**
 * 		char[] letras = new char[26];	//El array debe ser de char.
		for (int i = 0; i < 26; i++) {
			letras[i] = (char) ('A' + i);
		}

		//Imprimir el array
		for (char letra : letras) {
			System.out.print(letra + " ");
		}
 */
	
	int dimension = 1+ 'Z' - 'A';
	char[] caracteres = new char[dimension];
	char caracterActual = 'A';
	for (int indice = 0; indice < dimension; indice++) {
		caracteres[indice] = caracterActual++;
	
		}
	
	System.out.println("Mostramos los caracteres del array");
	String output = StringUtils.EMPTY;
	for (int indice = 0; indice < dimension; indice++) {
		output += caracteres[indice];
		}
		
	System.out.print(output);
	
	}

}


