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
public class AreaDeUnRectangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        int a = sc.nextInt();
        double area = areaRectanguloEntero(l, a);
        System.out.println(area);
        
    }
    
    public static double areaRectangulo(double l, double a){
        return l * a;
    }
    
    public static int areaRectanguloEntero(double l, int a){
        return (int)(l * a);
    }
}
