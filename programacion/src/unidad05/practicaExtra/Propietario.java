package unidad05.practicaExtra;

public class Propietario {
	// atributos
	private String nombre_completo;
	private String dni;

	// constructor
	public Propietario(String nombre_completo, String dni) {
		this.nombre_completo = nombre_completo;
		this.dni = dni;
	}

	// getters y setters
	/**
	 * @return the nombre_completo
	 */
	public String getNombre_completo() {
		return nombre_completo;
	}

	/**
	 * @param nombre_completo the nombre_completo to set
	 */
	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	
	// toString para que se muestre en el main
	@Override
	public String toString() {
		return "Nombre completo: " + nombre_completo + ", DNI: " + dni;
	}

}
