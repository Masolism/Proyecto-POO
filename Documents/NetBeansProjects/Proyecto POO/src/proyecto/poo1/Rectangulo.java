package proyecto.poo1;

public class Rectangulo extends Figura2D {
    private double largo;

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public String getNombre() {
        return nombre;
    }
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
    
    public double calcularArea(){
        return ancho*largo;
    }
}
