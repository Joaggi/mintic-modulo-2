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
    
    public void hacerPizza(Pizza pizza){
        System.out.println("Haciendo pizza:");
        if(pizza instanceof Hawaina){
            System.out.println("de las pizzas más ricas, guiño guiño");
        }
        if(pizza instanceof Napolitana){
            System.out.println("Napolitana");
        }
        if(pizza instanceof Pepperoni){
            System.out.println("Pepperoni");
        }
    }
    
}
