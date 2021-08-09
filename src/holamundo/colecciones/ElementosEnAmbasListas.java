/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author J_oa_
 */
public class ElementosEnAmbasListas {
    public static void main(String[] args) {
        List<Integer> array1 = Arrays.asList(3,5,6,2,1,23,54,64);
        List<Integer> array2 = Arrays.asList(6,2,53,23,64);
        
        ArrayList<Integer> arrayComparacion = new ArrayList<>();
        
        for(Integer elemento: array1){
            if(array2.contains(elemento)){
                arrayComparacion.add(elemento);
            }
        }
        
        System.out.println(arrayComparacion);
        
        arrayComparacion = new ArrayList<>();
        
        for(Integer elemento1: array1){
            for(Integer elemento2: array2){
                if(elemento1.equals(elemento2)){
                    arrayComparacion.add(elemento1);
                }
            }
        }
        
        System.out.println(arrayComparacion);
        
    }
}
