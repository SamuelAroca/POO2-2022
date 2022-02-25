import java.util.*;


public class Listas {

    public static void main(String[] args) throws Exception {

        List<String> nombres = new ArrayList<>();

        nombres.add(0,"Samuel");
        nombres.add(1,"Hamlet");
        nombres.add(2,"Jim");
        nombres.add(3,"Camila");
        nombres.add(4,"Jonathan");
        nombres.add(5,"Jota");
        nombres.add(5,"Brahian");
        nombres.add(7,"Daniela");

        System.out.println(nombres);

        nombres.remove(1);

        System.out.println(nombres.size());
        System.out.println(nombres);

        for(String nom : nombres){
            System.out.println("Nombre:" +nom);
        }

        Map<Integer,String> personas = new HashMap<Integer,String>();

        personas.put(0,"Samuel");
        personas.put(1,"Camila");
        System.out.println(personas);
        personas.put(1,"Daniela");
        System.out.println(personas);
        System.out.println(personas.values());
    }
}
