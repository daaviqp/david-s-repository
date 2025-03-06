package unidad05;

public class Pinguino extends Ave {
	public Pinguino(String lugarNacimiento) {
		super(lugarNacimiento, volador, Boolean.TRUE);
	}
	public void grazna() {
		System.out.println("wa, wa, wa, waaaaa");
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String domestico = this.isPoneHuevo() ? "pone huevo" : "no pone huevo";
		sb.append("El animal es un pingüino. Que es un animal ").append(domestico).append("\n").append(super.toString());
		return sb.toString();
	}
}
