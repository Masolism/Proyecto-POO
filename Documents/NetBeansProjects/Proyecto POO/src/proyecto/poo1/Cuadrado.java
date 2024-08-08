package proyecto.poo1;

public class Cuadrado extends Figura2D {
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLado() {
        return lado;
    }

    public String getNombre() {
        return nombre;
    }

    public Cuadrado(double lado, String nombre) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    public double calcularArea (){
        return lado * lado;
    }
}
