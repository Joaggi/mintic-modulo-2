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
public class IgualdadEnJava {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        
        System.out.println(a==b);
        
        float f1 = 3.3F;
        float f2 = 3.3F;
        System.out.println(f1 == f2);
        
        Integer integer1 = new Integer(3);
        Integer integer2 = new Integer(3);
        System.out.print("comparacion integer: ");
        System.out.println(integer1 == integer2);
        
        
        Float objectoF1 = 3.3F;
        
        String cadena1 = new String("Hola");
        String cadena2 = new String("Hola");
        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println(cadena1.hashCode());
        System.out.println(cadena1 == cadena2);
        
        System.out.println(cadena1.equals(cadena2));
    }
    
}
