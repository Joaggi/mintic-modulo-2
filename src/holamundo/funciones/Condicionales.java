/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.funciones;

/**
 *
 * @author J_oa_
 */
public class Condicionales {
    public static void main(String[] args){
        boolean premisa1 = false;
        boolean premisa2 = false;
        // noten que && equivale a la palabra AND de python
        System.out.println(premisa1 && premisa2 );
        
        // noten que || equivale a la palabra OR de python
        System.out.println(premisa1 || premisa2 );
        
        if(premisa1 && premisa2){
            System.out.println("Real");
        }
        else{
            System.out.println("Falso");
        }
    }
    
    
}
