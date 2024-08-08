
package proyecto.poo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MarioSolis
 */
public class ConjeturaGilbreath {
    
    public int n;
    
    public String calcular (String cadena){
        List<Integer> primos = generarPrimos(n);
        List<List<Integer>> secuencias = calcularGilbreath (primos);

        
        for (int i = 0; i < secuencias.size(); i++) {
            cadena += "Secuencia " + (i + 1) + ": " + secuencias.get(i) + "\n";
        }
        return cadena;
    }
    
     public static List<Integer> generarPrimos(int n) {
        List<Integer> primos = new ArrayList<>();
        int count = 0;
        int num = 2;

        while (count < n) {
            if (verificarPrimo(num)) {
                primos.add(num);
                count++;
            }
            num++;
        }
        return primos;
    }
    
     public static boolean verificarPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    } 
     
    public static List<List<Integer>> calcularGilbreath(List<Integer> primos) {
        List<List<Integer>> secuencias = new ArrayList<>();
        secuencias.add(new ArrayList<>(primos));

        List<Integer> actual = primos;

        while (actual.size() > 1) {
            List<Integer> siguiente = new ArrayList<>();
            for (int i = 1; i < actual.size(); i++) {
                siguiente.add(Math.abs(actual.get(i) - actual.get(i - 1)));
            }
            secuencias.add(siguiente);
            actual = siguiente;
        }

        return secuencias;
    }
}
