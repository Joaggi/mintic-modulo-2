/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.generalizacion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author J_oa_
 */
public class RestauranteTest {
    
    /**
     * Test of hacerPizza method, of class Restaurante.
     */
    @Test
    public void testHacerPizza() {
        System.out.println("hacerPizza");
        Pizza pizza = null;
        Restaurante instance = new Restaurante();
        try{
            instance.hacerPizza(pizza);
        }
        catch(Exception e){
            System.out.println("Exitoso");
        }
    }
    
    @Test
    public void testHacerPizzaNula() {
        System.out.println("hacerPizza");
        Pizza pizza = new Hawaiana();
        Restaurante instance = new Restaurante();
        try{
            int resultado = instance.hacerPizza(pizza);
            assertEquals(1, resultado, 0);
        }
        catch(Exception e){
            System.out.println("No exitoso");
            fail("No exitoso");
        }
    }
    
    @Test
    public void probandoPizzaMexicana(){
        System.out.println("haciendo Pizza mexicana");
        Pizza pizza = new Mexicana();
        Restaurante instance = new Restaurante();
        
        try{
            int resultado = instance.hacerPizza(pizza);
            assertEquals(1, resultado, 0);
        }
        catch(Exception e){
            System.out.println("Es exitoso ya que no aceptamos pizza mexicana");
        }
    }
    
    //Mocks
    public class Mexicana extends Pizza{

        @Override
        int hacerPizza() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
