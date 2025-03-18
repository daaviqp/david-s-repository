package unidad05.practicaBanco;

public class CuentasBancariasMain {

	public static void main(String[] args) {

		Banco banco = new Banco();
		Persona titular1 = new Persona("David", "Quiros", "12345678A");
		Persona titular2 = new Persona("Manuel", "García", "17233221H");
		Persona titular3 = new Persona("Francis", "Sánchez", "87283442G");

		System.out.println("=== Abrimos 3 cuentas");
		boolean resultado1 = banco.abrirCuenta(1, titular1, 1000, 5, 0);
		boolean resultado2 = banco.abrirCuenta(2, titular2, 1000, 100, 0);
		boolean resultado3 = banco.abrirCuenta(3, titular3, 1000, 200, 100);
		System.out.println("Resultados del apertura de cuentas: " + resultado1 + " " + resultado2 + " " + resultado3);

		//llamo al método para listar cuentas
		System.out.println("=== Listado de cuentas disponibles ===");
		listarCuentasDisponibles(banco);

		System.out.println("==== Listado de cuentas:");
		System.out.println(banco.listadoCuentas());
		System.out.println(banco.informacionCuenta(titular1.getDni()));
		System.out.println(banco.informacionCuenta(titular2.getDni()));
		System.out.println(banco.informacionCuenta(titular3.getDni()));

		// ingreso
		System.out.println("=== Ingresamos 100 en las 3 cuentas");
		resultado1 = banco.ingresoCuenta(titular1.getDni(), 100);
		resultado2 = banco.ingresoCuenta(titular2.getDni(), 100);
		resultado3 = banco.ingresoCuenta(titular3.getDni(), 100);
		System.out.println("Resultados del ingreso: " + resultado1 + " " + resultado2 + " " + resultado3);

		// retirada pequeña
		System.out.println("=== Retiramos 20 de cada cuenta");
		resultado1 = banco.retirarCuenta(titular1.getDni(), 20);
		resultado2 = banco.retirarCuenta(titular2.getDni(), 20);
		resultado3 = banco.retirarCuenta(titular1.getDni(), 20);
		System.out.println("Resultados de la retirada: " + resultado1 + " " + resultado2 + " " + resultado3);

		// estado de cuentas después de la retirada grande
		System.out.println("=== Saldo de las cuentas");
		System.out.println("cuenta 1: " + banco.obtenerSaldo(titular1.getDni()));
		System.out.println("cuenta 2: " + banco.obtenerSaldo(titular2.getDni()));
		System.out.println("cuenta 3: " + banco.obtenerSaldo(titular3.getDni()));

		// retirada grande
		System.out.println("=== Retiramos 200 de cada cuenta");
		resultado1 = banco.retirarCuenta(titular1.getDni(), 200);
		resultado2 = banco.retirarCuenta(titular2.getDni(), 200);
		resultado3 = banco.retirarCuenta(titular1.getDni(), 200);
		System.out.println("Resultados de la retirada: " + resultado1 + " " + resultado2 + " " + resultado3);
		System.out.println("");

		// estado de cuentas después de la retirada
		System.out.println("=== Saldo de las cuentas");
		System.out.println("cuenta 1: " + banco.obtenerSaldo(titular1.getDni()));
		System.out.println("cuenta 2: " + banco.obtenerSaldo(titular2.getDni()));
		System.out.println("cuenta 3: " + banco.obtenerSaldo(titular3.getDni()));

		// información de cuentas
		System.out.println("=== Información de cuentas");
		System.out.println("cuenta 1: " + banco.informacionCuenta(titular1.getDni()));
		System.out.println("cuenta 2: " + banco.informacionCuenta(titular2.getDni()));
		System.out.println("cuenta 3: " + banco.informacionCuenta(titular3.getDni()));
	}

	// método para listar cuentas disponibles
	public static void listarCuentasDisponibles(Banco banco) {
		String listado = banco.listadoCuentas();
		if (listado == null || listado.isEmpty()) {
			System.out.println("No hay cuentas disponibles en el banco.");
			return;
		}

		// Suponiendo que listadoCuentas() devuelve un String con información
		// Vamos a formatear la salida. Esto puede necesitar ajustes según la
		// implementación real de Banco
		System.out.println("Código\tNombre Titular");

		// Obtener información de cada cuenta
		String[] cuentas = listado.split("\n");
		for (String cuenta : cuentas) {

			try {

				String[] datos = cuenta.split(",");
				if (datos.length >= 3) {
					String dni = datos[0].trim();
					String codigo = datos[1].trim();
					String nombre = banco.informacionCuenta(dni).contains("Nombre")
							? banco.informacionCuenta(dni).split("Nombre:")[1].split(",")[0].trim()
							: "Desconocido";

					System.out.println(codigo + "\t" + nombre + "\t");
				}
			} catch (Exception e) {
				System.out.println("Error al procesar cuenta: " + cuenta);
			}
		}
		System.out.println("-------------------------------------");
	}

}
