/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.funciones;

import java.util.Scanner;

/**
 *
 * @author J_oa_
 */
public class Funcion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double entradaPorTeclado = sc.nextDouble();
        System.out.println(funcionCuadrado(entradaPorTeclado));
    }
                                                                                
    public static double funcionCuadrado(double x){
        return x * x;
    } 
}
