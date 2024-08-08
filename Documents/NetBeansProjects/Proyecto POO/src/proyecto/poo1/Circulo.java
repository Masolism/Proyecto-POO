package proyecto.poo1;

public class Circulo extends Figura2D {
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    public double calcularArea (){
        return Math.PI * (radio * radio);
    }
}