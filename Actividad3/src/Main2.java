import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import co.edu.unac.poo2.cl03.Contacto;

public class Main2 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int option;

        List<Contacto> contactos = new ArrayList<Contacto>();
        
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
                        Contacto con = new Contacto();
                        con.setNombre(nombre);
                        con.setNumero(numero);
                        contactos.add(con);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    contactos.forEach((c) -> System.out.println("Número: " + c.getNumero() + ", Nombre: " + c.getNombre()));
                    break;
                case 3:
                    System.out.println("Ingresar el texto de búsqueda:");
                    String texto = scan.next();
                    try {
                        List<Contacto> contactos2 = contactos.stream()
                            .filter(v -> v.getNombre().startsWith(texto))
                            .map(v -> v)
                            .collect(Collectors.toList());
                        
                        contactos2.forEach((v) -> System.out.println("Número: " + v.getNumero() + ", Nombre: " + v.getNombre()));
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
            }
        } while (option != 0);
    }
}
