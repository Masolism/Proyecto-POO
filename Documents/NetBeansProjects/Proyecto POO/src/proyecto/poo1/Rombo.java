package proyecto.poo1;

public class Rombo extends Figura2D {
    private double lado;
    private double DiagonalMayor;
    private double DiagonalMenor;

    public double getLado() {
        return lado;
    }

    public double getDiagonalMayor() {
        return DiagonalMayor;
    }

    public double getDiagonalMenor() {
        return DiagonalMenor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setDiagonalMayor(double DiagonalMayor) {
        this.DiagonalMayor = DiagonalMayor;
    }

    public void setDiagonalMenor(double DiagonalMenor) {
        this.DiagonalMenor = DiagonalMenor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rombo(double lado, double DiagonalMayor, double DiagonalMenor, String nombre) {
        super(nombre);
        this.lado = lado;
        this.DiagonalMayor = DiagonalMayor;
        this.DiagonalMenor = DiagonalMenor;
    }

    
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    public double calcularArea (){
        return DiagonalMayor * DiagonalMenor;
    }
}
