package unidad05;

public class PuntoMain {

	public static void main(String[] args) {
		Punto puntoPorDefecto = new Punto(0d, 0d);
		System.out.println(puntoPorDefecto);
		
		Punto punto = new Punto(0d, 0d);
		punto.desplazar(0, 0);
		System.out.println(punto);
		

	}

}
