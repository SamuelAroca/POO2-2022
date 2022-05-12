public class Cliente {

    private String nombre;
    private int[] carrito;

    public Cliente(String nombre, int[] carrito){
        this.setNombre(nombre);
        this.setCarrito(carrito);
    }

    public int[] getCarrito() {
        return carrito;
    }

    public void setCarrito(int[] carrito) {
        this.carrito = carrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}