package proyecto.poo1;

public class Trapecio extends Figura2D {
    
    private double baseMayor;
    private double baseMenor;
    private double lado1;
    private double lado2;

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public String getNombre() {
        return nombre;
    }

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
    
    public double calcularArea (){
        return ((baseMenor + baseMayor) * lado1) / 2;
    }
}
