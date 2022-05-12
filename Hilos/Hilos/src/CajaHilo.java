public class CajaHilo extends Thread{

    private String nombre;
    private Cliente cliente;
    private long inicio;

    public CajaHilo(String nombre, Cliente cliente, long inicio) {
        super(nombre);
        this.nombre = nombre;
        this.cliente = cliente;
        this.inicio = inicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getInicio() {
        return inicio;
    }

    public void setInicio(long inicio) {
        this.inicio = inicio;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.cliente.getCarrito().length; i++) {
            this.esperar(cliente.getCarrito()[i]);
            System.out.println(this.nombre + " procesando item " + i + " - Tiempo " + (System.currentTimeMillis() - this.inicio) / 1000 + "s.");
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
