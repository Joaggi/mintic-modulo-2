/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.patrones;

/**
 *
 * @author J_oa_
 */
public class CajaObject {
    protected Object obj;
    
    public CajaObject(Object obj) {
        this.obj = obj;
    }
    
    public Object obtener(){
        return this.obj;
    }
    
    public String decorar(){
        String s = obj.toString();
        String linea = "*";
        for(int i = 0; i < s.length(); i++){
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }
}
