package proyecto.oo;

public class Rectangulo extends Figura2D {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho, String nombre) {
        super(nombre);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}
