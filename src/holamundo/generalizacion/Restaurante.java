/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.generalizacion;

/**
 *
 * @author J_oa_
 */
public class Restaurante {
    
    public int hacerPizza(Pizza pizza) throws Exception{
        System.out.println("Haciendo pizza:");
        if(pizza instanceof Hawaiana){
            System.out.println("de las pizzas más ricas, guiño guiño");
        }
        else if(pizza instanceof Napolitana){
            System.out.println("Napolitana");
        }
        else if(pizza instanceof Pepperoni){
            System.out.println("Pepperoni");
        }
        else{
            throw new Exception();
        }
        
        return 1;
    }
    
}
