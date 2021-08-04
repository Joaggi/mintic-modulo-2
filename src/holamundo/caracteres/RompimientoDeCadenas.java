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
public class RompimientoDeCadenas {
    public static void main(String[] args) {
        String cadena = "Hoy hace un bonito día";
        String[] stringArray = cadena.split(" ");
        
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        
        for(String palabra : stringArray){
            System.out.println(palabra);
        }
    }
}
