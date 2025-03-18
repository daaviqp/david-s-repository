package unidad05.practicaExtra;

public abstract class Vivienda implements Hipotecable {
	private String direccion;
	private int metrosCuadrados;
	private Propietario propietario;

	public Vivienda(String direccion, int metrosCuadrados, Propietario propietario) {
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.propietario = propietario;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the metrosCuadrados
	 */
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	/**
	 * @param metrosCuadrados the metrosCuadrados to set
	 */
	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	/**
	 * @return the propietario
	 */
	public Propietario getPropietario() {
		return propietario;
	}

	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	
}
