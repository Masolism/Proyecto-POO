package proyecto.oo;

public class Circulo extends Figura2D {
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}