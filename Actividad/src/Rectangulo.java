public class Rectangulo extends Figura{
    private Float base;
    private Float altura;

    public Rectangulo(String color, Float base, Float altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    @Override
    public double area(float lado) {
        return this.base * this.altura;
    }

    @Override
    public double area(float base, float altura) {
        return this.base * this.altura;
    }
}
