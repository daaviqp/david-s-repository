package unidad05.practicaBanco;

public class CuentaAhorro extends CuentaBancaria {
	private double tipoInteresAnual;
	// Tipo de interés de remuneración, si se trata de una cuenta de ahorro. Por
	// defecto será un valor especificado en un atributo de clase que será
	// modificable
	// mediante un método estático

	private static double tipoInteresRemumeracion = 0.05;

	public CuentaAhorro(Persona titular, double saldoInicial, double interesAnual) {
		super(titular, saldoInicial);
		this.tipoInteresAnual = interesAnual;
	}

	public static void settipoInteresRemumeracion(double nuevoInteres) {
		tipoInteresRemumeracion = nuevoInteres;
	}

	public static double gettipoInteresRemumeracion(double nuevoInteres) {
		return tipoInteresRemumeracion;
	}

// getters y setters
	public double getTipoInteresAnual() {
		return tipoInteresAnual;
	}

	public void setTipoInteresAnual(double tipoInteresAnual) {
		this.tipoInteresAnual = tipoInteresAnual;
	}

	// devolverInfoString
	public String devolverInfoString() {
		return "Cuenta Ahorro: \n" + super.devolverInfoString() + "Tipo de interés anual: " + this.getTipoInteresAnual()
				+ "\n";
	}

}
