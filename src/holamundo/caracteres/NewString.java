/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.caracteres;

/**
 *
 * @author J_oa_
 */
public class NewString {
    public static void main(String[] args) {
        String hola1 = "hola";
        String hola2 = "hola";
        String hola3 = new String("hola");
        String hola4 = new String("hola");
        
        System.out.println(hola1 == hola2); // True
        System.out.println(hola3 == hola4); // False 
        
        String cadena = "cadena";
        cadena = cadena + " cadena2";
        
        String cadenaCompleta = "cadena cadena2";
        
        System.out.println(cadena == cadenaCompleta); // False
        System.out.println(cadena.equals(cadenaCompleta)); 
    }
}
