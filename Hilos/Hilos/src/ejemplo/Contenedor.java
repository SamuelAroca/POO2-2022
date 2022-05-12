package ejemplo;

public class Contenedor {

    private int data;
    private boolean isData = false;

    public synchronized int get() {
        while (isData == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        isData = false;
        notifyAll();
        return data;
    }

    public synchronized void put(int value) {
        while(isData == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        isData = true;
        notifyAll();
    }
}
