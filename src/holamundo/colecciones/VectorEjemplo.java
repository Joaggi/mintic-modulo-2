/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author J_oa_
 */
public class VectorEjemplo {
    public static void main(String[] args) {
        Vector<Integer> arreglo = new Vector<>(); // arreglo = []
        arreglo.add(3); // Agregamos el dato 3 al arreglo, esto es como si en python dijeramos .append
        System.out.println(arreglo);
        arreglo.add(0, 6);
        System.out.println(arreglo);
        arreglo.remove(0); // Eliminar el dato que aparece en la posición 0
        System.out.println(arreglo);
        
        for(int i = 0; i<10; i++){
            arreglo.add(i);
        }
        
        System.out.println(arreglo);
        
        for(int elemento: arreglo){
            System.out.println("El elemento es: " + elemento);
        }
        
        Vector<Object> frutas = (Vector<Object>) new Vector(Arrays.asList("Manzana", "Pera", 3, 5));
        System.out.println(frutas);
    }
    
    // 1. ¿Qué es un arraylist?
    // 2. ¿Por qué tener la implementacion de un arraylist y no un arreglo en java?
    // 3. ¿Qué es una linkedlist?
    // 4. ¿Qué es vector?
    
}
