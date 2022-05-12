public class Caja {

    private String nombre;

    public Caja(String nombre) {
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void procesarCompra(Cliente cliente, long timestamp) {

        for (int i = 0; i < cliente.getCarrito().length; i++) {
            this.esperar(cliente.getCarrito()[i]);
            System.out.println("Procesando item " + i + " - Tiempo " + (System.currentTimeMillis() - timestamp) / 1000 + "s.");
        }
    }

    private void esperar (int segs) {
        try {
            Thread.sleep(segs * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
