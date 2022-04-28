import java.io.*;



public class EntradaDeDatos {
    private static final String READ_LINE = "Prueba.txt";
    public static void main(String[] args) throws IOException {

        try {
            File file = new File(READ_LINE);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            System.out.println(reader);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
