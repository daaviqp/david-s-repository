package unidad05.practicaBanco;

public class CuentaCorriente extends CuentaBancaria {
	// Lista de entidades autorizadas p
	private String entidadesAutorizadas; // separadas por coma

	public CuentaCorriente(Persona titular, double saldoInicial, String entidadesAutorizadas) {
		super(titular, saldoInicial);
		this.entidadesAutorizadas = entidadesAutorizadas;
	}

	// getters y setters
	public String getEntidadesAutorizadas() {
		return entidadesAutorizadas;
	}

	public void setEntidadesAutorizadas(String entidadesAutorizadas) {
		this.entidadesAutorizadas = entidadesAutorizadas;
	}

	// devolverInfoString
	public String devolverInfoString() {
		return "Cuenta Corriente: \n" + super.devolverInfoString() + "Entidades autorizadas: "
				+ this.getEntidadesAutorizadas() + "\n";
	}
}
