package unidad04.libro;

public class Ej4 {

	public static void main(String[] args) {
		int numero[] = new int[20];
		int cuadrado[] = new int[20];
		int cubo[] = new int[20];

		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * 101);
			cuadrado[i] = numero[i] * numero[i];
			cubo[i] = numero[i] * numero[i] * numero[i];
		}
		
		//mostrar los 3 arreglos en 3 columnas+
		System.out.printf("%-10s %-10s %-10s", "Numero", "Cuadrado", "Cubo");
		System.out.println("");
		
		for (int i = 0; i < numero.length; i++) {
			System.out.printf("%-10d %-10d %-10d%n", numero[i], cuadrado[i], cubo[i]);
		}
	}

}
