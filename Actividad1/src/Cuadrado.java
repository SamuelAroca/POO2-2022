public class Cuadrado extends Figura{

    private Float lado;

    public Cuadrado(String color, Float lado) {
        super(color);
        this.lado = lado;
    }

    public Float getLado() {
        return lado;
    }

    public void setLado(Float lado) {
        this.lado = lado;
    }

    @Override
    public double area(float lado) {
        return Math.pow(lado,2);
    }

    @Override
    public double area(float base, float altura) {
        return 0;
    }
}