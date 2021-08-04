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
public class MaximoEntreDosNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double maximo = max(a,b);
        System.out.println(maximo);
        
        double maximoConOperadorTernario = maxConOperadorTernario(a,b);
        System.out.println(maximoConOperadorTernario);
    }
    public static double max(double a, double b){
        if(a > b){
            return a;
        }
        else if(a == b) {
            return a;
        }
        else{
            return b;
        }
    }
    public static double maxConOperadorTernario(double a, double b){
        // condicion? true: false;
        return a > b? a : b; 
    }
}
