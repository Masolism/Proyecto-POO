package proyecto.oo;

import java.io.PrintStream;

public class Imprimir {

    static PrintStream out = System.out;

    public static String imprimirPerimetro(InterfazCalcularPerimetro figura) {
        String resultadoFormateado = String.format("%.2f", figura.calcularPerimetro());
        return "El perímetro de " + figura.getNombre() + " es: " + resultadoFormateado;
        

    }

}
