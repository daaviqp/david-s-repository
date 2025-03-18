package unidad05.practicaBanco;

public class CuentaCorrienteEmpresa extends CuentaCorriente {

	// Tipo de interés por descubierto
	private static double tipoInteresDescubierto = 0.05;
	// Máximo descubierto permitido
	private double maximoDescubierto;

	// una comisión fija por cada descubierto que se tenga
	private double comisionFija;

	public CuentaCorrienteEmpresa(Persona titular, double saldoInicial, String entidadesAutorizadas,
			double maximoDescubierto, double comisionFija) {
		super(titular, saldoInicial, entidadesAutorizadas);
		this.maximoDescubierto = maximoDescubierto;
		this.comisionFija = comisionFija;
	}

	// getter y setter para tipoInteresDescubierto
	public static void settipoInteresDescubierto(double nuevoInteres) {
		tipoInteresDescubierto = nuevoInteres;
	}

	public static double gettipoInteresDescubierto() {
		return tipoInteresDescubierto;
	}

	// getters y setters
	public double getMaximoDescubierto() {
		return maximoDescubierto;
	}

	public void setMaximoDescubierto(int maximoDescubierto) {
		this.maximoDescubierto = maximoDescubierto;
	}

	public double getComisionFija() {
		return comisionFija;
	}

	public void setComisionFija(double comisionFija) {
		this.comisionFija = comisionFija;
	}

	public String devolverInfoString() {
		return super.devolverInfoString().replace("Cuenta Corriente", "Cuenta Corriente Empresa")
				+ "Tipo de interés por descubierto: " + CuentaCorrienteEmpresa.gettipoInteresDescubierto() + "\n"
				+ "Máximo descubierto permitido: " + this.getMaximoDescubierto() + "\n"
				+ "Comisión fija por cada descubierto: " + this.getComisionFija() + "\n";
	}

}
