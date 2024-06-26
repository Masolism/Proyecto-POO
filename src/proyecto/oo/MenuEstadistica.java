package proyecto.oo;

import java.util.Scanner;

public class MenuEstadistica {

    private static CalculadoraEstadistica calculadoraEstadistica = new CalculadoraEstadistica();

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Estadística:");
            System.out.println("1. Calcular sumatoria");
            System.out.println("2. Calcular moda");
            System.out.println("3. Calcular promedio");
            System.out.println("4. Calcular mediana");
            System.out.println("5. Calcular varianza");
            System.out.println("6. Calcular desviación estándar");
            System.out.println("0. Volver al menú principal");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    manejarSumatoria(scanner);
                    break;
                case 2:
                    manejarModa(scanner);
                    break;
                case 3:
                    manejarPromedio(scanner);
                    break;
                case 4:
                    manejarMediana(scanner);
                    break;
                case 5:
                    manejarVarianza(scanner);
                    break;
                case 6:
                    manejarDesviacionEstandar(scanner);
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void manejarSumatoria(Scanner scanner) {
        double[] valores = pedirValores(scanner);
        double resultado = calculadoraEstadistica.calcularSumatoria(valores);
        System.out.println("La sumatoria es: " + resultado);
    }

    private static void manejarModa(Scanner scanner) {
        double[] valores = pedirValores(scanner);
        double resultado = calculadoraEstadistica.calcularModa(valores);
        System.out.println("La moda es: " + resultado);
    }

    private static void manejarPromedio(Scanner scanner) {
        double[] valores = pedirValores(scanner);
        double resultado = calculadoraEstadistica.calcularPromedio(valores);
        System.out.println("El promedio es: " + resultado);
    }

    private static void manejarMediana(Scanner scanner) {
        double[] valores = pedirValores(scanner);
        double resultado = calculadoraEstadistica.calcularMediana(valores);
        System.out.println("La mediana es: " + resultado);
    }

    private static void manejarVarianza(Scanner scanner) {
        double[] valores = pedirValores(scanner);
        double resultado = calculadoraEstadistica.calcularVarianza(valores);
        System.out.println("La varianza es: " + resultado);
    }

    private static void manejarDesviacionEstandar(Scanner scanner) {
        double[] valores = pedirValores(scanner);
        double resultado = calculadoraEstadistica.calcularDesviacionEstandar(valores);
        System.out.println("La desviación estándar es: " + resultado);
    }

    private static double[] pedirValores(Scanner scanner) {
        System.out.print("Ingrese el número de valores: ");
        int n = scanner.nextInt();
        double[] valores = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }
        return valores;
    }
}
