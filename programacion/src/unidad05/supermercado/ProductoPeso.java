package unidad05.supermercado;

public class ProductoPeso extends Producto implements IPrecio {
    private double peso;
    private double precioPorPeso;
    
    public ProductoPeso(double peso, double precioPorPeso, String nombre, String categoria) {
        super(nombre, categoria);
        this.peso = peso;
        this.precioPorPeso = precioPorPeso;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the precioPorPeso
     */
    public double getPrecioPorPeso() {
        return precioPorPeso;
    }

    /**
     * @param precioPorPeso the precioPorPeso to set
     */
    public void setPrecioPorPeso(double precioPorPeso) {
        this.precioPorPeso = precioPorPeso;
    }
    
    @Override
    public double getImporteTotal() {
        return peso * precioPorPeso;
    }

    @Override
    public String imprimir() {
        return String.format("%s, cantidad: %.2f, precio: %.2f, total: %.2f", 
                             getNombre(), peso, precioPorPeso, getImporteTotal());
    }
}