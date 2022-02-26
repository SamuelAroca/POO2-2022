import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> PlayLIst = new ArrayList<>();

        PlayLIst.add("La Mayonesa");
        PlayLIst.add("Un Mundo Ideal");
        PlayLIst.add("No se habla de Bruno");


        try (Scanner scanner = new Scanner(System.in)) {

            int opcion;
            do {
                System.out.println("Esta es la PlayList");
                System.out.println(" ");
                System.out.println(PlayLIst);
                System.out.println("       0              1                 2              etc");
                System.out.println(" ");
                System.out.println("Ingrese una opcion");
                System.out.println("1.Agregar cancion a la PlayList");
                System.out.println("2.De volver titulo de la cancion");
                System.out.println("3.Eliminar cancion de la PlayList");
                System.out.println("4.Reemplazar titulo de la cancion ");
                System.out.println("5.Devolver el numero de canciones de la PlayList");
                System.out.println("0.Para salir del programa");
                opcion = scanner.nextInt();
                if (opcion > 5 || opcion < 0){
                    System.out.println("Esta fuera de los limites de las opciones");
                    System.out.println(" ");
                    
                }
                else{
                    switch (opcion) {
                        case 1 -> {
                            System.out.println("Digite el nombre de la cancion");
                            Scanner scanner1 = new Scanner(System.in);
                            String nombre = scanner1.nextLine();
                            PlayLIst.add(nombre);
                            System.out.println(" ");
                            System.out.println("PlayList actual");
                            System.out.println(PlayLIst);
                            System.out.println(" ");
                        }
                        case 2 -> {
                            System.out.println("Digite la posicion de la cancion deseada");
                            Scanner scanner2 = new Scanner(System.in);
                            int posicion = scanner2.nextInt();
                            if (posicion > (PlayLIst.size())) {
                                System.out.println("Esta fuera de los limites");
                                System.out.println(" ");
                            } else {
                                System.out.println(PlayLIst.get(posicion));
                                System.out.println(" ");
                            }
                        }
                        case 3 -> {
                            System.out.println("Escriba la posicion a eliminar deseada");
                            Scanner scanner3 = new Scanner(System.in);
                            int delete = scanner3.nextInt();
                            if (delete > (PlayLIst.size())) {
                                System.out.println("Esta fuera de los limites");
                                System.out.println(" ");
                            } else {
                                System.out.println("La cancion eliminada fue: " + PlayLIst.remove(delete));
                                System.out.println(" ");
                            }
                            System.out.println("Su nueva PlayList");
                            System.out.println(" ");
                            System.out.println(PlayLIst);
                            System.out.println(" ");
                        }
                        case 4 -> {
                            System.out.println("Reemplazar cancion");
                            System.out.println(" ");
                            Scanner scanner4 = new Scanner(System.in);
                            System.out.println("Su PlayList actual");
                            System.out.println(PlayLIst);
                            System.out.println(" ");
                            System.out.println("Digite el indice de la cancion que quiere remplazar");
                            System.out.println(" ");
                            int remplazar = scanner4.nextInt();
                            if (remplazar > PlayLIst.size()) {
                                System.out.println("Esta fuera de los limites");
                                System.out.println(" ");
                            } else {
                                Scanner scanner5 = new Scanner(System.in);
                                PlayLIst.remove(remplazar);
                                System.out.println("Introduzca el nombre de la nueva cancion");
                                String NuevoNom = scanner5.nextLine();
                                PlayLIst.add(remplazar, NuevoNom);
                                System.out.println(" ");
                                System.out.println(PlayLIst);
                                System.out.println(" ");
                            }
                        }
                        case 5 -> {
                            System.out.println("Numero de canciones de la PlayList");
                            System.out.println(" ");
                            System.out.println("El numero de canciones en la PlayList es: " + PlayLIst.size());
                            System.out.println(" ");
                        }
                    }

                }
                    
                
                    
            } while (opcion != 0);

        }catch (Exception e){
            System.out.println("Se digito mal la opcion. Tiene que ser un numero de las opciones");
        }

    }
}
