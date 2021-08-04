/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author J_oa_
 */
public class ReversoDeUnaLista {
    public static void main(String[] args) {
        List lista = Arrays.asList("34", 43, 2, 4, 632, 2);
        
        ArrayList listaAlReves = new ArrayList();
        for(int i = lista.size(); i>0; i--){
            listaAlReves.add(lista.get(i-1));
        }
        
        System.out.println(listaAlReves);
        
        Collections.reverse(lista);
        System.out.println(lista);
        
        
    }
}
