import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Funciones implements Function<String,Integer> {

    public Integer apply(String s){
        return s.length();
    }

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Chicho", "Jim", "Samuel");
        /*
        for (int i = 0; i<nombres.size();i++ ){
            System.out.println(nombres.get(2));
        }
        for (String s: nombres){
            System.out.println(s);
        }*/
        //nombres.forEach((s) -> System.out.println(s));

        List<String> nombres2 = new ArrayList<>();
        for (String s : nombres2){
            if (s.startsWith("S")){

            }
        }
        List<String> nombres3 = nombres.stream().filter(n -> n.startsWith("S")).map(n -> n).collect(Collectors.toList());

        nombres3.forEach((n) -> System.out.println(n));
    }
}
