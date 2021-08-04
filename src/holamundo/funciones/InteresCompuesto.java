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
public class InteresCompuesto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double prestamo = sc.nextDouble();
        double interes = sc.nextDouble();
        System.out.println(interes(prestamo, interes));
    }
    
    public static double interes(double prestamo, double interes){
        return prestamo * (1 + interes) * (1 + interes);
    }
}
