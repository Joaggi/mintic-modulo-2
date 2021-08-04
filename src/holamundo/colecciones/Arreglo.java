/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.colecciones;

/**
 *
 * @author J_oa_
 */
public class Arreglo {
    public static void main(String[] args) {
        int[] arregloEntero = new int[3];
        
        arregloEntero[0] = 3;
        arregloEntero[1] = 34;
        arregloEntero[2] = 35;
        
        for(int elemento: arregloEntero){
            System.out.println(elemento);
        }
    }
}
