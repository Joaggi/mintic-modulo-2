/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.arreglos;

import java.util.Scanner;

/**
 *
 * @author J_oa_
 */
public class LecturaDeDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int entero1 = sc.nextInt();
        int entero2 = sc.nextInt();
        
        System.out.println(entero1);
        System.out.println(entero2);
        
        int entero3 = sc.nextInt();
        String cadena1 = sc.nextLine();
        
        System.out.println(entero3);
        System.out.println(cadena1);
    }
}
