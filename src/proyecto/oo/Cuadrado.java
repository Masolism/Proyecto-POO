package proyecto.oo;

public class Cuadrado extends Figura2D {
    private double lado;

    public Cuadrado(double lado, String nombre) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
