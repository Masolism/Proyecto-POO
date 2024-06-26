package proyecto.oo;

public abstract class Figura2D {
    protected String nombre;

    public Figura2D(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularPerimetro();
}
