package proyecto.oo;

public class Trapecio extends Figura2D {
    
    private double baseMayor;
    private double baseMenor;
    private double lado1;
    private double lado2;

    public Trapecio(double baseMayor, double baseMenor, double lado1, double lado2, String nombre) {
        super(nombre);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}
