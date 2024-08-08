/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.poo1;

import java.util.LinkedList;

/**
 *
 * @author MarioSolis
 */
public class ConjeturaUlmann implements Conjeturas{
    
    public double num;

    public void setNum(double num) {
        this.num = num;
    }

    public void setResultado(LinkedList resultado) {
        this.resultado = resultado;
    }

    public double getNum() {
        return num;
    }

    public LinkedList getResultado() {
        return resultado;
    }

    LinkedList resultado = new LinkedList();


    public void calcular()
    {
        resultado.clear();
        while (num != 1){
            resultado.add(num);
            if (num % 2 == 0){
                num = num/2;
            }
            else {
                num = 3 * num + 1;
            }
        }
        resultado.add(1.0);
    }
}
