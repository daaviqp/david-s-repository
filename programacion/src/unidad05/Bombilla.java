package unidad05;

public class Bombilla {
	
	private String marca;
	private float potencia;
	private float precio;
	private String estado;
	
	// método constructor de la clase bombilla
	public Bombilla(String marca, float potencia, float precio) { // entre parentesis datos que pasamos por parámetros
		this.marca = marca;
		this.potencia = potencia;
		this.precio = precio;
		this.estado = "apagada"; // puedo ponerla apagada o encendida
	}
	// getters y setters
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return this.marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the potencia
	 */
	public float getPotencia() {
		return this.potencia;
	}
	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return this.precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return this.estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void encender() {
		this.estado = "encendido";
	}
	public void apagar() {
		this.estado = "apagado";
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Bombilla\n").append("marca: ").append(this.marca)
		.append("\n").append("precio: ").append(this.precio).append(" €")
		.append("\n").append("potencia: ").append(this.potencia).append(" W")
		.append("\n").append("estado: ").append(this.estado);
		return sb.toString();
	}
	
}
