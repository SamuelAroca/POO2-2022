import java.util.*;
import java.util.stream.Collectors;

import co.edu.unac.poo2.cl03.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*Cliente miCliente = new Cliente(1033283874, "Jose", "Gomez", "josegomez@anymail.com", 3126635482L);
        var miCuenta = new Cuenta(116637484, miCliente, 'A', 1000000.0);
        
        try {
            miCuenta.retiro(300000);
            System.out.println("Depósito exitoso. Su nuevo saldo es de " + miCuenta.getSaldo());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Gracias por utilizar nuestros servicios");
        }*/

        List<String> nombres = Arrays.asList("Jose", "Pedro", "Pablo", "Juan", "Cesar");

        List<String> nombres2 = nombres.stream()
            .filter(n -> n.startsWith("P"))
            .map(n -> n)
            .collect(Collectors.toList());

        nombres2.forEach((n) -> System.out.println(n));
    }
}
