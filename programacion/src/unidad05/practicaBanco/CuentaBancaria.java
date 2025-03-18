package unidad05.practicaBanco;

public class CuentaBancaria implements Imprimible{

	// titular, saldo y numero de cuenta
	private Persona titular; // objeto de la clase persona, que contiene nombre, apellidos...
	private double saldoActual;
	private String numeroCuenta; // IBAN

	// constructores
	public CuentaBancaria(Persona titular) {
		this.titular = titular;
		saldoActual = 0;
	}

	public CuentaBancaria(Persona titular, double saldoInicial) {
		this.titular = titular;
		this.saldoActual = saldoInicial;
	}

	// getters y setters 
	/**
	 * @return the titularCuenta
	 */
	public Persona getTitularCuenta() {
		return titular;
	}

	/**
	 * @param titularCuenta the titularCuenta to set
	 */
	public void setTitularCuenta(Persona titularCuenta) {
		this.titular = titularCuenta;
	}

	/**
	 * @return the saldoActual
	 */
	public double getSaldoActual() {
		return saldoActual;
	}

	/**
	 * @param saldoActual the saldoActual to set
	 */
	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	

	// 
	public String devolverInfoString() {
		return "Titular: " + this.getTitularCuenta().devolverInfoString() + "\n" + 
				"Numero de cuenta: " + this.getNumeroCuenta() + "\n" +
				"Saldo actual: " + this.getSaldoActual() + "\n";
	}
	
	

}
