/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.ciclos;

/**
 *
 * @author J_oa_
 */
public class DireccionDeMemoriaObjeto {
    public static void main(String[] args) {
        DireccionDeMemoriaObjeto direccion = new DireccionDeMemoriaObjeto();
        System.out.println(direccion.toString());
        
        DireccionDeMemoriaObjeto direccion2 = new DireccionDeMemoriaObjeto();
        System.out.println(direccion2.toString());
        
        System.out.println(direccion == direccion2);
    }
}
