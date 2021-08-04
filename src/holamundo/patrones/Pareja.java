/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.patrones;

/**
 *
 * @author J_oa_
 * @param <K>
 * @param <V>
 */

//En este caso K y V son genericos, es decir que pueden tomar valores distintos
public class Pareja<K, V>{ //donde K va ser la llave o key, y V va ser el valor o V
    protected K clave;
    protected V valor;
    public Pareja(K clave, V valor){
        this.clave = clave;
        this.valor = valor;
    }
    
    public K clave(){
        return clave;
    }
    public V valor(){
        return valor;
    }
    
    @Override
    public String toString(){
        return "(" + clave + "," + valor + ")"; 
    }

}
