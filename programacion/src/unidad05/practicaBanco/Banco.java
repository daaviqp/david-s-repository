package unidad05.practicaBanco;

public class Banco {
	// array que almacena las cuentas bancarias
	private CuentaBancaria[] cuentas;
	private static final int MAX_CUENTAS = 100;
	private int num_cuentas; // con esta variable controlamos el número de cuentas que llevamos

	// constructor
	public Banco() {
		this.cuentas = new CuentaBancaria[MAX_CUENTAS];
		num_cuentas = 0;
	}

	// cb = abrircuenta(1, p, 300, 0, 0)
	// cuentaBancaria cb = abrircuenta(1, p, 300, 34, 2)
	// cuentaBancaria cb = new cuentacorrientepersonal();

	public boolean abrirCuenta(int tipo, Persona titular, double saldo, double parametro1, double parametro2) {
		if (num_cuentas > MAX_CUENTAS) {
			return false;
		}
		CuentaBancaria cuenta = null;
		String entidadesAutorizadasPorDefecto = "Banesto, BBVA, ...";
		switch (tipo) {
		case 1:
			cuenta = new CuentaAhorro(titular, saldo, parametro1);
			break;
		case 2:
			cuenta = new CuentaCorrientePersonal(titular, saldo, entidadesAutorizadasPorDefecto);
			break;
		case 3:
			cuenta = new CuentaCorrienteEmpresa(titular, saldo, entidadesAutorizadasPorDefecto, parametro1, parametro2);
			break;

		default:
			System.err.println("Tipo de cuenta no reconocido");
			return false;
		}

		if (cuenta != null) {
			// ponemos la nueva cuenta en el array de cuentas
			cuentas[num_cuentas] = cuenta;
			// generamos el IBAN de la cuenta
			cuenta.setNumeroCuenta(generarIBAN());
			num_cuentas++;
		}
		return true;
	}

	private String generarIBAN() {
		String codigoPais = "ES";
		String digitosControl = String.format("%02d", (int) (Math.random() * 100)); // 00-99 aleatorio
		String banco = "2100"; // código de banco fijo (ficticio)
		String sucursal = String.format("%04d", (int) (Math.random() * 10000)); // 0000-9999
		String cuenta = String.format("%010d", (int) (Math.random() * 10000000000L)); // 10 dígitos
		return codigoPais + digitosControl + banco + sucursal + cuenta;
	}

	private boolean esIBAN(String s) {
		return s.length() == 34;
	}

	/**
	 * Dado un IBAN o DNI, buscamos la cuenta asociada
	 * 
	 * @param iban_o_dni
	 * @return
	 */
	private CuentaBancaria buscarCuenta(String iban_o_dni) {
		if (esIBAN(iban_o_dni)) {
			for (int i = 0; i < num_cuentas; i++) {
				CuentaBancaria cuenta = cuentas[i];
				if (cuenta.getNumeroCuenta().equals(iban_o_dni)) {
					return cuenta;
				}
			}
		} else {
			for (int i = 0; i < num_cuentas; i++) {
				CuentaBancaria cuenta = cuentas[i];
				Persona titular = cuenta.getTitularCuenta();
				if (titular.getDni().equals(iban_o_dni)) {
					return cuenta;
				}
			}
		}
		return null;
	}

	// listado de cuentas
	public String listadoCuentas() {
		String s = "";
		for (int i = 0; i < num_cuentas; i++) {
			CuentaBancaria cuenta = cuentas[i];
			Persona titular = cuenta.getTitularCuenta();
			s += cuenta.getNumeroCuenta() + " - " + titular.getNombre() + " " + titular.getApellidos() + " ";
			if (cuenta instanceof CuentaAhorro) {
				s += " Cuenta Ahorro";
			} else if (cuenta instanceof CuentaCorrientePersonal) {
				s += " Cuenta Corriente Personal";
			} else if (cuenta instanceof CuentaCorrienteEmpresa) {
				s += " Cuenta Corriente Empresa";
			}
			s += "\n";
		}
		return s;
	}

	// información de la cuenta
	public String informacionCuenta(String iban_dni) {
		CuentaBancaria cuenta = buscarCuenta(iban_dni);
		if (cuenta == null)
			return "No existe la cuenta";
		return cuenta.devolverInfoString();
	}

	// ingreso de cuenta
	/**
	 * ingresoCuenta: recibe un iban o un dni por parámetro y una cantidad e ingresa
	 * la cantidad en la cuenta. Devuelve true o false indicando si la operación se
	 * realizó con éxito
	 * 
	 * @param cuenta
	 * @param cantidad
	 * @return
	 */
	public boolean ingresoCuenta(String iban_dni, double cantidad) {
		CuentaBancaria cuenta = buscarCuenta(iban_dni);
		if (cuenta == null)
			return false;
		double saldoActual = cuenta.getSaldoActual();
		cuenta.setSaldoActual(saldoActual + cantidad);
		return true;
	}

	// retiradaCuenta
	public boolean retirarCuenta(String iban_dni, double cantidad) {
		CuentaBancaria cuenta = buscarCuenta(iban_dni);
		if (cuenta == null)
			return false;
		double saldoActual = cuenta.getSaldoActual();
		double saldoFinal = saldoActual - cantidad;
		// comprobamos si hay suficiente saldo. Y depende del tipo de cuenta podemos
		// dejar el saldo descubierto (negativo)
		if (saldoFinal < 0) {
			if (cuenta instanceof CuentaAhorro) {
				return false;
			} else if (cuenta instanceof CuentaCorrientePersonal) {
				return false;
			} else if (cuenta instanceof CuentaCorrienteEmpresa) {
				CuentaCorrienteEmpresa cuentaEmpresa = (CuentaCorrienteEmpresa) cuenta;
				if (cuentaEmpresa.getMaximoDescubierto() <= -1 * saldoFinal) {
					return false;
				} else {
					cuenta.setSaldoActual(saldoFinal);
				}
			}
		} else {
			cuenta.setSaldoActual(saldoFinal);
		}
		return true;
	}

	// obtenerSaldo: Recibe un iban o un dni por parámetro y devuelve el
	// saldo de la cuenta si existe. En caso contrario devuelve null
	public Double obtenerSaldo(String iban_dni) {
		CuentaBancaria cuenta = buscarCuenta(iban_dni);
		if (cuenta == null)
			return null;
		return cuenta.getSaldoActual();
	}

}