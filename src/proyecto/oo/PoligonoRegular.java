package proyecto.oo;

public class PoligonoRegular extends Figura2D {
    private int numeroLados;
    private double longitudLado;

    public PoligonoRegular(int numeroLados, double longitudLado, String nombre) {
        super(nombre);
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public double calcularPerimetro() {
        return numeroLados * longitudLado;
    }
}

