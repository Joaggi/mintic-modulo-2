/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.recursivo;

/**
 *
 * @author J_oa_
 */
public class Empleado {
    Empleado jefe;
    
    String nombre;
    Empleado(String nombre){
        this.nombre = nombre;
    }
    
    Empleado(String nombre, Empleado jefe){
        this.nombre = nombre;
        this.jefe = jefe;
    }
}
