package unidad05.supermercado;

public class ProductoMain {
    public static void main(String[] args) {
        Supermercado compra = new Supermercado("Inés");
        
        // Productos por peso
        compra.agregarProducto(new ProductoPeso(3.0, 0.8, "Patatas", "Frutas y verduras"));
        compra.agregarProducto(new ProductoPeso(2.5, 1.2, "Manzanas", "Frutas y verduras"));  
        compra.agregarProducto(new ProductoPeso(1.8, 0.5, "Zanahorias", "Frutas y verduras"));  
       
        // Productos por unidades
        compra.agregarProducto(new ProductoUnitario(1, 2.20, "Leche", "Lácteos"));  
        compra.agregarProducto(new ProductoUnitario(2, 1.20, "Pan", "Panadería"));  

        // Imprimir el ticket
        compra.imprimirTicket();
    }
    
}