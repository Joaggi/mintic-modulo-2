/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.colecciones;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author J_oa_
 */
public class SubHashmap {
    public static void main(String[] args) {
        HashMap<String, Object> hashMapGrande = new HashMap<>();
        hashMapGrande.put("clave1", "valor1");
        hashMapGrande.put("clave2", "valor2");
        hashMapGrande.put("clave3", "valor3");
        
        HashMap<String, Object> hashMapPequeno = new HashMap<>();
        
        hashMapPequeno.put("clave1", "valor1");
        hashMapPequeno.put("clave2", "valor2");
        
        boolean bandera = true;
        
        Set<String> llavesHashMapGrande = hashMapGrande.keySet();
        
        for(String clave: hashMapPequeno.keySet()){
            if(!llavesHashMapGrande.contains(clave)){ // not
                bandera = false;
                break;
            }
            else{
                Object valorPequeno = hashMapPequeno.get(clave);
                Object valorGrande = hashMapGrande.get(clave);
                if(!valorPequeno.equals(valorGrande)){
                    bandera = false;
                    break;
                }
            }
        }
        
        System.out.println(bandera);
                
    }
}
