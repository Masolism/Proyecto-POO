package proyecto.oo;

public class Rombo extends Figura2D {
    private double lado;

    public Rombo(double lado, String nombre) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
