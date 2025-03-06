package unidad05.supermercado;

public class ProductoUnitario extends Producto implements IPrecio {
    private int cantidad;
    private double precio;

    public ProductoUnitario(int cantidad, double precio, String nombre, String categoria) {
        super(nombre, categoria);
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getImporteTotal() {
        return cantidad * precio;
    }

    @Override
    public String imprimir() {
        return String.format("%s, cantidad: %d, precio: %.2f, total: %.2f", 
                             getNombre(), cantidad, precio, getImporteTotal());
    }
}