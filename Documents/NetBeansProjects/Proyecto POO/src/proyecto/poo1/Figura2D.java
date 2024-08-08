package proyecto.poo1;

public abstract class Figura2D implements InterfazCalcularPerimetro {

    protected String nombre;

    public Figura2D(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
