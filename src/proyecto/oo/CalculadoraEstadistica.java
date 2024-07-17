package proyecto.oo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CalculadoraEstadistica implements Estadistica {

    @Override
    public double calcularSumatoria(double[] valores) {
        assert valores != null : "El array de valores no debe ser null";
        assert valores.length > 0 : "El array de valores debe contener al menos un elemento";
        
        double sumatoria = 0;
        for (double valor : valores) {
            sumatoria += valor;
        }
        return sumatoria;
    }

    @Override
    public double calcularModa(double[] valores) {
        assert valores != null : "El array de valores no debe ser null";
        assert valores.length > 0 : "El array de valores debe contener al menos un elemento";
        
        Map<Double, Integer> frecuencia = new HashMap<>();
        for (double valor : valores) {
            if (frecuencia.containsKey(valor)) {
                frecuencia.put(valor, frecuencia.get(valor) + 1);
            } else {
                frecuencia.put(valor, 1);
            }
        }
        
        double moda = valores[0];
        int maxFrecuencia = 1;
        
        for (Map.Entry<Double, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                moda = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }
        
        return moda;
    }

    @Override
    public double calcularPromedio(double[] valores) {
        assert valores != null : "El array de valores no debe ser null";
        assert valores.length > 0 : "El array de valores debe contener al menos un elemento";
        
        double sumatoria = calcularSumatoria(valores);
        return sumatoria / valores.length;
    }

    @Override
    public double calcularMediana(double[] valores) {
        assert valores != null : "El array de valores no debe ser null";
        assert valores.length > 0 : "El array de valores debe contener al menos un elemento";
        
        Arrays.sort(valores);
        int n = valores.length;
        if (n % 2 == 0) {
            return (valores[n / 2 - 1] + valores[n / 2]) / 2.0;
        } else {
            return valores[n / 2];
        }
    }

    @Override
    public double calcularVarianza(double[] valores) {
        assert valores != null : "El array de valores no debe ser null";
        assert valores.length > 0 : "El array de valores debe contener al menos un elemento";
        
        double promedio = calcularPromedio(valores);
        double sumaDiferenciasCuadradas = 0;
        for (double valor : valores) {
            sumaDiferenciasCuadradas += Math.pow(valor - promedio, 2);
        }
        return sumaDiferenciasCuadradas / valores.length;
    }

    @Override
    public double calcularDesviacionEstandar(double[] valores) {
        assert valores != null : "El array de valores no debe ser null";
        assert valores.length > 0 : "El array de valores debe contener al menos un elemento";
        
        double varianza = calcularVarianza(valores);
        return Math.sqrt(varianza);
    }
}
