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
public class ExtraerPartesDeUnaCadena {
    public static void main(String[] args) {
        String cadena = "Hola MisionTic 2022";
        
        String parteCadena = cadena.substring(3);
        System.out.println(parteCadena);
        
        parteCadena = cadena.substring(3, 10);
        System.out.println(parteCadena);
        
        parteCadena = cadena.substring(cadena.length()-5);
        System.out.println(parteCadena);
    }
}
