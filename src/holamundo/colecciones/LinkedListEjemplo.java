/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author J_oa_
 */
public class LinkedListEjemplo {
    public static void main(String[] args) {
        LinkedList<Integer> arreglo = new LinkedList<>(); // arreglo = []
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
        
        ArrayList<String> arrayList = (ArrayList<String>)Arrays.asList("Manzana", "Pera");
        
        LinkedList<String> frutas = new LinkedList<String>(arrayList);
        
        arreglo.addFirst(3);
        arreglo.addLast(7);
        System.out.println(arreglo.contains(3));
    }
}
