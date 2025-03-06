package unidad05;

public class BombillaMain {

	public static void main(String[] args) {
		Bombilla bombillaOsram = new Bombilla("Osram", 60f, 4.75f); // 60f es 60.0 (lo ha puesto así porque es float) hay que ponerle f a los float, d a los double, etc.
		System.out.println(bombillaOsram);
		bombillaOsram.encender();
		System.out.println(bombillaOsram);
		
	}

}
