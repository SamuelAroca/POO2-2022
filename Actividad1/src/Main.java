public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("azul", 2f);

        System.out.println(cuadrado.area(5));
        System.out.println(cuadrado.color);

        System.out.println(" ");

        Rectangulo rectangulo = new Rectangulo("rojo", 2f, 4f);

        System.out.println(rectangulo.color);
        System.out.println(rectangulo.area(2f, 4f));

        System.out.println(" ");

        Triangulo triangulo = new Triangulo("Verde", 2f, 4f);

        System.out.println(triangulo.color);
        System.out.println(triangulo.area(2,4));
        System.out.println("Holas");
    }
}
