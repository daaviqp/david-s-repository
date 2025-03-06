package unidad05;

public class Punto {

	// coordenadas x,y
	// funcionalidades: desplazar(despx, despy) | obtenerInverso() | calcularAreaConEjes | calcularPerimetroCuadrantes
	// constructor puntos
	// constructor punto por defecto (0,0)

	private double x;
	private double y;
	
	// constructor de punto
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// getters y setters 
	/**
	 * @return the x
	 */
	public double getX() {
		return this.x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return this.y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	// funcionalidades
	public void desplazar(double x, double y) {
		this.x += x;
		this.y += y;
	}
	
	public void obtenerInverso() {
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Punto\n").append("eje x: ").append(this.x)
		.append("\n").append("eje y: ").append(this.y);
		return sb.toString();
	}
	
}
