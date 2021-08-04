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
public class Main {
    public static void main(String[] args) {
        Empleado juan = new Empleado("Juan");
        Empleado diego = new Empleado("Diego", juan);
        Empleado alicia = new Empleado("Alicia", diego);
        Empleado ana = new Empleado("Ana", juan);
        
        
    }
}
