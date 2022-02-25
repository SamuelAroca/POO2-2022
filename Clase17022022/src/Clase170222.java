import java.util.Scanner;

public class Clase170222 {
    public static void main(String[] args) throws Exception {

        double cantidad = 0;
        int opcion;

        CuentaAhorros miCuenta = new CuentaAhorros();
        miCuenta.setNumeroCuenta("178293939543");
        miCuenta.setTitular("Juan Perez");
        miCuenta.setSaldo(1000000);

        try (Scanner scan = new Scanner(System.in)) {
            do {
                System.out.println("Ingrese una opción:");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Retirar");
                System.out.println("0. Salir");
                opcion = scan.nextInt();
                switch (opcion) {
                    case 1 -> {
                        double saldo = miCuenta.consultarSaldo();
                        System.out.println("Su saldo actual es: " + saldo);
                    }
                    case 2 -> {
                        System.out.println("Ingrese la cantidad a depositar:");
                        cantidad = scan.nextDouble();
                        miCuenta.depositar(cantidad);
                    }
                    case 3 -> {
                        System.out.println("Ingrese la cantidad a retirar:");
                        cantidad = scan.nextDouble();
                        miCuenta.retirar(cantidad);
                    }
                }
            } while (opcion != 0);
        }
    }
}
