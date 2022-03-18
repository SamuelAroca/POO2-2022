import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int option;

        Map<Long, String> contactos = new HashMap<Long, String>();

        do {
            System.out.println("Ingrese una opción");
            System.out.println("1. Crear contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contactos");
            System.out.println("0. Salir");
            option = scan.nextInt();
            switch(option) {
                case 1:
                    try {
                        System.out.println("Ingresar número:");
                        long numero = scan.nextLong();
                        System.out.println("Ingresar nombre:");
                        String nombre = scan.next();
                        contactos.put(numero, nombre);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    contactos.forEach((k, v) -> System.out.println("Número: " + k + ", Nombre: " + v));
                    break;
                case 3:
                    System.out.println("Ingresar el texto de búsqueda:");
                    String texto = scan.next();
                    try {
                        Map<Long, String> contactosBusqueda = contactos.entrySet().stream()
                            .filter(v -> v.getValue().startsWith(texto))
                            .collect(Collectors.toMap(v -> v.getKey(), v -> v.getValue()));
                        
                            contactosBusqueda.forEach((k, v) -> System.out.println("Número: " + k + ", Nombre: " + v));
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
            }
        } while (option != 0);
    }
}
