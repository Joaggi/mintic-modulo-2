/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.diccionario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.List;

/**
 *
 * @author J_oa_
 */
public class TreeMapEjemplo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
        treeMap.put(20, "SSH");
        treeMap.put(80, "HTTP");
        // treeMap.put("edad", 80); // Saca error en tiempo de compilación.
        
        System.out.println(treeMap);
        
        TreeMap<Double, String> treeMapDouble = new TreeMap<>();
        
        treeMapDouble.put(20.3, "SSH");
        treeMapDouble.put(20.5, "HTTP");
        treeMapDouble.put(20.6, "Juan María de los Santos"); // Saca error en tiempo de compilación.
        
        System.out.println(treeMapDouble);
        
        
        TreeMap<Object, Object> treeMapObject = new TreeMap<>();
        
        treeMapObject.put(20, "SSH");
        treeMapObject.put(80, "HTTP");
        treeMapObject.put(12100100, "Juan María de los Santos"); // Saca error en tiempo de compilación.
        treeMapObject.put(12100100, 234234); // Saca error en tiempo de compilación.
        
        System.out.println(treeMapObject);
        
        TreeMap<Object, List> treeMapArray = new TreeMap<>();
        
        treeMapArray.put("primos", Arrays.asList(2,3,5,7,11,13,17,19));
        treeMapArray.put("arreglo", Arrays.asList(2,3,5,7,11,13,17,19));
        System.out.println(treeMapArray);
    }
    
    // 1. ¿Qué es un Map?
    // 2. ¿Qué es un HashMap?
    // 3. ¿Qué es un TreeMap?
}
