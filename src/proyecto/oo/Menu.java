package proyecto.oo;

import java.io.PrintStream;
import java.util.Scanner;



public class Menu {
    
    private static void probarConjeturas() {
        // Crear e invocar las conjeturas
        Conjetura ulam = new ConjeturaDeUlam(7);
        System.out.println("Conjetura de Ulam prueba resultó: " + ulam.probarConjetura());

        int[] primos = {2, 3, 5, 7, 11, 13, 17};
        Conjetura gilbreath = new ConjeturaDeGilbreath(primos);
        System.out.println("Conjetura de Gilbreath prueba resultó: " + gilbreath.probarConjetura());
    }


    static PrintStream out = System.out;
    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        
        CalculadoraEstadistica CE = new CalculadoraEstadistica();
        MenuAreas MA = new MenuAreas();
        
        int opcion;

        do {
            out.println("*** ¡Bienvenido a la Calculadora de Formas! ***");
            out.println("Menú:");
            out.println("1) Calcular área");
            out.println("2) Calcular perímetro");
            out.println("3) Estadística");
            out.println("4) Conjeturas");
            out.println("5) Salir");
            out.print("\nSeleccione una opción: \n");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        MA.Menu_Areas();
                        break;
                    case 2:
                        MenuPerimetros menuPerimetros = new MenuPerimetros(scanner, out);
                        menuPerimetros.mostrarMenuPerimetros();
                        break;
                    case 3:
                        break;
                    case 4:
                        probarConjeturas ();
                        break;
                    case 5:
                        out.println("Saliendo...");
                        break;
                    default:
                        out.println("¡Opción inválida! ¡Intenta de nuevo!\n");
                }
            } else {
                out.println("\n¡Por favor, ingrese un número entero correspondiente a una opción del menú!\n");
                scanner.nextLine();
                opcion = 0;
            }
        } while (opcion != 5);

    }
}

