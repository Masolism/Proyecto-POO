package proyecto.poo1;

public class Triangulo extends Figura2D {
    private double lado1;
    private double lado2;
    private double lado3;

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public String getNombre() {
        return nombre;
    }

    public Triangulo(double lado1, double lado2, double lado3, String nombre) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    public double calcularArea (){
        return (0.5 * lado1 * lado2);
    }
    
    public double calcularAreaHeron (){
        double s = (lado1+lado2+lado3)/2;
        return Math.sqrt(s * (s-lado1) * (s-lado2) * (s-lado3));
    }
}
