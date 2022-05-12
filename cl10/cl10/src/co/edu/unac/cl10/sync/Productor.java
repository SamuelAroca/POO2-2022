package co.edu.unac.cl10.sync;

public class Productor extends Thread {

    private Contenedor contenedor;

    public Productor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            contenedor.put(i);
            System.out.println("Productor --> put: " + i);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
