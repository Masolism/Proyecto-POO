package proyecto.poo1;

public class PoligonoRegular extends Figura2D {
    private double numeroLados;
    private double longitudLado;

    public void setNumeroLados(double numeroLados) {
        this.numeroLados = numeroLados;
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNumeroLados() {
        return numeroLados;
    }

    public double getLongitudLado() {
        return longitudLado;
    }

    public String getNombre() {
        return nombre;
    }

    public PoligonoRegular(double numeroLados, double longitudLado, String nombre) {
        super(nombre);
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    @Override
    public double calcularPerimetro() {
        return numeroLados * longitudLado;
    }
    
    public double areaPentagono () {
        return ((1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * numeroLados * numeroLados);
    }
    
    public double areaHexagono (){
        return ((3 * Math.sqrt(3) / 2) * numeroLados * numeroLados);
    }
    
    public double areaHeptagono (){
        return ((7.0 / 4.0) * numeroLados * numeroLados * (1.0 / Math.tan(Math.PI / 7)));
    }
    public double areaOctagono() {
        return (2 * (1 + Math.sqrt(2)) * numeroLados * numeroLados);
    }

    public double areaEneagono() {
        return((9.0 / 4.0) * numeroLados * numeroLados * (1.0 / Math.tan(Math.PI / 9)));
    }

    
    public double areaDecagono() {
        return ((5.0 / 2.0) * numeroLados * numeroLados * Math.sqrt(5 + 2 * Math.sqrt(5)));
    }
}


