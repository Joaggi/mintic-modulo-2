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
public class LeerDatosYGuardarlosEnUnVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = Integer.parseInt(sc.nextLine());
        String[] arrayStrings = new String[n];
        
        for(int i=0; i<n; i++){
            arrayStrings[i] = sc.nextLine();
        }
        
        for(String palabra: arrayStrings){
            System.out.println(palabra);
        }
        
        for(int i=0; i<arrayStrings.length; i++){
            System.out.println(arrayStrings[i]);
        }
        
    }
}
