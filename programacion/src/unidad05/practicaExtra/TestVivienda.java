package unidad05.practicaExtra;

public class TestVivienda {

	public static void main(String[] args) {
		// creo dos propietarios
		Propietario propietario1 = new Propietario("Juan Pérez Gómez", "12345678A");
		Propietario propietario2 = new Propietario("María López Sánchez", "87654321B");

		// creo un apartamento
		Apartamento apartamento1 = new Apartamento("Calle las palmas de canarias", 20, propietario1, 2, 'a');

		// creo una casa
		Casa casa1 = new Casa("Calle Larios", 20, propietario2, true, true);
		Casa casa2 = new Casa("Calle Larios", 20, propietario2, false, false);
		Casa casa3 = new Casa("Calle Larios", 20, propietario2, true, false);

		// mostrar la informacion y calcular las cuotas
		// prueba de apartamento
		System.out.println("---Prueba de apartamento---");
		System.out.println("Dirección: " + apartamento1.getDireccion());
		System.out.println("Metros cuadrados: " + apartamento1.getMetrosCuadrados());
		System.out.println("Propietario: " + apartamento1.getPropietario());
		System.out.println("Piso: " + apartamento1.getPiso());
		System.out.println("Puerta: " + apartamento1.getPuerta());
		System.out.println("Cuota: " + apartamento1.calcularCuota());

		System.out.println("");

		// prueba de casa 1
		System.out.println("---Prueba de casa 1---");
		System.out.println("Dirección: " + casa1.getDireccion());
		System.out.println("Metros cuadrados: " + casa1.getMetrosCuadrados());
		System.out.println("Propietario: " + casa1.getPropietario());
		System.out.println("Piscina: " + casa1.isPiscina());
		System.out.println("Jardín: " + casa1.isJardin());
		System.out.println("Cuota: " + casa1.calcularCuota());

		System.out.println("");

		// prueba de casa 2
		System.out.println("---Prueba de casa 2---");
		System.out.println("Dirección: " + casa2.getDireccion());
		System.out.println("Metros cuadrados: " + casa2.getMetrosCuadrados());
		System.out.println("Propietario: " + casa2.getPropietario());
		System.out.println("Piscina: " + casa2.isPiscina());
		System.out.println("Jardín: " + casa2.isJardin());
		System.out.println("Cuota: " + casa2.calcularCuota());

		System.out.println("");

		// prueba de casa 3
		System.out.println("---Prueba de casa 3---");
		System.out.println("Dirección: " + casa3.getDireccion());
		System.out.println("Metros cuadrados: " + casa3.getMetrosCuadrados());
		System.out.println("Propietario: " + casa3.getPropietario());
		System.out.println("Piscina: " + casa3.isPiscina());
		System.out.println("Jardín: " + casa3.isJardin());
		System.out.println("Cuota: " + casa3.calcularCuota());
	}

}
