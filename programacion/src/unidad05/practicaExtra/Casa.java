package unidad05.practicaExtra;

public class Casa extends Vivienda {

	// atributos
	private boolean piscina;
	private boolean jardin;

	// constructor
	public Casa(String direccion, int metrosCuadrados, Propietario propietario, boolean piscina, boolean jardin) {
		super(direccion, metrosCuadrados, propietario);
		this.piscina = piscina;
		this.jardin = jardin;
	}

	// getters y setters
	/**
	 * @return the piscina
	 */
	public boolean isPiscina() {
		return piscina;
	}

	/**
	 * @param piscina the piscina to set
	 */
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	/**
	 * @return the jardin
	 */
	public boolean isJardin() {
		return jardin;
	}

	/**
	 * @param jardin the jardin to set
	 */
	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

	public double calcularCuota() {
		// hipoteca de la casa --> m2 * 1'5€ +30 o +45
		// cuota base y cuota total
		double cuotaBase = getMetrosCuadrados() * 1.5;
		double cuotaTotal = cuotaBase;

		// sumar según piscina o jardín
		if (piscina && jardin) {
			cuotaTotal += 45;
		} else if (piscina || jardin) {
			cuotaTotal += 30;
		}

		// resultado
		return cuotaTotal;
	}

}
