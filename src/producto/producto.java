package producto;

public class producto {
    public String nombre;
    public float precio;
    public int stock;
    public static float IVA = 0.21f;

    public producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrar() {
        System.out.println("El nombre del producto es " + this.nombre + " con el precio " + this.nombre
                + " con un stock de " + this.stock);
    }

    public void precioTotal() {
        System.out.println("El precio total de " + this.nombre + " es de " + (this.precio + (this.precio * IVA)));
    }
}
