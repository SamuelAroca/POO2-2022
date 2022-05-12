package co.edu.unac.cl10.sync;

public class Consumidor extends Thread {

    private Contenedor contenedor;

    public Consumidor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }

    public void run() {
        int value;
        for (int i = 0; i < 10; i++) {
            value = contenedor.get();
            System.out.println("Consumidor --> get: " + value);
        }
    }
}
