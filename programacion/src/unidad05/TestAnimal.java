package unidad05;

public class TestAnimal {

	public static void main(String[] args) {
		Gato felix = new Gato("Barbate");
		felix.maulla();
		System.out.println(felix.toString());

		Pinguino alex = new Pinguino("Barbate");
		alex.grazna();
		System.out.println(alex.toString());
	}

}