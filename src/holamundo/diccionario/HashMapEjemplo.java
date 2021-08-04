/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.diccionario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author J_oa_
 */
public class HashMapEjemplo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        hashMap.put(20, "SSH");
        hashMap.put(80, "HTTP");
        // hashMap.put("edad", 80); // Saca error en tiempo de compilación.
        
        System.out.println(hashMap);
        
        HashMap<Double, String> hashMapDouble = new HashMap<>();
        
        hashMapDouble.put(20.3, "SSH");
        hashMapDouble.put(20.5, "HTTP");
        hashMapDouble.put(20.6, "Juan María de los Santos"); // Saca error en tiempo de compilación.
        
        System.out.println(hashMapDouble);
        
        
        HashMap<Object, Object> hashMapObject = new HashMap<>();
        
        hashMapObject.put(20, "SSH");
        hashMapObject.put(80, "HTTP");
        hashMapObject.put("edad", 80); // Saca error en tiempo de compilación.
        hashMapObject.put("edad", "Lenguaje de programación"); // Saca error en tiempo de compilación.
        hashMapObject.put(12100100, "Juan María de los Santos"); // Saca error en tiempo de compilación.
        hashMapObject.put("primos", Arrays.asList(2,3,5,7,11,13,17,19));
        System.out.println(hashMapObject);
        
        HashMap<Object, List> hashMapArray = new HashMap<>();
        
        hashMapArray.put("primos", Arrays.asList(2,3,5,7,11,13,17,19));
        hashMapArray.put("arreglo", Arrays.asList(2,3,5,7,11,13,17,19));
        System.out.println(hashMapArray);
    }
}
