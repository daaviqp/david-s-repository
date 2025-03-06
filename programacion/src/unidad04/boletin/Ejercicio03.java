package unidad04.boletin;

public class Ejercicio03 {

	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		for (int i = 0; i < numero.length ;i++) {
			int numAleatorio = (int) (Math.random() * 101);
			numero[i] = numAleatorio;
			numero[i] = (int) Math.pow(numAleatorio, 2);
			numero[i] = (int) Math.pow(numAleatorio, 3);
		}
		for (int i = 0; i < numero.length; i++) {
			System.out.printf("%d\t%d\t%d\t\n", numero[i], cuadrado[i], cubo[i]);
		}

	}

}
