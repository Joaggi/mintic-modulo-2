/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.ejercicios_repaso.calculadora;

/**
 *
 * @author J_oa_
 */
public class Calculadora {
    Suma suma;
    Resta resta;
    Multiplicacion multiplicacion;
    Division division;

    public Calculadora(Suma suma, Resta resta, Multiplicacion multiplicacion, Division division) {
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
    }
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new Suma(), new Resta(), new Multiplicacion(), new Division());
        
        System.out.println(calculadora.suma.operacion(4, 5));
        
        double division = 3 / 5;
        System.out.println(division); // Java hace la división entera.
    }
}
