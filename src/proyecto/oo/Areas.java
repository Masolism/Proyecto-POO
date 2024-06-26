
package proyecto.oo;

import java.util.Scanner;

public class Areas {
    
    ///Círculo, Triángulo, Cuadrado, Rectángulo, Rombo, Trapecio, Romboide, Pentágono, Hexágono, Heptágono, Octágono, Eneágono, Decágono
       
    Scanner entrada = new Scanner(System.in);
    
    public static double radio;
    public static double lado;
    public static double base;
    public static double altura;
    public static double diagonalMayor;
    public static double diagonalMenor;
    public static double baseMayor;
    public static double baseMenor;
    public static double area;

    public void Areas() 
    {
        this.radio = 0;
        this.lado = 0;
        this.base = 0;
        this.altura = 0;
        this.diagonalMayor = 0;
        this.diagonalMenor = 0;
        this.baseMayor = 0;
        this.baseMenor = 0;
        this.area = 0;
    }

    public static void setRadio(double radio) {
        Areas.radio = radio;
    }

    public static void setLado(double lado) {
        Areas.lado = lado;
    }

    public static void setBase(double base) {
        Areas.base = base;
    }

    public static void setAltura(double altura) {
        Areas.altura = altura;
    }

    public static void setDiagonalMayor(double diagonalMayor) {
        Areas.diagonalMayor = diagonalMayor;
    }

    public static void setDiagonalMenor(double diagonalMenor) {
        Areas.diagonalMenor = diagonalMenor;
    }

    public static void setBaseMayor(double baseMayor) {
        Areas.baseMayor = baseMayor;
    }

    public static void setBaseMenor(double baseMenor) {
        Areas.baseMenor = baseMenor;
    }

    public static void setArea(double area) {
        Areas.area = area;
    }

    public static double getRadio() {
        return radio;
    }

    public static double getLado() {
        return lado;
    }

    public static double getBase() {
        return base;
    }

    public static double getAltura() {
        return altura;
    }

    public static double getDiagonalMayor() {
        return diagonalMayor;
    }

    public static double getDiagonalMenor() {
        return diagonalMenor;
    }

    public static double getBaseMayor() {
        return baseMayor;
    }

    public static double getBaseMenor() {
        return baseMenor;
    }

    public static double getArea() {
        return area;
    }
    
    public void AreaCirculo ()
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setRadio(0);
            setArea(0);
            
            System.out.println("--Area Círculo --\n Ingrese el radio del círculo en cm: ");
            setRadio(entrada.nextDouble());
            if (radio>0)
            {
                setArea(Math.PI *(radio * radio));
                System.out.println("--Area Círculo --\n El área del círculo con radio " + getRadio() + "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa!");  
            }
        }
    }
    
    public void AreaTriangulo () 
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setBase(0);
            setAltura(0);
            setArea(0);
            
            System.out.println("--Área Triángulo --\n Ingrese la base del triángulo en cm");
            setBase(entrada.nextDouble());
            
            System.out.println("--Área Triángulo --\n Ingrese la altura del triángulo en cm");
            setAltura(entrada.nextDouble());
            
            if (base>0 && altura >0)
            {
                setArea(0.5 * base * altura);
                System.out.println("El área del triángulo con base  " + getBase()+ "cm y la altura "+ getAltura() + "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa");  
            }
        }
    }
    
    public void AreaCuadrado () 
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setLado(0);
            setArea(0);
            
            System.out.println("--Área Cuadrado --\n Ingrese el lado del cuadrado en cm");
            setLado(entrada.nextDouble());
            
            if (lado>0)
            {
                setArea(lado*lado);
                System.out.println("El área del cuadrado con lado de " + getLado() + "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa");  
            }
        }
    }
    
    public void AreaRectangulo ()        
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setBase(0);
            setAltura(0);
            setArea(0);
            
            System.out.println("--Área Rectángulo --\n Ingrese la base del rectángulo en cm");
            setBase(entrada.nextDouble());
            
            System.out.println("--Área Rectángulo --\n Ingrese la altura del rectángulo en cm");
            setAltura(entrada.nextDouble());
            
            if (base>0 && altura >0)
            {
                setArea(base * altura);
                System.out.println("El área del rectángulo con base  " + getBase()+ "cm y la altura "+ getAltura() + "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa");  
            }
        }
    }
    
    public void AreaRombo ()        
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setDiagonalMayor(0);
            setDiagonalMenor(0);
            setArea(0);
            
            System.out.println("--Área Rombo --\n Ingrese la diagonal mayor del rombo en cm");
            setDiagonalMayor(entrada.nextDouble());
            
            System.out.println("--Área Rombo --\n Ingrese la diagonal menor del rombo en cm");
            setDiagonalMenor(entrada.nextDouble());
            
            if (diagonalMayor>0 && diagonalMenor >0)
            {
                setArea((diagonalMayor * diagonalMenor) / 2);
                System.out.println("El área del rombo con diagonal mayor de " + getDiagonalMayor()+ "cm y con diagonal menor de "+ getDiagonalMenor()+ "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa");  
            }
        }
    }
    
    public void AreaTrapecio ()        
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setBaseMayor(0);
            setBaseMenor(0);
            setAltura(0);
            setArea(0);
            
            System.out.println("--Área Trapecio --\n Ingrese la base mayor del trapecio en cm");
            setBaseMayor(entrada.nextDouble());
            
            System.out.println("--Área Trapecio --\n Ingrese la base menor del trapecio en cm");
            setBaseMenor(entrada.nextDouble());
            
            System.out.println("--Área Trapecio --\n Ingrese la altura del trapecio en cm");
            setAltura(entrada.nextDouble());
            
            if (baseMayor>0 && baseMenor >0 && altura > 0)
            {
                setArea(((baseMayor + baseMenor)* altura) / 2);
                System.out.println("El área del trapecio con base mayor de " + getBaseMayor()+ "cm, con base menor de "+ getBaseMenor() + "cm y con altura de " + getAltura() + "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa");  
            }
        }
    }
    
    public void AreaRomboide ()
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setBase(0);
            setAltura(0);
            setArea(0);
            
            System.out.println("--Área Romboide --\n Ingrese la base del romboide en cm");
            setBase(entrada.nextDouble());
            
            System.out.println("--Área Romboide --\n Ingrese la altura del romboide en cm");
            setAltura(entrada.nextDouble());
            
            if (base>0 && altura >0)
            {
                setArea(base * altura);
                System.out.println("El área del Romboide con base  " + getBase()+ "cm y la altura "+ getAltura() + "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa");  
            }
        }
    }
    
    public void AreaPentagono () 
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setLado(0);
            setArea(0);
            
            System.out.println("--Área Pentágono --\n Ingrese el lado del pentágono en cm");
            setLado(entrada.nextDouble());
            
            if (lado>0)
            {
                setArea((1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * lado * lado);
                System.out.println("El área del pentágono con lado de " + getLado() + "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa");  
            }
        }
    }
    
    public void AreaHexagono () 
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setLado(0);
            setArea(0);
            
            System.out.println("--Área Hexágono --\n Ingrese el lado del hexágono en cm");
            setLado(entrada.nextDouble());
            
            if (lado>0)
            {
                setArea((3 * Math.sqrt(3) / 2) * lado * lado);
                System.out.println("El área del hexágono con lado de " + getLado() + "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa");  
            }
        }
    }
    
    public void AreaHeptagono () ///
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setLado(0);
            setArea(0);
            
            System.out.println("--Área Heptágono --\n Ingrese el lado del heptágono en cm");
            setLado(entrada.nextDouble());
            
            if (lado>0)
            {
                setArea((7.0 / 4.0) * lado * lado * (1.0 / Math.tan(Math.PI / 7)));
                System.out.println("El área del heptágono con lado de " + getLado() + "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa");  
            }
        }
    }
    
    public void AreaOctagono () 
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setLado(0);
            setArea(0);
            
            System.out.println("--Área Octágono --\n Ingrese el lado del octágono en cm");
            setLado(entrada.nextDouble());
            
            if (lado>0)
            {
                setArea(2 * (1 + Math.sqrt(2)) * lado * lado);
                System.out.println("El área del octágono con lado de " + getLado() + "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa");  
            }
        }
    }
    
    public void AreaEneagono () ////
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setLado(0);
            setArea(0);
            
            System.out.println("--Área Eneágono --\n Ingrese el lado del eneágono en cm");
            setLado(entrada.nextDouble());
            
            if (lado>0)
            {
                setArea((9.0 / 4.0) * lado * lado * (1.0 / Math.tan(Math.PI / 9)));
                System.out.println("El área del eneágono con lado de " + getLado() + "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa");  
            }
        }
    }
    
    public void AreaDecagono () 
    {
        boolean continuar = true;
        
        while(continuar)
        {
            setLado(0);
            setArea(0);
            
            System.out.println("--Área Decágono --\n Ingrese el lado del decágono en cm");
            setLado(entrada.nextDouble());
            
            if (lado>0)
            {
                setArea((5.0 / 2.0) * lado * lado * Math.sqrt(5 + 2 * Math.sqrt(5)));
                System.out.println("El área del decágono con lado de " + getLado() + "cm es de " + getArea() + " unidades cuadradas\n");
                continuar=false;
            }
            else
            {
                System.out.println("La longitud no puede ser nula o negativa");  
            }
        }
    }
}
