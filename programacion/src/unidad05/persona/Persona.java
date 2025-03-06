package unidad05.persona;

public abstract class Persona {
	private String nombre;
	private String dni;
	private int edad;
	private char sexo;
	private float peso;
	private float altura;
	
	// constructores
	// constructor por defecto 
	public Persona() {
		this.nombre = "";
		this.dni = this.generaDni();
		this.edad = 0;
		this.sexo = 'N';
		this.peso = 0f;
		this.altura = 0f;
	}
	
	// métodos de instancia
	private char comprobarSexo(char sexo2) {
		
		return 0;
	}
	
	private String generaDni() {
		
		return null;
	}
}
