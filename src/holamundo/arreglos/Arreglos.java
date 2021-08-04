/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.arreglos;

import java.util.ArrayList;

/**
 *
 * @author J_oa_
 */
public class Arreglos {
    public static void main(String[] args) {
        int[] arreglo = new int[3];
        
        for(int dato: arreglo)
            System.out.println(dato);
        
        //Esto es lo que conocemos como listas en python
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
//        arrayList.add("334"); //error por se de otro tipo
        arrayList.remove(0);
        System.out.println(arrayList);
        
        Object[] arregloObjeto = new Object[3];
        
        arregloObjeto[0] = "hola";
        arregloObjeto[1] = 3;
        arregloObjeto[2] = new ArrayList<>();
        
        
//        Integer[] arregloEntero = new Integer[3];
//        
//        for(int dato: arregloEntero)
//            System.out.println(dato);
    }
}
