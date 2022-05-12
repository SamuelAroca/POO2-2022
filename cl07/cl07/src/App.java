import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final String READ_FILE = "prueba.txt";
    private static final String WRITE_FILE = "prueba.txt";
    public static void main(String[] args) throws Exception {
        
        /*try {
            File file = new File(READ_FILE);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }*/

        List<String> chicho = new ArrayList<>();

        chicho.add("Shaiel");
        chicho.add("A Jim");
        chicho.add("Al perro");
        /*
        for (String s : chicho) {
            System.out.println(s);
        }

         */
        chicho.forEach(System.out::println);



        /*
        try {
            FileWriter fwriter = new FileWriter(WRITE_FILE);
            PrintWriter pwriter = new PrintWriter(fwriter);
            for (int i = 0; i < 10; i++) {
                pwriter.println("Ejemplosfsdf " + i);
            }
            fwriter.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

         */
    }
}
