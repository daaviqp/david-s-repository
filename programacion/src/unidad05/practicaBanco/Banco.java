package unidad05.practicaBanco;

public class Banco {
	// array que almacena las cuentas bancarias
	private CuentaBancaria[] cuentas;
	private static final int MAX_CUENTAS = 100;
	private int num_cuentas; // con esta variable controlamos el número de cuentas que llevamos

	// constructor
	public Banco() {
		cuentas = new CuentaBancaria[MAX_CUENTAS];
	}

	// métodos que me pide el enunciado
	public boolean abrirCuenta(CuentaBancaria cuenta) {
		if (num_cuentas > MAX_CUENTAS) {
			return false;
		}
		// generamos el numero IBAN de la cuenta y devolvemos true
		cuenta.setNumeroCuenta(generarIBAN());
		cuentas[num_cuentas] = cuenta;
		num_cuentas++;
		return true;
	}

	private String generarIBAN() {
		String codigoPais = "ES";
		String digitosControl = String.format("%02d", (int) (Math.random() * 100)); // 00-99 aleatorio
		String banco = "2100"; // Código de banco fijo (ficticio)
		String sucursal = String.format("%04d", (int) (Math.random() * 10000)); // 0000-9999
		String cuenta = String.format("%010d", (int) (Math.random() * 10000000000L)); // 10 dígitos
		return codigoPais + digitosControl + banco + sucursal + cuenta;
	}
}