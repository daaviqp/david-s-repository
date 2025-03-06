package unidad05;

public abstract class Ave extends Animal {
	private boolean poneHuevo;

	/**
	 * @return the poneHuevo
	 */
	public boolean isPoneHuevo() {
		return poneHuevo;
	}

	/**
	 * @param poneHuevo the poneHuevo to set
	 */
	public void setPoneHuevo(boolean poneHuevo) {
		this.poneHuevo = poneHuevo;
	}
	
	public Ave(String lugarNacimiento, boolean volador, boolean poneHuevo) {
		super(lugarNacimiento, 2);
		this.poneHuevo = poneHuevo;
	}
	public void vuela() {
		System.out.println("El animal no vuela");
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Es un ave.\n").append(super.toString());
		return sb.toString();
	}
}
