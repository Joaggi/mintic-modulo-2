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
public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja();
        String s = caja.decorar(10);
        System.out.println(s);
        
        s = caja.decorar(-20.34);
        System.out.println(s);
        
        s = caja.decorar("Pedro Páramo");
        System.out.println(s);
        
        
        CajaObject cajaGenerica = new CajaObject(10);
        String s2 = cajaGenerica.decorar();
        System.out.println(s);
        
        cajaGenerica = new CajaObject(-20.34);
        s = cajaGenerica.decorar();
        System.out.println(s);
        
        cajaGenerica = new CajaObject("Pedro Páramo");
        s = cajaGenerica.decorar();
        System.out.println(s);
        
        System.out.println(cajaGenerica.obtener());
        
        // char a = cajaGenerica.obtener().charAt(5);
        
        char a = ((String)cajaGenerica.obtener()).charAt(1);
        
        System.out.println(a);
        
        String ejemplo = "Ejemplo";
        //ejemplo.charAt(43);
        Object objectEjemplo = (Object)ejemplo; // A esto se le conoce como upcasting
        
        // objectEjemplo.charAt(3);
        
        String downCastingObject = (String)objectEjemplo; // A esto se le conoce como downcasting
        System.out.println(downCastingObject.charAt(2)); 
    }
}
