import ejemplo.*;

public class ElMain {
    public static void main(String[] args) throws Exception {

        /*Cliente cl1 = new Cliente("Cliente 1", new int[] {3, 4, 2, 8, 5, 7});
        Cliente cl2 = new Cliente("Cliente 2", new int[] {3, 2, 5, 6, 4, 5});

        //Caja caja1 = new Caja("Caja 1");
        //Caja caja2 = new Caja("Caja 2");

        long inicio = System.currentTimeMillis();

        CajaThread ct1 = new CajaThread("Caja 1", cl1, inicio);
        CajaThread ct2 = new CajaThread("Caja 2", cl2, inicio);

        ct1.start();
        ct2.start();*/

        Contenedor cont = new Contenedor();
        Productor prod = new Productor(cont);
        Consumidor cons = new Consumidor(cont);

        prod.start();
        cons.start();
    }
}
