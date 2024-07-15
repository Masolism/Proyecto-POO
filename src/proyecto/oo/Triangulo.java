package proyecto.oo;

public class Triangulo extends Figura2D {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3, String nombre) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
