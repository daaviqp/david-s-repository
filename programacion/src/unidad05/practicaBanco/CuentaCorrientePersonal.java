package unidad05.practicaBanco;

public class CuentaCorrientePersonal extends CuentaCorriente {

	// Comisión de mantenimiento (una cantidad fija anual)
	private static double comisionMantenimiento = 0.03;

	public CuentaCorrientePersonal(Persona titular, double saldoInicial, String entidadesAutorizadas) {
		super(titular, saldoInicial, entidadesAutorizadas);
	}

	public static void setComisionMantenimiento(double comisionMantenimiento) {
		CuentaCorrientePersonal.comisionMantenimiento = comisionMantenimiento;
	}

	public static double getComisionMantenimiento() {
		return comisionMantenimiento;
	}

	// devolverInfoString
	public String devolverInfoString() {
		return super.devolverInfoString().replace("Cuenta Corriente", "Cuenta Corriente Personal")
				+ "Comisión de mantenimiento: " + CuentaCorrientePersonal.getComisionMantenimiento() + "\n";
	}
}
