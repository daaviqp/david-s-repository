package unidad05.supermercado;

import java.util.ArrayList;

public class Supermercado {
    private String cliente;
    private ArrayList<Producto> listaCompra;
    
    public Supermercado(String cliente) {
        this.cliente = cliente;
        this.listaCompra = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        if (producto instanceof IPrecio) {
            listaCompra.add(producto);
        } else {
            System.out.println("Error: El producto " + producto.getNombre() + " no tiene precio definido.");
        }
    }
    
    public void imprimirTicket() {
        System.out.println("TICKET DE LA COMPRA");
        System.out.println("Cliente: " + cliente);
        double total = 0;
        
        for (Producto p : listaCompra) {
            System.out.println(((IPrecio) p).imprimir()); 
            double importe = ((IPrecio) p).getImporteTotal();
            System.out.printf("%.2f\n", importe);
            total += importe;
        }
        
        System.out.println("\nIMPORTE TOTAL");
        System.out.printf("%.2f", total);
    }
}