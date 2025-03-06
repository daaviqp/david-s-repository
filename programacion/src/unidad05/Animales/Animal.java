package unidad05.Animales;

import java.util.Date;

public class Animal {
	private Date fechaNacimiento;
	private String lugarDeNacimiento;
	private String ubicacion;
	private char numeroDePatas;
	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the lugarDeNacimiento
	 */
	public String getLugarDeNacimiento() {
		return lugarDeNacimiento;
	}
	/**
	 * @param lugarDeNacimiento the lugarDeNacimiento to set
	 */
	public void setLugarDeNacimiento(String lugarDeNacimiento) {
		this.lugarDeNacimiento = lugarDeNacimiento;
	}
	/**
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}
	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	/**
	 * @return the numeroDePatas
	 */
	public char getNumeroDePatas() {
		return numeroDePatas;
	}
	/**
	 * @param numeroDePatas the numeroDePatas to set
	 */
	public void setNumeroDePatas(char numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}
	
	public Animal (String lugarDeNacimiento, char numeroDePatas) {
		this.fechaNacimiento = fechaNacimiento;
		this.lugarDeNacimiento = lugarDeNacimiento;
		this.ubicacion = ubicacion;
		this.numeroDePatas = numeroDePatas;
	}
	
	public void migrar(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Override
	public String toString() {
		return "Animal [fechaNacimiento=" + fechaNacimiento + ", lugarDeNacimiento=" + lugarDeNacimiento
				+ ", ubicacion=" + ubicacion + ", numeroDePatas=" + numeroDePatas + "]";
	}
	
	
}
