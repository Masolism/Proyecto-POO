package proyecto.poo1;



public class Imprimir {


    public static String imprimirPerimetro(InterfazCalcularPerimetro figura) {
        String resultadoFormateado = String.format("%.2f", figura.calcularPerimetro());
        return "El perímetro de " + figura.getNombre() + " es: " + resultadoFormateado;
        

    }
    
    

}
