package proyecto.oo;

public class Romboide extends Figura2D {

    private double base;
    private double altura;

    public Romboide(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
