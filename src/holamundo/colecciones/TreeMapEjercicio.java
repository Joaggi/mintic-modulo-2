/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.colecciones;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author J_oa_
 */
public class TreeMapEjercicio {
    public static void main(String[] args) {
        TreeMap<String, Object> treeMap1 = new TreeMap<>();
        treeMap1.put("clave1", "valor1actualizada");
        treeMap1.put("clave2", "valor2");
        treeMap1.put("clave3", "valor3");
           
        TreeMap<String, Object> treeMap2 = new TreeMap<>();
        
        treeMap2.put("clave1", "valor1");
        treeMap2.put("clave4", "valor3");
        
        TreeMap<String, Object> treeMapMezcla = (TreeMap)treeMap2.clone();
        
        //Primera forma de resolverlo
        for(Entry<String,Object> elemento: treeMap1.entrySet()){
            treeMapMezcla.put(elemento.getKey(), elemento.getValue());
        }
        System.out.println(treeMapMezcla);
        
        //Segunda solución
        treeMapMezcla = (TreeMap)treeMap2.clone();
        treeMapMezcla.putAll(treeMap1);
        
        System.out.println(treeMapMezcla);
    }
}
