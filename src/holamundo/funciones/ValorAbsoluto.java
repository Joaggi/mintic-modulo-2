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
public class ValorAbsoluto {
    
    final static double CONSTANTE_1 = 3;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(valorAbsoluto(n));
    }
    public static double valorAbsoluto(double x){
        double valor;
        if(x >= 0){
            valor = x;
        }
        else{
            valor = -x;
        }
        return valor;
    }
}
