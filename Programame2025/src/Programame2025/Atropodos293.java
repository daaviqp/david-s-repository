package Programame2025;

//Esquema de la entrada: número de casos
import java.util.*;

public class Atropodos293 {

	static Scanner in;

	public static void casoDePrueba() {

		// TU CÓDIGO AQUÍ.
		// Procesa un único caso leyendo con
		// in.next*()

		int insectos = in.nextInt();
		int aracnidos = in.nextInt();
		int crustaceos = in.nextInt();
		int escalopendras = in.nextInt();
		int numeroAnillosEscalopendras = in.nextInt();

		insectos *= 6;
		aracnidos *= 8;
		crustaceos *= 10;
		escalopendras *= numeroAnillosEscalopendras * 2;
		int totalPatas = insectos + aracnidos + crustaceos + escalopendras;
		System.out.println(totalPatas);

	} // casoDePrueba

	public static void main(String[] args) {

		in = new java.util.Scanner(System.in);

		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();

	} // main

} // class Solution