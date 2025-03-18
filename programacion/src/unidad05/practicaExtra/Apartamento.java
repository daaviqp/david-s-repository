package unidad05.practicaExtra;

public class Apartamento extends Vivienda {
	
	// atributos
	private int piso;
	private char puerta;

	// constructor
	public Apartamento(String direccion, int metrosCuadrados, Propietario propietario, int piso, char puerta) {
		super(direccion, metrosCuadrados, propietario);
		this.piso = piso;
		this.puerta = puerta;
	}

	// getters y setters
	/**
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}

	/**
	 * @return the puerta
	 */
	public char getPuerta() {
		return puerta;
	}

	/**
	 * @param puerta the puerta to set
	 */
	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}

	public double calcularCuota() {
		// hipoteca de la casa --> m2 * 1'2€
		return getMetrosCuadrados() * 1.2;
	}

}