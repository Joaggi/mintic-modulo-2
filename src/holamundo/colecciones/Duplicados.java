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
public class Duplicados {
    public static ArrayList eliminarDuplicados(List listaOriginal){
        ArrayList listaNueva = new ArrayList<>();
        
        for(Object elemento: listaOriginal){
            if(!listaNueva.contains(elemento)){
                listaNueva.add(elemento);
            }
        }
        return listaNueva;
    }
    
    public static void main(String[] args) {
        List lista = Arrays.asList("99", 3 ,4 ,3 , 6, 4, "99");
        System.out.println(lista);
        System.out.println(eliminarDuplicados(lista));
        
    }
}
