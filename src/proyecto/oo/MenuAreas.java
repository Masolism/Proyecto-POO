
package proyecto.oo;


///Círculo, Triángulo, Cuadrado, Rectángulo, Rombo, Trapecio, Romboide, Pentágono, Hexágono, Heptágono, Octágono, Eneágono, Decágono

/**
 *
 * @author mariosolis
 */
public class MenuAreas extends Areas {
    
    public void Menu_Areas ()
    {
        
        boolean continuar = true;
        
        while(continuar)
        {
            System.out.println("-- Menu Áreas --\n 1. Calcular Área Círculo\n 2. Calcular Área Triángulo\n 3. Calcular Área Cuadrado\n 4. Calcular Área Rectángulo\n 5. Calcular Área Rombo\n 6. Calcular Área Trapecio\n 7. Calcular Área Romboide\n 8. Calcular Área Polígonos Regulares\n 9. Volver");
            
            int opc = entrada.nextInt();
            
            switch (opc) 
            {
                case 1:
                    AreaCirculo();
                    break;
                case 2: 
                    AreaTriangulo();
                    break;
                case 3: 
                    AreaCuadrado();
                    break;
                case 4:
                    AreaRectangulo();
                    break;
                case 5: 
                    AreaRombo();
                    break;
                case 6:
                    AreaTrapecio();
                    break;
                case 7:
                    AreaRomboide();
                    break;
                case 8:
                    Menu_Poligonos_Regulares ();
                    break;
                case 9: 
                    System.out.println("Volviendo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("-- Opción no disponible --\nIngrese una opción correcta");
                    break;
            }
        }
    }
    
    public void Menu_Poligonos_Regulares ()
    {
        boolean continuar = true;
        
        while(continuar)
        {
            System.out.println("-- Menu Áreas Polígonos Regulares --\n 1. Calcular Área Pentágono\n 2. Calcular Área Hexágono\n 3. Calcular Área Heptágono\n 4. Calcular Área Octágono\n 5. Calcular Área Eneágono\n 6. Calcular Área Decágono\n 7. Volver");
            
            int opc = entrada.nextInt();
            
            switch (opc) 
            {
                case 1:
                    AreaPentagono();
                    break;
                case 2: 
                    AreaHexagono();
                    break;
                case 3:
                    AreaHeptagono();
                    break;
                case 4:
                    AreaOctagono();
                    break;
                case 5:
                    AreaEneagono();
                    break;
                case 6:
                    AreaDecagono();
                    break;
                case 7: 
                    System.out.println("Volviendo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("-- Opción no disponible --\nIngrese una opción correcta");
                    break;
            }
        }
    }
}
